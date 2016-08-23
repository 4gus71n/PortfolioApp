package com.kimboo.portafolioapp.ui.skills.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kimboo.portafolioapp.PortfolioApp;
import com.kimboo.portafolioapp.R;
import com.kimboo.portafolioapp.model.Skill;
import com.kimboo.portafolioapp.ui.skills.adapters.SkillsAdapter;
import com.kimboo.portafolioapp.ui.skills.presenter.Skills;
import com.kimboo.portafolioapp.ui.skills.presenter.SkillsPresenter;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleSupportFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SkillsFragment extends LightCycleSupportFragment<SkillsFragment> implements
        Skills {

    //region Skills implementation
    @Override
    public void loadSkillsList(List<Skill> skills) {
        mSkillsAdapter.setSkills(skills);
    }
    //endregion

    //region Views declaration
    @BindView(R.id.skills_fragment_recycler_view) RecyclerView mSkillsRecyclerView;
    //endregion

    //region Variables declaration
    private SkillsAdapter mSkillsAdapter;
    @Inject @LightCycle SkillsPresenter skillsPresenter;
    //endregion

    //region Constructors declarations
    public SkillsFragment() {
        PortfolioApp.getObjectGraph().inject(this);
    }

    public static SkillsFragment newInstance() {
        return new SkillsFragment();
    }
    //endregion

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_skills, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ButterKnife.bind(this, view);
        mSkillsAdapter = new SkillsAdapter();
        mSkillsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        mSkillsRecyclerView.setAdapter(mSkillsAdapter);
    }

}
