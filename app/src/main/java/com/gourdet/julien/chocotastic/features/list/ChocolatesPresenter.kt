package com.gourdet.julien.chocotastic.features.list


import com.gourdet.julien.chocotastic.framework.interactor.UseCase.None
import com.gourdet.julien.chocotastic.navigation.Navigator
import javax.inject.Inject

/**
 * Created by Julien on 16/03/2018.
 */

class ChocolatesPresenter
@Inject constructor(private val getChocolates: GetChocolates) {

    internal lateinit var chocolatesView: ChocolatesView

    fun destroy() {
    }

    fun loadChocolates() {
        chocolatesView.showLoading()
        getChocolates.execute(
                { chocolates -> chocolatesView.renderList(
                        chocolates.map { ChocolateViewModel(it.id, it.name, it.image) })
                    chocolatesView.hideLoading()
                }, None())

    }

    fun onChocolateClick(chocolateViewModel: ChocolateViewModel, navigationExtras: Navigator.Extras) =
            chocolatesView.displayDetails(chocolateViewModel, navigationExtras)
}