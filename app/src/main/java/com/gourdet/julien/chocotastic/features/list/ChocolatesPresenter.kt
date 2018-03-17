package com.gourdet.julien.chocotastic.features.list

import com.gourdet.julien.chocotastic.navigation.Navigator
import javax.inject.Inject

/**
 * Created by Julien on 16/03/2018.
 */

class ChocolatesPresenter
@Inject constructor(private val getChocolates: GetChocolates) {

    internal lateinit var chocolatesView: ChocolatesView

    fun destroy() {
        getChocolates.dispose()
        chocolatesView.dispose()
    }

    fun loadChocolates() {
        chocolatesView.showLoading()
        getChocolates.execute(
                { chocolates -> chocolatesView.renderList(chocolates.map { ChocolateViewModel(it.id, it.name) })
                    chocolatesView.hideLoading() },
                { TODO() })
    }

    fun onMovieClick(movieViewModel: ChocolateViewModel, navigationExtras: Navigator.Extras) =
            chocolatesView.displayDetails(movieViewModel, navigationExtras)
}