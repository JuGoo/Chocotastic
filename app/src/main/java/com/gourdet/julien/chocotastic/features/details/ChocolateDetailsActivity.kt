package com.gourdet.julien.chocotastic.features.details

import android.content.Context
import android.content.Intent
import com.gourdet.julien.chocotastic.BaseActivity
import com.gourdet.julien.chocotastic.features.list.ChocolateViewModel
import com.gourdet.julien.chocotastic.features.list.ChocolatesActivity
import com.gourdet.julien.chocotastic.features.list.ChocolatesFragment

/**
 * Created by Julien on 27/03/2018.
 */

class ChocolateDetailsActivity: BaseActivity() {

    companion object {
        private const val INTENT_EXTRA_PARAM_CHOCOLATE = "com.gourdet.julien.INTENT_PARAM_CHOCOLATE"

        fun callingIntent(context: Context, chocolate: ChocolateViewModel): Intent {
            val intent = Intent(context, ChocolateDetailsActivity::class.java)
            intent.putExtra(INTENT_EXTRA_PARAM_CHOCOLATE, chocolate)
            return intent
        }
    }

    override fun fragment() = ChocolateDetailsFragment.forChocolate(intent.getParcelableExtra(INTENT_EXTRA_PARAM_CHOCOLATE))
}