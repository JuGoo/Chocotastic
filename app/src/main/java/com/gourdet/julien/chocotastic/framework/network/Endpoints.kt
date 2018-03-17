package com.gourdet.julien.chocotastic.framework.network

class Endpoints {
    companion object {
        //Parameters
        const val PARAM_MOVIE_ID = "movieId"

        //Api Urls
        const val BASE = "https://raw.githubusercontent.com/JuGoo/Chocotastic/master/Data/"
        const val CHOCOLATES = "chocolates.json"
        const val MOVIE_DETAILS = "movie_0{$PARAM_MOVIE_ID}.json"
    }
}
