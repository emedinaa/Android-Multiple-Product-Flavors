package com.emedinaa.peruvianmusic.data.rest;

import com.emedinaa.peruvianmusic.data.BuildConfig;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by emedinaa on 26/03/17.
 */

public class ApiClient {

    //private static final String API_BASE_URL="http://www.mocky.io/v2";
    private static final String API_BASE_URL= BuildConfig.BASE_URL;

    private static DancesEndPoints dancesEndPoints;
    private static DevDancesEndPoints devDancesEndPoints;
    private static OkHttpClient.Builder httpClient;

    public static DancesEndPoints getDancesApiClient() {

        if (dancesEndPoints == null) {

            Retrofit.Builder builder =new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());
            httpClient =new OkHttpClient.Builder();
            httpClient.addInterceptor(interceptor());

            Retrofit retrofit = builder.client(httpClient.build()).build();
            dancesEndPoints = retrofit.create(DancesEndPoints.class);
        }
        return dancesEndPoints;
    }

    public static DevDancesEndPoints getDevDancesApiClient() {

        if (devDancesEndPoints == null) {

            Retrofit.Builder builder =new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());
            httpClient =new OkHttpClient.Builder();
            httpClient.addInterceptor(interceptor());

            Retrofit retrofit = builder.client(httpClient.build()).build();
            devDancesEndPoints = retrofit.create(DevDancesEndPoints.class);
        }
        return devDancesEndPoints;
    }

    private  static HttpLoggingInterceptor interceptor(){
        HttpLoggingInterceptor httpLoggingInterceptor= new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }
}
