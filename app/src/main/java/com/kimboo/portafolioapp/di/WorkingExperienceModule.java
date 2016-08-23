package com.kimboo.portafolioapp.di;

/**
 * Created by Agustin Tomas Larghi on 02/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 *
 * <ul>
 *  <li>
 *      This module depends on {@link com.kimboo.portafolioapp.di.ApplicationModule}
 *  </li>
 *  <li>
 *      This module provides a {@link com.kimboo.portafolioapp.net.service.WorkingExperienceService} to be use in any Fragment or Activity.
 *  </li>
 * </ul>
 *
 */

import com.kimboo.portafolioapp.BuildConfig;
import com.kimboo.portafolioapp.net.service.ServiceFactory;
import com.kimboo.portafolioapp.net.service.WorkingExperienceService;
import com.kimboo.portafolioapp.ui.working.adapter.WorkingExperienceAdapter;
import com.kimboo.portafolioapp.ui.working.presenter.WorkingExperiencePresenter;
import com.kimboo.portafolioapp.ui.working.view.WorkingExperienceFragment;

import dagger.Module;
import dagger.Provides;

@Module(includes = ApplicationModule.class,
        injects = {WorkingExperienceFragment.class, WorkingExperiencePresenter.class, WorkingExperienceAdapter.class})
public class WorkingExperienceModule {

    @Provides
    WorkingExperienceService provideWorkingExperienceService() {
        return ServiceFactory.createRetrofitService(WorkingExperienceService.class, BuildConfig.BASE_HOST);
    }

}
