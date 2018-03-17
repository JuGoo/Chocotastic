package com.gourdet.julien.chocotastic.features.list

import com.gourdet.julien.chocotastic.framework.network.RestApi
import dagger.Lazy
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Julien on 16/03/2018.
 */
interface ChocolatesDataSource: ChocolatesRepository {

    class Factory
    @Inject constructor(val network: Lazy<Network>) {
        fun network(): Network = network.get()
        //fun disk(): Disk = disk.get()
    }

    class Network
    @Inject constructor(private val restApi: RestApi) : ChocolatesDataSource {
        override fun chocolates(): Single<List<Chocolate>> =
                restApi.chocolates().map { chocolateEntities -> chocolateEntities.map { it.toChocolate() } }

        //override fun movieDetails(movieId: Int): Single<MovieDetails> =
        //      restApi.movieDetails(movieId).map { it.toMovieDetails() }
    }

    /*class Disk
    @Inject constructor() : MoviesDataSource {
        override fun movies(): Single<List<Movie>> = TODO()
        override fun movieDetails(movieId: Int): Single<MovieDetails> = TODO()
    }*/
}