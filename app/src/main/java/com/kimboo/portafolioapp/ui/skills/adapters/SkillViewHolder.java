package com.kimboo.portafolioapp.ui.skills.adapters;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

import com.kimboo.portafolioapp.R;
import com.kimboo.portafolioapp.model.Skill;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Agustin on 28/07/2016.
 */
public class SkillViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.view_holder_skill_item_title)
    TextView mTitleLabel;
    @BindView(R.id.view_holder_skill_item_text)
    TextView mTextLabel;

    public SkillViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void loadView(Skill skill) {
        mTitleLabel.setText(skill.getTextLabel());
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(skill.getTextDescription(), Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(skill.getTextDescription());
        }
        mTextLabel.setText(result);
    }
}
