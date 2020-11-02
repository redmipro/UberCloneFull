package com.optic.uberclone.providers;

import com.optic.uberclone.models.FCMBody;
import com.optic.uberclone.models.FCMResponse;
import com.optic.uberclone.retrofit.IFCMApi;
import com.optic.uberclone.retrofit.RetrofitClient;

import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider() {
    }

    public Call<FCMResponse> sendNotification(FCMBody body) {
        return RetrofitClient.getClientObject(url).create(IFCMApi.class).send(body);
    }
}
