package com.emedinaa.peruvianmusic.data.rest;

import com.emedinaa.peruvianmusic.data.model.DanceResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by emedinaa on 26/03/17.
 */

public interface DevDancesEndPoints {

    //http://www.mocky.io/v2/58d873670f00009517dcc6b6
    @GET("/v2/58d873670f00009517dcc6b6")
    Call<DanceResponse> dances();
}
