package com.gourdet.julien.chocotastic.framework.network

import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RestApi
@Inject constructor(retrofit: Retrofit) : ChocolatesApi {
    private val chocolatesApi by lazy { retrofit.create(ChocolatesApi::class.java) }

    override fun chocolates() = chocolatesApi.chocolates()
    override fun movieDetails(movieId: Int) = chocolatesApi.movieDetails(movieId)
}
