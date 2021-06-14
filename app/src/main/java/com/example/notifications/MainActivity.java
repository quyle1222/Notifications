package com.example.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.notifications.viewmodel.ResultViewModel;
import com.example.notifications.viewmodel.SendMessageViewModel;

public class
MainActivity extends AppCompatActivity {
    Button btnSend;
    EditText edtMessage;
    TextView txtSuccess;
    SendMessageViewModel sendMessageViewModel;
    ResultViewModel resultViewModel;
    MyBroadcastReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        txtSuccess.setText(resultViewModel.getMessenger());
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessageViewModel.setMessenger(edtMessage.getText().toString().trim());
                sendMessage();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.my.app.onMessageReceived");
        receiver = new MyBroadcastReceiver();
        registerReceiver(receiver, intentFilter);
    }

    private void initView() {
        btnSend = findViewById(R.id.btnSend);
        edtMessage = findViewById(R.id.edtMessage);
        txtSuccess = findViewById(R.id.txtSuccess);
        sendMessageViewModel = new ViewModelProvider(this).get(SendMessageViewModel.class);
        resultViewModel = new ViewModelProvider(this).get(ResultViewModel.class);
    }

    private void sendMessage() {
        sendMessageViewModel.postMessage().observe(this, postResults -> {
            if (postResults != null && postResults.getSuccess() == 1) {
                txtSuccess.setText("Send messenger complete");
                resultViewModel.setMessenger("Send messenger complete");
            } else {
                txtSuccess.setText("Send message fail");
                resultViewModel.setMessenger("Send message fail");
            }
        });
    }

    private class MyBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            resultViewModel.setMessenger(intent.getExtras().getString("extra"));
            txtSuccess.setText(resultViewModel.getMessenger());
        }
    }
}