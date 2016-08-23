package com.kimboo.portafolioapp.ui.about.presenter;

import com.kimboo.portafolioapp.model.Me;
import com.kimboo.portafolioapp.net.service.AboutMeService;
import com.kimboo.portafolioapp.net.subscribers.AboutMeSubscriber;
import com.kimboo.portafolioapp.ui.about.view.AboutMeFragment;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Agustin Tomas Larghi on 23/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public class AboutMePresenter extends DefaultSupportFragmentLightCycle<AboutMeFragment> {

    //region Variables declaration
    @Inject
    AboutMeService aboutMeService;
    AboutMeFragment aboutMeFragment;
    //endregion

    //region Subscribers
    protected AboutMeSubscriber aboutMeSubscriber = new AboutMeSubscriber() {
        @Override
        public void onAboutMeReceived(Me me) {
            aboutMeFragment.loadAboutMe(me);
        }
    };
    //endregion

    @Inject
    public AboutMePresenter() {
        //Default empty constructor
    }

    @Override
    public void onResume(AboutMeFragment fragment) {
        super.onResume(fragment);
        this.aboutMeFragment = fragment;
        aboutMeService.getAboutMe()
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(aboutMeSubscriber);
    }

}
