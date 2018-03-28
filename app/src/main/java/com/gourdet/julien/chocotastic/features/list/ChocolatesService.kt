package com.gourdet.julien.chocotastic.features.list

import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Julien on 19/03/2018.
 */
@Singleton
class ChocolatesService
@Inject constructor(retrofit: Retrofit) : ChocolatesApi {
    private val chocolatesApi by lazy { retrofit.create(ChocolatesApi::class.java) }

    override fun chocolates() = chocolatesApi.chocolates()
    override fun chocolateDetails(chocolateId: Int) = chocolatesApi.chocolateDetails(chocolateId)
}
