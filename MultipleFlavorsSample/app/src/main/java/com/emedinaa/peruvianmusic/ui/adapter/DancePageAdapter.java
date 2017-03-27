package com.emedinaa.peruvianmusic.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.emedinaa.peruvianmusic.model.Dance;
import com.emedinaa.peruvianmusic.ui.PageFragment;

import java.util.List;

/**
 * Created by emedinaa on 26/03/17.
 */

public class DancePageAdapter extends FragmentStatePagerAdapter {
    private final List<Dance> dances;

    public DancePageAdapter(FragmentManager fm,List<Dance> dances) {
        super(fm);
        this.dances=dances;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(dances.get(position));
    }

    @Override
    public int getCount() {
        return dances.size();
    }
}
