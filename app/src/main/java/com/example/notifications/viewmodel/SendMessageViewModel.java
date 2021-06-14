package com.example.notifications.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.notifications.model.DataBody;
import com.example.notifications.model.MessageBody;
import com.example.notifications.model.NotificationBody;
import com.example.notifications.model.PostResults;
import com.example.notifications.repository.Repository;

public class SendMessageViewModel extends AndroidViewModel {
    private Repository repository;
    private MutableLiveData<PostResults> postResults;
    MessageBody messageBody;
    String token = "cQGvz_aQS3WTP5Vaw6KaVD:APA91bFLMOLOkY6JlYRwSxYYpPZNSYxJHV7AjjSdpH5OoaYLycDFqqqfwSJXXTsVjEXdsM7gI9bp-yHx2PuHNrSkQzdyLKxUszvRcPUYnzMIhMgoI9K-57TTE5xmvOI3_PCQg1fZ2Btl";
    String messenger;
    NotificationBody notificationBody;
    DataBody dataBody;
    String collapse_key = "type_a";

    public SendMessageViewModel(@NonNull Application application) {
        super(application);
        repository = new Repository();
        notificationBody = new NotificationBody(messenger, "Notification");
        dataBody = new DataBody("Test Notification", "New Notifications", "Máy Thanh Tú");
    }

    public MutableLiveData<PostResults> postMessage() {
        messageBody = new MessageBody(token, collapse_key, notificationBody, dataBody);
        this.postResults = repository.postListUser(messageBody);
        return postResults;
    }

    public void setMessenger(String messenger) {
        this.messenger = messenger;
    }
}
