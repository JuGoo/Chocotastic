package com.gourdet.julien.chocotastic.navigation

import android.content.Context
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.app.FragmentActivity
import android.view.View
import android.widget.ImageView
import com.gourdet.julien.chocotastic.features.details.ChocolateDetailsActivity
import com.gourdet.julien.chocotastic.features.list.ChocolateViewModel
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

    fun showChocolateDetails(activity: FragmentActivity, chocolate: ChocolateViewModel, navigationExtras: Extras) {
        val intent = ChocolateDetailsActivity.callingIntent(activity, chocolate)
        //val sharedView = navigationExtras.transitionSharedElement as ImageView
        //val activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, sharedView, sharedView.transitionName)
        activity.startActivity(intent)
    }

/*private fun showLogin(context: Context) = context.startActivity(LoginActivity.callingIntent(context))*/
private fun showChocolates(context: Context) = context.startActivity(ChocolatesActivity.callingIntent(context))

class Extras(val transitionSharedElement: View)
}


