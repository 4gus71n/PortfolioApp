package com.kimboo.portafolioapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Agustin Tomas Larghi on 23/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public class WorkExperience {

    @SerializedName("from")
    String fromDate;
    @SerializedName("to")
    String toDate;
    @SerializedName("gain")
    String gainExperience;
    @SerializedName("description")
    String generalDescription;
    @SerializedName("title")
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getGainExperience() {
        return gainExperience;
    }

    public void setGainExperience(String gainExperience) {
        this.gainExperience = gainExperience;
    }

    public String getGeneralDescription() {
        return generalDescription;
    }

    public void setGeneralDescription(String generalDescription) {
        this.generalDescription = generalDescription;
    }
}
