package com.kimboo.portafolioapp.net.service;

/**
 * Created by Agustin Tomas Larghi on 02/08/2016.
 * Email: agustin.tomas.larghi@gmail.com
 */
import com.kimboo.portafolioapp.model.Me;

import retrofit2.http.GET;
import rx.Observable;

public interface AboutMeService {
    @GET("aboutme")
    Observable<Me> getAboutMe();
}
