package com.kimboo.portafolioapp.ui.working.presenter;

import com.kimboo.portafolioapp.model.WorkExperience;
import com.kimboo.portafolioapp.net.service.WorkingExperienceService;
import com.kimboo.portafolioapp.net.subscribers.WorkingExperienceSubscriber;
import com.kimboo.portafolioapp.ui.working.view.WorkingExperienceFragment;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;

import java.util.List;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Agustin Tomas Larghi on 30/07/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public class WorkingExperiencePresenter extends DefaultSupportFragmentLightCycle<WorkingExperienceFragment> {

    //region Variables declaration
    @Inject
    WorkingExperienceService workingExperienceService;
    WorkingExperienceFragment workingExperienceFragment;
    //endregion

    //region Subscribers
    protected WorkingExperienceSubscriber workingExperienceSubscriber = new WorkingExperienceSubscriber() {
        @Override
        public void onWorkingExperienceReceived(List<WorkExperience> workExperienceCollection) {
            workingExperienceFragment.loadWorkingExperienceList(workExperienceCollection);
        }
    };
    //endregion

    @Inject
    public WorkingExperiencePresenter() {
        //Default empty constructor
    }

    @Override
    public void onResume(WorkingExperienceFragment fragment) {
        super.onResume(fragment);
        this.workingExperienceFragment = fragment;
        workingExperienceService.getWorkingExperience()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(workingExperienceSubscriber);
    }

}
