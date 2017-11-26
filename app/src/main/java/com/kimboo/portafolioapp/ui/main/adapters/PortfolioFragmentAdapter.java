package com.kimboo.portafolioapp.ui.main.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.kimboo.portafolioapp.R;
import com.kimboo.portafolioapp.ui.about.view.AboutMeFragment;
import com.kimboo.portafolioapp.ui.skills.view.SkillsFragment;
import com.kimboo.portafolioapp.ui.working.view.WorkingExperienceFragment;

/**
 * Created by Agustin Tomas Larghi on 21/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public class PortfolioFragmentAdapter extends FragmentStatePagerAdapter {

    //TODO Get rid of this an use dependency injection instead
    private final Context context;

    public PortfolioFragmentAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.context = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.about_me_fragment_title);
            case 1:
                return context.getString(R.string.skills_fragment_title);
            case 2:
                return context.getString(R.string.working_experience_fragment_title);
        }
        return "";
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return AboutMeFragment.newInstance();
            case 1:
                return SkillsFragment.newInstance();
            case 2:
                return WorkingExperienceFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
