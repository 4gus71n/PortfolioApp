package com.kimboo.portafolioapp.ui.working.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kimboo.portafolioapp.PortfolioApp;
import com.kimboo.portafolioapp.R;
import com.kimboo.portafolioapp.model.WorkExperience;
import com.kimboo.portafolioapp.ui.working.adapter.WorkingExperienceAdapter;
import com.kimboo.portafolioapp.ui.working.presenter.WorkingExperience;
import com.kimboo.portafolioapp.ui.working.presenter.WorkingExperiencePresenter;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleSupportFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Agustin Tomas Larghi on 21/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public class WorkingExperienceFragment extends LightCycleSupportFragment<WorkingExperienceFragment> implements
        WorkingExperience {

    //region WorkingExperience implementation
    @Override
    public void loadWorkingExperienceList(List<WorkExperience> workiWorkExperienceList) {
        mWorkingExperienceAdapter.setWorkExperienceList(workiWorkExperienceList);
    }
    //endregion

    //region Views declaration
    @BindView(R.id.working_experience_fragment_recycler_view)
    RecyclerView mWorkExperienceRecyclerView;
    //endregion

    //region Variables declaration
    private WorkingExperienceAdapter mWorkingExperienceAdapter;
    @Inject @LightCycle WorkingExperiencePresenter workingExperiencePresenter;
    //endregion

    //region Constructors declarations
    public WorkingExperienceFragment() {
        PortfolioApp.getObjectGraph().inject(this);
    }

    public static WorkingExperienceFragment newInstance() {
        return new WorkingExperienceFragment();
    }
    //endregion

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_working_experience, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ButterKnife.bind(this, view);
        mWorkingExperienceAdapter = new WorkingExperienceAdapter();
        mWorkExperienceRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        mWorkExperienceRecyclerView.setAdapter(mWorkingExperienceAdapter);
    }
}
