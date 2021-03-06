package com.example.thenu.androidriderapp.Remote;

import com.example.thenu.androidriderapp.Model.FCMResponse;
import com.example.thenu.androidriderapp.Model.Sender;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {



    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAA-CiVOHU:APA91bGlrLy9GL543goCOqRLaTg63btWEyL0asf8xj5a150qH7lTc7WYbMqsIOBGOFAfMZ6zRR6hrYOb07DSgr6Nz0ELHG8_7hTnWVL1I0EzpIz25V25XCbtYrnPVeyod0jHjRLR-HbBttThntcA5PN133rnydbrpg"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
