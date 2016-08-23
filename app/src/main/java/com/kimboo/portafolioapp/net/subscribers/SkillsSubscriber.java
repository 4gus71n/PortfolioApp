package com.kimboo.portafolioapp.net.subscribers;

import com.kimboo.portafolioapp.model.Skill;

import java.util.List;

import rx.Subscriber;

/**
 * Created by Agustin Tomas Larghi on 21/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public abstract class SkillsSubscriber extends Subscriber<List<Skill>> {

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onNext(List<Skill> skills) {
        onSkillsReceived(skills);
    }

    public void onSkillsReceived(List<Skill> skills) {
        //Empty by default. Optional to override
    }
}
