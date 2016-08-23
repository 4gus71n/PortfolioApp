package com.kimboo.portafolioapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by AgustinTomas on 28/07/2016.
 */
public class Skill {

    @SerializedName("text_id")
    String textId;
    @SerializedName("text_label")
    String textLabel;
    @SerializedName("text_description")
    String textDescription;

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getTextId() {
        return textId;
    }

    public void setTextId(String textId) {
        this.textId = textId;
    }

    public String getTextLabel() {
        return textLabel;
    }

    public void setTextLabel(String textLabel) {
        this.textLabel = textLabel;
    }
}
