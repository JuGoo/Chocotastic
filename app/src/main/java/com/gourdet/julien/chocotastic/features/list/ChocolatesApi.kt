package com.gourdet.julien.chocotastic.features.list

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Julien on 19/03/2018.
 */

internal interface ChocolatesApi {
    companion object {
        private const val PARAM_MOVIE_ID = "movieId"
        private const val CHOCOLATES = "chocolates.json"
        private const val MOVIE_DETAILS = "movie_0{$PARAM_MOVIE_ID}.json"
    }

    @GET(CHOCOLATES) fun chocolates(): Call<List<ChocolateEntity>>
    //@GET(MOVIE_DETAILS) fun movieDetails(@Path(PARAM_MOVIE_ID) movieId: Int): Call<MovieDetailsEntity>
}