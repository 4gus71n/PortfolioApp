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
 *      This module provides a {@link com.kimboo.portafolioapp.net.service.AboutMeService} to be use in any Fragment or Activity.
 *  </li>
 * </ul>
 *
 */

import com.kimboo.portafolioapp.BuildConfig;
import com.kimboo.portafolioapp.net.service.AboutMeService;
import com.kimboo.portafolioapp.net.service.ServiceFactory;
import com.kimboo.portafolioapp.ui.about.presenter.AboutMePresenter;
import com.kimboo.portafolioapp.ui.about.view.AboutMeFragment;

import dagger.Module;
import dagger.Provides;

@Module(includes = ApplicationModule.class,
        injects = {AboutMeFragment.class, AboutMePresenter.class})
public class AboutMeModule {

    @Provides
    AboutMeService provideAboutMeService() {
        return ServiceFactory.createRetrofitService(AboutMeService.class, BuildConfig.BASE_HOST);
    }

}
