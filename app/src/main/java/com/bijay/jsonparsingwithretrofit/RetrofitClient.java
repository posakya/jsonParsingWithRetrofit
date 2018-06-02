package com.bijay.jsonparsingwithretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Bijay on 6/2/2018.
 */

public class RetrofitClient {

    public static Retrofit retrofit = null;

    public static Retrofit getRetrofit(){

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://vedisapp.berlin-webdesign-agentur.de/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}

/*
 public static Retrofit getMenuResponse(){

        if (retrofit == null){

            retrofit = new Retrofit.Builder()

                    .baseUrl("http://192.168.2.1/zappfood/")

                    .addConverterFactory(GsonConverterFactory.create())

                    .build();

        }

        return retrofit;

    }
 */