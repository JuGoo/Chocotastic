package com.gourdet.julien.chocotastic.di

import com.gourdet.julien.chocotastic.BaseActivity
import dagger.Module
import dagger.Provides


@Module
class ActivityModule(private val activity: BaseActivity) {
    @Provides @ForActivity fun provideActivity(): BaseActivity = activity
}
