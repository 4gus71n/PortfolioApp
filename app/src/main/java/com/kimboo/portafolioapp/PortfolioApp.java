package com.kimboo.portafolioapp;

/**
 * Created by AgustinTomas on 28/07/2016.
 */
import android.app.Application;

import com.kimboo.portafolioapp.di.AboutMeModule;
import com.kimboo.portafolioapp.di.ApplicationModule;
import com.kimboo.portafolioapp.di.SkillsModule;
import com.kimboo.portafolioapp.di.WorkingExperienceModule;

import dagger.ObjectGraph;

public class PortfolioApp extends Application {

    private static PortfolioApp instance;

    protected ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(new ApplicationModule(getBaseContext()),
                new SkillsModule(),
                new AboutMeModule(),
                new WorkingExperienceModule());
        instance = this;
    }

    public static ObjectGraph getObjectGraph() {
        if (instance == null || instance.objectGraph == null) {
            throw new IllegalStateException("Cannot access the app graph before the application has been created");
        }
        return instance.objectGraph;
    }
}
