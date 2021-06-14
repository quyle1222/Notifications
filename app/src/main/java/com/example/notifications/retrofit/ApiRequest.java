package com.example.notifications.retrofit;

import com.example.notifications.model.MessageBody;
import com.example.notifications.model.PostResults;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiRequest {

    //https://fcm.googleapis.com/fcm/send
    @Headers("Authorization: key=AAAAu9wSdbs:APA91bFtD77ZMsJDAYkMpKqcggjemycwKSWX8mzQSNdpeGtyoW0HV4ad3L4cuv_aHtyuSh_q7kdCWgcY2361g5DQZ_B1lGi8APTgOJ9xQO49ubyJSiY-qIg1JXDEoAouuWcbihvafQ6V")
    @POST("fcm/send")
    Call<PostResults> postMessage(@Body MessageBody messageBody);


}
