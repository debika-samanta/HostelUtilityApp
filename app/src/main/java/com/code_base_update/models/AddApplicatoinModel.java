package com.code_base_update.models;

import android.app.Application;

import com.code_base_update.DatabaseManager;
import com.code_base_update.beans.ApplicationBean;
import com.code_base_update.presenters.IApplicationPresenter;
import com.code_base_update.view.IApplicationView;

public class AddApplicatoinModel implements IApplicationPresenter{

    private IApplicationView iApplicationView;

    @Override
    public void attachView(IApplicationView view) {
        this.iApplicationView =view;
    }

    @Override
    public void detachView() {
        this.iApplicationView = null;
    }

    @Override
    public void saveApplication(ApplicationBean application) {
        new DatabaseManager().saveApplication(iApplicationView,application);
    }
}
