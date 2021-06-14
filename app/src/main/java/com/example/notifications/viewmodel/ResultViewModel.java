package com.example.notifications.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class ResultViewModel extends AndroidViewModel {
    String messenger;

    public ResultViewModel(@NonNull Application application) {
        super(application);

    }

    public String getMessenger() {
        return messenger;
    }

    public void setMessenger(String messenger) {
        this.messenger = messenger;
    }

}
