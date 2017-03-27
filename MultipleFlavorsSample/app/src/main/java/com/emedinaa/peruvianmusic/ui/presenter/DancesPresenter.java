package com.emedinaa.peruvianmusic.ui.presenter;

import com.emedinaa.peruvianmusic.data.StorageCallback;
import com.emedinaa.peruvianmusic.model.Dance;
import com.emedinaa.peruvianmusic.model.interactor.DancesInteractor;
import com.emedinaa.peruvianmusic.ui.view.DancesContrat;

import java.util.List;

/**
 * Created by emedinaa on 26/03/17.
 */

public class DancesPresenter {

    private final DancesContrat.View dancesView;
    private final DancesInteractor dancesInteractor;

    public DancesPresenter(DancesContrat.View dancesView, DancesInteractor dancesInteractor) {
        this.dancesView = dancesView;
        this.dancesInteractor = dancesInteractor;
    }

    private StorageCallback storageCallback= new StorageCallback() {
        @Override
        public void onSuccess(Object object) {
            dancesView.hideLoading();
            dancesView.renderDances((List<Dance>)object);
        }

        @Override
        public void onFailure(Exception exception) {
            dancesView.hideLoading();
            dancesView.showMessage(exception.getMessage());
        }
    };

    public void getDances(){
        dancesView.showLoading();
        dancesInteractor.getDances(storageCallback);
    }
}
