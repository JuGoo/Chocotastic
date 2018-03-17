package com.gourdet.julien.chocotastic.di

import com.gourdet.julien.chocotastic.AndroidApplication
import com.gourdet.julien.chocotastic.features.list.ChocolatesFragment
import com.gourdet.julien.chocotastic.features.list.ChocolatesModule
import com.gourdet.julien.chocotastic.navigation.RouteActivity
import dagger.Component
import javax.inject.Provider
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(ApplicationModule::class, ApplicationBinders::class, ChocolatesModule::class))
interface ApplicationComponent {
    fun inject(application: AndroidApplication)
    fun inject(routeActivity: RouteActivity)

    //TODO: do scoping here
    fun inject(chocolatesFragment: ChocolatesFragment)
//    fun inject(movieDetailsFragment: MovieDetailsFragment)

    fun subComponentBuilders(): Map<Class<*>, Provider<SubcomponentBuilder<*>>>
}
