package com.kimboo.portafolioapp.ui.working.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.kimboo.portafolioapp.PortfolioApp;
import com.kimboo.portafolioapp.R;
import com.kimboo.portafolioapp.model.WorkExperience;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Agustin Tomas Larghi on 23/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public class WorkingExperienceAdapter  extends RecyclerView.Adapter<WorkExperienceViewHolder> {
    @Inject
    LayoutInflater inflater;

    public WorkingExperienceAdapter() {
        PortfolioApp.getObjectGraph().inject(this);
    }

    private ArrayList<WorkExperience> mWorkingExperienceList = new ArrayList<>();

    @Override
    public WorkExperienceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new WorkExperienceViewHolder(inflater.inflate(R.layout.view_holder_working_experience_item, parent, false));
    }

    @Override
    public void onBindViewHolder(WorkExperienceViewHolder holder, int position) {
        holder.loadView(mWorkingExperienceList.get(position));
    }

    @Override
    public int getItemCount() {
        return mWorkingExperienceList.size();
    }

    /**
     * Loads a collection of {@link WorkExperience} in the current adapter. Removes any old one.
     *
     * @param workExperiencesList
     */
    public void setWorkExperienceList(List<WorkExperience> workExperiencesList) {
        mWorkingExperienceList.clear();
        mWorkingExperienceList.addAll(workExperiencesList);
        notifyDataSetChanged();
    }
}