package com.emedinaa.peruvianmusic.data;

import android.util.Log;

import com.emedinaa.peruvianmusic.data.model.BaseResponse;
import com.emedinaa.peruvianmusic.data.model.DanceEntity;
import com.emedinaa.peruvianmusic.data.rest.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by emedinaa on 26/03/17.
 */

public class DefaultDataProvider implements DataProvider {

    private static final String TAG = "DefaultDataProvider";
    private final String ERROR_MESSAGE= "Ocurrió un error";
    private final String PROD_FLAVOR= "prod";

    @Override
    public void getDances(final StorageCallback storageCallback) {
        Call<BaseResponse> call = null;
        String buildtype = BuildConfig.BUILD_TYPE.toString();
        String flavor = BuildConfig.FLAVOR.toString();

        Log.v(TAG, "buildType "+buildtype);
        Log.v(TAG, "flavor "+flavor);

        if(flavor.equals(PROD_FLAVOR)){
            call=ApiClient.getDancesApiClient().dances();
        }else{
            call=ApiClient.getDevDancesApiClient().dances();
        }

        call.enqueue(new Callback<BaseResponse>() {
            @Override
            public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                if (response.isSuccessful()) {
                    BaseResponse recipesResponse= response.body();
                    if(recipesResponse!=null){
                        List<DanceEntity> danceEntityList= recipesResponse.getData();
                        storageCallback.onSuccess(danceEntityList);
                    }else{
                        storageCallback.onFailure(new Exception(ERROR_MESSAGE));
                    }

                } else {
                    storageCallback.onFailure(new Exception(ERROR_MESSAGE));
                }
            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {
                String json = "Error ";
                try {
                    json = new StringBuffer().append(t.getMessage()).toString();
                } catch (NullPointerException e) {
                }

                storageCallback.onFailure(new Exception(json));
            }
        });
    }
}
