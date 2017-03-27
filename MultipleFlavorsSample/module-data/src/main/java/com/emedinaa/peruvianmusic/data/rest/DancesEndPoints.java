package com.emedinaa.peruvianmusic.data.rest;

import com.emedinaa.peruvianmusic.data.model.BaseResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by emedinaa on 26/03/17.
 */

public interface DancesEndPoints {

    @GET("/v2/58d51ffa100000b804d0b156")
    Call<BaseResponse> dances();
}
