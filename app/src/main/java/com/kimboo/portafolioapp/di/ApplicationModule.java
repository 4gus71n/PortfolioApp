package com.kimboo.portafolioapp.di;

/**
 * Created by Agustin Tomas Larghi on 02/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 *
 * <ul>
 *  <li>
 *      This module provides a {@link Context}.
 *  </li>
 *  <li>
 *      This module provides a {@link LayoutInflater} so we can inflate easly any view such as
 *      ViewHolders.
 *  </li>
 * </ul>
 *
 */

import android.content.Context;
import android.view.LayoutInflater;

import com.kimboo.portafolioapp.ui.main.view.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module(injects = {MainActivity.class},
        library = true)
public class ApplicationModule {

    private final Context mContext;

    public ApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    LayoutInflater provideInflater() {
        return LayoutInflater.from(mContext);
    }

}
