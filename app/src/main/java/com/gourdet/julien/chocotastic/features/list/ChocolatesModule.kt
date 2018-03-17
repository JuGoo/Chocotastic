package com.gourdet.julien.chocotastic.features.list

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Julien on 16/03/2018.
 */
@Module
class ChocolatesModule {
    @Provides
    @Singleton
    fun provideChocolatesRepository(repository: ChocolatesRepository.Source): ChocolatesRepository = repository

}