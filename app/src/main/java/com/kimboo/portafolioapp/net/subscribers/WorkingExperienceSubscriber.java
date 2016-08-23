package com.kimboo.portafolioapp.net.subscribers;

import com.kimboo.portafolioapp.model.WorkExperience;

import java.util.List;

import rx.Subscriber;

/**
 * Created by Agustin Tomas Larghi on 21/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public abstract class WorkingExperienceSubscriber extends Subscriber<List<WorkExperience>> {

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onNext(List<WorkExperience> workExperienceCollection) {
        onWorkingExperienceReceived(workExperienceCollection);
    }

    public void onWorkingExperienceReceived(List<WorkExperience> workExperienceCollection) {
        //Empty by default. Optional to override
    }
}
