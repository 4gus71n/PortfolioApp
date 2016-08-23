package com.kimboo.portafolioapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Agustin Tomas Larghi on 23/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
public class Me {

    @SerializedName("html_description")
    String htmlDescription;

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }
}
