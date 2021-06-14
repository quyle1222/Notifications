package com.example.notifications.model;

import com.google.gson.annotations.SerializedName;

public class MessageBody {
    @SerializedName("to")
    private String to;
    @SerializedName("collapse_key")
    private String collapse_key;
    @SerializedName("notification")
    private NotificationBody notification;
    @SerializedName("data")
    private DataBody data;

    public MessageBody(String to, String collapse_key, NotificationBody notification, DataBody data) {
        this.to = to;
        this.collapse_key = collapse_key;
        this.notification = notification;
        this.data = data;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCollapse_key() {
        return collapse_key;
    }

    public void setCollapse_key(String collapse_key) {
        this.collapse_key = collapse_key;
    }

    public NotificationBody getNotification() {
        return notification;
    }

    public void setNotification(NotificationBody notification) {
        this.notification = notification;
    }

    public DataBody getData() {
        return data;
    }

    public void setData(DataBody data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MessageBody{" +
                "to='" + to + '\'' +
                ", collapse_key='" + collapse_key + '\'' +
                ", notification=" + notification +
                ", data=" + data +
                '}';
    }
}
