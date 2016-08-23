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
 *      This module provides a {@link SkillService} to be use in any Fragment or Activity.
 *  </li>
 * </ul>
 *
 */

import com.kimboo.portafolioapp.BuildConfig;
import com.kimboo.portafolioapp.net.service.ServiceFactory;
import com.kimboo.portafolioapp.net.service.SkillService;
import com.kimboo.portafolioapp.ui.skills.adapters.SkillsAdapter;
import com.kimboo.portafolioapp.ui.skills.presenter.SkillsPresenter;
import com.kimboo.portafolioapp.ui.skills.view.SkillsFragment;

import dagger.Module;
import dagger.Provides;

@Module(includes = ApplicationModule.class,
        injects = {SkillsFragment.class, SkillsPresenter.class, SkillsAdapter.class})
public class SkillsModule {

    @Provides
    SkillService provideSkillService() {
        return ServiceFactory.createRetrofitService(SkillService.class, BuildConfig.BASE_HOST);
    }

}
