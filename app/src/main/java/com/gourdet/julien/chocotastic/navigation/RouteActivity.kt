package com.gourdet.julien.chocotastic.navigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gourdet.julien.chocotastic.AndroidApplication
import com.gourdet.julien.chocotastic.di.ApplicationComponent
import com.gourdet.julien.chocotastic.navigation.Navigator
import javax.inject.Inject

class RouteActivity : AppCompatActivity() {

    val appComponent: ApplicationComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        (application as AndroidApplication).appComponent
    }

    @Inject internal lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)
        navigator.showMain(this)
    }
}
