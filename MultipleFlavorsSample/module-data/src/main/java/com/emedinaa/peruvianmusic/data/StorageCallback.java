package com.emedinaa.peruvianmusic.data;

import com.emedinaa.peruvianmusic.data.model.DanceEntity;

import java.util.List;

/**
 * Created by emedinaa on 26/03/17.
 */

public interface StorageCallback {

    void onSuccess(Object object);
    void onFailure(Exception exception);
}
