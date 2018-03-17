package com.gourdet.julien.chocotastic.framework.network

import com.gourdet.julien.chocotastic.features.list.ChocolateEntity
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.*

internal interface ChocolatesApi {
    @GET(Endpoints.CHOCOLATES) fun chocolates(): Single<List<ChocolateEntity>>
    @GET(Endpoints.MOVIE_DETAILS) fun movieDetails(@Path(Endpoints.PARAM_MOVIE_ID) movieId: Int): Single<Objects>
}
