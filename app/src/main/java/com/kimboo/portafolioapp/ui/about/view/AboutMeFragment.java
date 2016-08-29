package com.kimboo.portafolioapp.ui.about.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kimboo.portafolioapp.PortfolioApp;
import com.kimboo.portafolioapp.R;
import com.kimboo.portafolioapp.model.Me;
import com.kimboo.portafolioapp.ui.about.presenter.AboutMePresenter;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleSupportFragment;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Agustin Tomas Larghi on 21/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public class AboutMeFragment extends LightCycleSupportFragment<AboutMeFragment> implements AboutMePresenter.AboutMe {

    //region AboutMe implementation
    @Override
    public void loadAboutMe(Me me) {
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(me.getHtmlDescription(),Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(me.getHtmlDescription());
        }
        mDescriptionTextView.setText(result);
    }
    //endregion

    //region View variables declaration
    @BindView(R.id.about_me_fragment_text_view_description)
    TextView mDescriptionTextView;
    //endregion

    //region Variables declaration
    @Inject
    @LightCycle
    AboutMePresenter aboutMe;
    //endregion

    //region Constructors declarations
    public AboutMeFragment() {
        PortfolioApp.getObjectGraph().inject(this);
    }

    public static AboutMeFragment newInstance() {
        AboutMeFragment fragment = new AboutMeFragment();
        return fragment;
    }
    //endregion


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(false);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_me, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

}
