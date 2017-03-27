package com.emedinaa.peruvianmusic.data.model;

import java.util.List;

/**
 * Created by emedinaa on 26/03/17.
 */

public class BaseResponse {
    private int status;
    private List<DanceEntity> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DanceEntity> getData() {
        return data;
    }

    public void setData(List<DanceEntity> data) {
        this.data = data;
    }
}
