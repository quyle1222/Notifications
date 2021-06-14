package com.example.notifications.model;

public class DataBody {
    private String body;
    private String title;
    private String name;

    public DataBody(String body, String title, String name) {
        this.body = body;
        this.title = title;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
