package com.gourdet.julien.chocotastic.navigation

import android.content.Context
import android.view.View
import com.gourdet.julien.chocotastic.features.list.ChocolatesActivity
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Navigator
@Inject constructor() {

    fun showMain(context: Context) {
        /*when (authenticator.userLoggedIn()) {
            false -> showMovies(context)
            true -> showLogin(context)
        }*/
        showChocolates(context)
    }

    /*fun showMovieDetails(activity: FragmentActivity, movie: MovieViewModel, navigationExtras: Extras) {
        val intent = MovieDetailsActivity.callingIntent(activity, movie)
        val sharedView = navigationExtras.transitionSharedElement as ImageView
        val activityOptions = ActivityOptionsCompat
                .makeSceneTransitionAnimation(activity, sharedView, sharedView.transitionName)
        activity.startActivity(intent, activityOptions.toBundle())
    }

    private fun showLogin(context: Context) = context.startActivity(LoginActivity.callingIntent(context))*/
    private fun showChocolates(context: Context) = context.startActivity(ChocolatesActivity.callingIntent(context))

    class Extras(val transitionSharedElement: View)
}


