package com.kimboo.portafolioapp.ui.skills.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.kimboo.portafolioapp.PortfolioApp;
import com.kimboo.portafolioapp.R;
import com.kimboo.portafolioapp.model.Skill;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Agustin on 28/07/2016.
 */
public class SkillsAdapter extends RecyclerView.Adapter<SkillViewHolder> {
    @Inject
    LayoutInflater inflater;

    public SkillsAdapter() {
        PortfolioApp.getObjectGraph().inject(this);
    }

    private ArrayList<Skill> mSkills = new ArrayList<>();

    @Override
    public SkillViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SkillViewHolder(inflater.inflate(R.layout.view_holder_skill_item, parent, false));
    }

    @Override
    public void onBindViewHolder(SkillViewHolder holder, int position) {
        holder.loadView(mSkills.get(position));
    }

    @Override
    public int getItemCount() {
        return mSkills.size();
    }

    /**
     * Loads a collection of Skill in the current adapter. Removes any old one.
     * @param skills
     */
    public void setSkills(List<Skill> skills) {
        mSkills.clear();
        mSkills.addAll(skills);
        notifyDataSetChanged();
    }
}
