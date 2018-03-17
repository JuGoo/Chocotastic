package com.gourdet.julien.chocotastic

import android.app.Application
import com.gourdet.julien.chocotastic.di.ApplicationComponent
import com.gourdet.julien.chocotastic.di.ApplicationModule
import com.gourdet.julien.chocotastic.di.DaggerApplicationComponent
import com.squareup.leakcanary.LeakCanary

/**
 * Created by Julien on 07/02/2018.
 */
class AndroidApplication : Application() {

    val appComponent: ApplicationComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        this.injectMembers()
        this.initializeLeakDetection()
    }

    private fun injectMembers() = appComponent.inject(this)

    private fun initializeLeakDetection() {
        if (BuildConfig.DEBUG) LeakCanary.install(this)
    }
}