package com.emedinaa.peruvianmusic.ui.view;

import com.emedinaa.peruvianmusic.model.Dance;
import com.emedinaa.peruvianmusic.ui.presenter.DancesPresenter;

import java.util.List;

/**
 * Created by emedinaa on 26/03/17.
 */

public interface DancesContrat {

    public interface View extends BaseView<DancesPresenter> {
        void renderDances(List<Dance> dances);
        void showLoading();
        void hideLoading();
        void showMessage(String message);
    }
}
