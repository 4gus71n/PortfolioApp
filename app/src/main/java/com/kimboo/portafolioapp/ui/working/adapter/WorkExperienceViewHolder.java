package com.kimboo.portafolioapp.ui.working.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.kimboo.portafolioapp.R;
import com.kimboo.portafolioapp.model.WorkExperience;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Agustin Tomas Larghi on 23/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public class WorkExperienceViewHolder extends RecyclerView.ViewHolder {
    //region View variables declaration
    @BindView(R.id.view_holder_working_experience_description)
    TextView mDescriptionTextView;
    @BindView(R.id.view_holder_working_experience_from)
    TextView mFromTextView;
    @BindView(R.id.view_holder_working_experience_until)
    TextView mUntilTextView;
    @BindView(R.id.view_holder_working_experience_gain_exp)
    TextView mGainTextView;
    @BindView(R.id.view_holder_working_experience_title)
    TextView mTitleTextView;
    //endregion


    public WorkExperienceViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void loadView(WorkExperience workExperience) {
        mDescriptionTextView.setText(workExperience.getGeneralDescription());
        mTitleTextView.setText(workExperience.getTitle());
        mGainTextView.setText(workExperience.getGainExperience());
        mFromTextView.setText(workExperience.getFromDate());
        mUntilTextView.setText(workExperience.getToDate());
    }
}
