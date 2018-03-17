package com.gourdet.julien.chocotastic.features.list

import com.gourdet.julien.chocotastic.framework.view.LoadingView
import com.gourdet.julien.chocotastic.navigation.Navigator

/**
 * Created by Julien on 16/03/2018.
 */
interface ChocolatesView : LoadingView {
    fun renderList(movies: List<ChocolateViewModel>)
    fun displayDetails(chocolate: ChocolateViewModel, navigationExtras: Navigator.Extras)
    fun dispose()
}