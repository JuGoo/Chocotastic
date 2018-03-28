package com.gourdet.julien.chocotastic.features.details

import android.os.Bundle
import com.gourdet.julien.chocotastic.BaseFragment
import com.gourdet.julien.chocotastic.R
import com.gourdet.julien.chocotastic.features.list.ChocolateViewModel

/**
 * Created by Julien on 27/03/2018.
 */
class ChocolateDetailsFragment: BaseFragment(), ChocolateDetailsView {

    companion object {
        private const val PARAM_CHOCOLATE = "param_chocolate"

        fun forChocolate(chocolate: ChocolateViewModel): ChocolateDetailsFragment {
            val chocolateDetailsFragment = ChocolateDetailsFragment()
            val arguments = Bundle()
            arguments.putParcelable(PARAM_CHOCOLATE, chocolate)
            chocolateDetailsFragment.arguments = arguments

            return chocolateDetailsFragment
        }
    }

    override fun layoutId() = R.layout.fragment_chocolate_details

    override fun renderDetails(movie: ChocolateDetailsViewModel) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}