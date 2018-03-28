package com.gourdet.julien.chocotastic.features.details

import com.gourdet.julien.chocotastic.framework.view.LoadingView

/**
 * Created by Julien on 27/03/2018.
 */
interface ChocolateDetailsView : LoadingView {
    fun renderDetails(movie: ChocolateDetailsViewModel)
}