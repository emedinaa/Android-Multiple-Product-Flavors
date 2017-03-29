package com.emedinaa.peruvianmusic.data.model;

import java.util.List;

/**
 * Created by eduardomedina on 29/03/17.
 */

public class DanceResponse extends BaseResponse {

    private List<DanceEntity> data;

    public List<DanceEntity> getData() {
        return data;
    }

    public void setData(List<DanceEntity> data) {
        this.data = data;
    }
}
