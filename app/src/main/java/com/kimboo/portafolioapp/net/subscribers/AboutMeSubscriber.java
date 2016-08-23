package com.kimboo.portafolioapp.net.subscribers;

import com.kimboo.portafolioapp.model.Me;

import rx.Subscriber;

/**
 * Created by Agustin Tomas Larghi on 21/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public abstract class AboutMeSubscriber extends Subscriber<Me> {

    @Override
    public void onCompleted() {
        //Empty by default. Optional to override
    }

    @Override
    public void onError(Throwable e) {
        //Empty by default. Optional to override
    }

    @Override
    public void onNext(Me me) {
        onAboutMeReceived(me);
    }

    public void onAboutMeReceived(Me me) {
        //Empty by default. Optional to override
    }
}
