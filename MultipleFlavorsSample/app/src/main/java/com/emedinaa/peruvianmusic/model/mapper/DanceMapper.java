package com.emedinaa.peruvianmusic.model.mapper;

import com.emedinaa.peruvianmusic.data.model.DanceEntity;
import com.emedinaa.peruvianmusic.model.Dance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emedinaa on 26/03/17.
 */

public class DanceMapper {

    public List<Dance> transform(List<DanceEntity> danceEntityList){
        List<Dance> dances= new ArrayList<>();
        if(danceEntityList==null) return  dances;
        for (DanceEntity danceEntity:danceEntityList) {
            dances.add(transformEntity(danceEntity));
        }
        return dances;
    }

    private Dance transformEntity(DanceEntity danceEntity){
        Dance dance= new Dance();
        if(danceEntity==null) return dance;

        dance.setId(danceEntity.getId());
        dance.setName(danceEntity.getName());
        dance.setDescription(danceEntity.getDescription());
        dance.setImg(danceEntity.getImg());

        return dance;
    }
}
