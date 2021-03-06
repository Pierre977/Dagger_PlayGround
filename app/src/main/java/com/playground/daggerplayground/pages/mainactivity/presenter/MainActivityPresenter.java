package com.playground.daggerplayground.pages.mainactivity.presenter;

import com.playground.daggerplayground.common.presenter.Presenter;
import com.playground.daggerplayground.pages.mainactivity.model.MainActivityModel;

/**
 * Presenter of the MainActivity.
 * Created by petnagy on 2017. 05. 03..
 */

public interface MainActivityPresenter extends Presenter {

    void showModel(MainActivityModel model);
}
