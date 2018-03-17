package com.gourdet.julien.chocotastic.features.list

import android.content.Context
import android.content.Intent
import com.gourdet.julien.chocotastic.BaseActivity

/**
 * Created by Julien on 16/03/2018.
 */

class ChocolatesActivity : BaseActivity() {

    companion object {
        fun callingIntent(context: Context) = Intent(context, ChocolatesActivity::class.java)
    }

    override fun fragment() = ChocolatesFragment()
}