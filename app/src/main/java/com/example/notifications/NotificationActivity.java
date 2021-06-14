package com.example.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NotificationActivity extends AppCompatActivity {

    TextView txtNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        txtNotification = findViewById(R.id.txtNotification);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            txtNotification.setText(intent.getExtras().getString("Messenger"));
        }
    }
}