package com.example.notifications.model;

import com.google.gson.annotations.SerializedName;

public class PostResults {
    @SerializedName("success")
    private int success;

    public PostResults(int success) {
        this.success = success;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "postResults{" +
                "success=" + success +
                '}';
    }
}
