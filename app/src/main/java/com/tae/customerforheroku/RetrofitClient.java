package com.tae.customerforheroku;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit = null;

    public static Retrofit getCustomer(String url){
        if(retrofit==null){
            retrofit =  new Retrofit.Builder().baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return retrofit;
        } else return retrofit;
    }


}