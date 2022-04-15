package com.example.covidcase.Retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private ApiEndpointInterface API;

    public RetrofitInstance(){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-mm-dd").create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiEndpointInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        API = retrofit.create(ApiEndpointInterface.class);
    }

    public ApiEndpointInterface getAPI(){
        return API;
    }
}
