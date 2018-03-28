package com.gourdet.julien.chocotastic.features.list

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.gourdet.julien.chocotastic.R
import com.gourdet.julien.chocotastic.framework.extension.inflate
import com.gourdet.julien.chocotastic.framework.extension.loadFromUrl
import com.gourdet.julien.chocotastic.navigation.Navigator
import kotlinx.android.synthetic.main.row_chocolate.view.*
import javax.inject.Inject
import kotlin.properties.Delegates

/**
 * Created by Julien on 16/03/2018.
 */
class ChocolatesAdapter
@Inject constructor() : RecyclerView.Adapter<ChocolatesAdapter.ViewHolder>() {

    internal var collection: List<ChocolateViewModel> by Delegates.observable(emptyList()) {
        _, _, _ -> notifyDataSetChanged()
    }

    internal var clickListener: (ChocolateViewModel, Navigator.Extras) -> Unit = { _, _ -> }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent.inflate(R.layout.row_chocolate))

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) = viewHolder.bind(collection[position], clickListener)

    override fun getItemCount() = collection.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(chocolateViewModel: ChocolateViewModel, clickListener: (ChocolateViewModel, Navigator.Extras) -> Unit) {
            itemView.chocolatePoster.loadFromUrl(chocolateViewModel.image)
            itemView.setOnClickListener { clickListener(chocolateViewModel, Navigator.Extras(itemView.chocolatePoster)) }
        }
    }
}