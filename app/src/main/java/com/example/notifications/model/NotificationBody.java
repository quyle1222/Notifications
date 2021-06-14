package com.example.notifications.model;

public class NotificationBody {
    private String body;
    private String title;

    public NotificationBody(String body, String title) {
        this.body = body;
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "NotificationBody{" +
                "body='" + body + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
