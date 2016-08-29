package com.kimboo.portafolioapp.ui.skills.presenter;

import com.kimboo.portafolioapp.model.Skill;
import com.kimboo.portafolioapp.net.service.SkillService;
import com.kimboo.portafolioapp.net.subscribers.SkillsSubscriber;
import com.kimboo.portafolioapp.ui.skills.view.SkillsFragment;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;

import java.util.List;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Agustin Tomas Larghi on 30/07/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public class SkillsPresenter extends DefaultSupportFragmentLightCycle<SkillsFragment> {



    //region Variables declaration
    @Inject
    SkillService skillService;
    SkillsFragment skillsFragment;
    //endregion

    //region Subscribers
    protected SkillsSubscriber skillsSubscriber = new SkillsSubscriber() {
        @Override
        public void onSkillsReceived(List<Skill> skills) {
            skillsFragment.loadSkillsList(skills);
        }
    };
    //endregion

    @Inject
    public SkillsPresenter() {
        //Default empty constructor
    }

    @Override
    public void onResume(SkillsFragment fragment) {
        super.onResume(fragment);
        this.skillsFragment = fragment;
        skillService.getSkills()
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(skillsSubscriber);
    }

    //region Presenter-View Interface
    public static interface Skills {
        void loadSkillsList(List<Skill> skills);
    }
    //endregion
}
