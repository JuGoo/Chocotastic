package com.gourdet.julien.chocotastic.features.list

import android.os.Bundle
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import com.gourdet.julien.chocotastic.BaseFragment
import com.gourdet.julien.chocotastic.R
import com.gourdet.julien.chocotastic.navigation.Navigator
import kotlinx.android.synthetic.main.fragment_chocolates.*
import javax.inject.Inject

/**
 * Created by Julien on 16/03/2018.
 */
class ChocolatesFragment: BaseFragment(), ChocolatesView {

    @Inject lateinit var navigator: Navigator
    @Inject lateinit var chocolatesPresenter: ChocolatesPresenter
    @Inject lateinit var chocolatesAdapter: ChocolatesAdapter

    override fun layoutId() = R.layout.fragment_chocolates

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeView()
        if (firstTimeCreated(savedInstanceState)) { initializeView(); loadChocolates() }
    }

    override fun onDestroy() {
        super.onDestroy()
        chocolatesPresenter.destroy()
    }

    override fun renderList(chocolates: List<ChocolateViewModel>) {
        chocolatesAdapter.collection = chocolates
    }

    override fun displayDetails(chocolate: ChocolateViewModel, navigationExtras: Navigator.Extras) {
        activity?.let { navigator.showChocolateDetails(it, chocolate, navigationExtras) }
    }

    override fun showLoading() {
        //TODO: implement method
        //Toast.makeText(this.activity,"",Toast.LENGTH_LONG).show()
        spinner.visibility = VISIBLE
    }

    override fun hideLoading() {
        //TODO: implement method
        spinner.visibility = GONE
    }

    private fun initializeView() {
        chocolatesList.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        chocolatesAdapter.clickListener =
                { movieViewModel, navigationExtras ->  chocolatesPresenter.onChocolateClick(movieViewModel, navigationExtras) }
        chocolatesList.adapter = chocolatesAdapter
        chocolatesPresenter.chocolatesView = this
    }

    private fun loadChocolates() = chocolatesPresenter.loadChocolates()
}