package com.gourdet.julien.chocotastic.features.list

import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Julien on 16/03/2018.
 */
interface ChocolatesRepository {
    fun chocolates(): Single<List<Chocolate>>
    //fun movieDetails(movieId: Int): Single<MovieDetails>

    class Source
    @Inject constructor(private val dataSourceFactory: ChocolatesDataSource.Factory) : ChocolatesRepository {
        override fun chocolates(): Single<List<Chocolate>> = dataSourceFactory.network().chocolates()
        //override fun movieDetails(movieId: Int) = dataSourceFactory.network().movieDetails(movieId)
    }
}