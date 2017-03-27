package com.emedinaa.peruvianmusic.model.interactor;

import com.emedinaa.peruvianmusic.data.DataProvider;
import com.emedinaa.peruvianmusic.data.StorageCallback;
import com.emedinaa.peruvianmusic.data.model.DanceEntity;
import com.emedinaa.peruvianmusic.model.mapper.DanceMapper;

import java.util.List;

/**
 * Created by emedinaa on 26/03/17.
 */

public class DancesInteractor {

    private final DataProvider dataProvider;
    private final DanceMapper danceMapper;

    public DancesInteractor(DataProvider dataProvider, DanceMapper danceMapper) {
        this.dataProvider = dataProvider;
        this.danceMapper = danceMapper;
    }

    public void getDances(final StorageCallback storageCallback){
        dataProvider.getDances(new StorageCallback() {
            @Override
            public void onSuccess(Object object) {
                List<DanceEntity> danceEntities=(List<DanceEntity>)(object);
                storageCallback.onSuccess(danceMapper.transform(danceEntities));
            }

            @Override
            public void onFailure(Exception exception) {
                storageCallback.onFailure(exception);
            }
        });
    }
}
