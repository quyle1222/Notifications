package com.example.notifications.repository;

import androidx.lifecycle.MutableLiveData;

import com.example.notifications.model.MessageBody;
import com.example.notifications.model.PostResults;
import com.example.notifications.retrofit.ApiRequest;
import com.example.notifications.retrofit.RetrofitRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {
    private ApiRequest apiRequest;

    public Repository() {
        apiRequest = RetrofitRequest.getRetrofitInstance().create(ApiRequest.class);
    }

    public MutableLiveData<PostResults> postListUser(MessageBody messageBody) {

        final MutableLiveData<PostResults> data = new MutableLiveData<>();
        apiRequest.postMessage(messageBody).enqueue(new Callback<PostResults>() {
            @Override
            public void onResponse(Call<PostResults> call, Response<PostResults> response) {
                if (response.body() != null) {
                    data.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<PostResults> call, Throwable t) {
                data.setValue(null);
            }
        });
        return data;
    }
}
