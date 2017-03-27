package com.emedinaa.peruvianmusic;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.emedinaa.peruvianmusic.data.DefaultDataProvider;
import com.emedinaa.peruvianmusic.model.Dance;
import com.emedinaa.peruvianmusic.model.interactor.DancesInteractor;
import com.emedinaa.peruvianmusic.model.mapper.DanceMapper;
import com.emedinaa.peruvianmusic.ui.OnPageListener;
import com.emedinaa.peruvianmusic.ui.adapter.DancePageAdapter;
import com.emedinaa.peruvianmusic.ui.presenter.DancesPresenter;
import com.emedinaa.peruvianmusic.ui.view.DancesContrat;

import java.util.List;

public class MainActivity extends AppCompatActivity implements OnPageListener,DancesContrat.View {

    private static final String TAG ="MainActivity" ;
    private DancePageAdapter dancePageAdapter;
    private ViewPager vpagerDance;

    private DancesPresenter dancesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        injecPresenter();
        ui();

        getPeruvianDances();
    }

    private void getPeruvianDances(){
        dancesPresenter.getDances();
    }
    private void ui() {
        vpagerDance= (ViewPager) findViewById(R.id.vpagerDance);
    }

    private void injecPresenter() {
        DancesInteractor dancesInteractor= new DancesInteractor(new DefaultDataProvider(), new DanceMapper());
        DancesPresenter mDancesPresenter= new DancesPresenter(this,dancesInteractor);
        setPresenter(mDancesPresenter);
    }

    @Override
    public void renderDances(List<Dance> dances) {
        dancePageAdapter= new DancePageAdapter(getSupportFragmentManager(),dances);
        vpagerDance.setAdapter(dancePageAdapter);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void setPresenter(DancesPresenter presenter) {
        this.dancesPresenter=presenter;
    }
}
