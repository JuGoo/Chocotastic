package com.gourdet.julien.chocotastic.features.list

import com.gourdet.julien.chocotastic.features.details.ChocolateDetailsEntity
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Julien on 19/03/2018.
 */

internal interface ChocolatesApi {
    companion object {
       private const val PARAM_CHOCOLATE_ID = "movieId"
        private const val CHOCOLATES = "chocolates.json"
        private const val CHOCOLATE_DETAILS = "movie_0{$PARAM_CHOCOLATE_ID}.json"
    }

    @GET(CHOCOLATES) fun chocolates(): Call<List<ChocolateEntity>>
    @GET(CHOCOLATE_DETAILS) fun chocolateDetails(@Path(PARAM_CHOCOLATE_ID) movieId: Int): Call<ChocolateDetailsEntity>
}