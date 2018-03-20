package com.gourdet.julien.chocotastic.features.list

import javax.inject.Inject

/**
 * Created by Julien on 16/03/2018.
 */
interface ChocolatesRepository {
    fun chocolates(): List<Chocolate>

    class Network
    @Inject constructor(private val service: ChocolatesService) : ChocolatesRepository {

        override fun chocolates(): List<Chocolate> {
            val chocolateList = service.chocolates().execute().body() ?: emptyList()
            return chocolateList.map { it.toChocolate() }
        }
    }
}