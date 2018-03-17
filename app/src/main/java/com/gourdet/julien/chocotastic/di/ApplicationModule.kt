package com.gourdet.julien.chocotastic.di

import android.content.Context
import com.gourdet.julien.chocotastic.AndroidApplication
import com.gourdet.julien.chocotastic.BuildConfig
import com.gourdet.julien.chocotastic.framework.executor.ExecutionScheduler
import com.gourdet.julien.chocotastic.framework.executor.ThreadScheduler
import com.gourdet.julien.chocotastic.framework.network.Endpoints
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: AndroidApplication) {

    @Provides @Singleton fun provideApplicationContext(): Context = application

    @Provides @Singleton fun provideExecutionScheduler(threadScheduler: ThreadScheduler): ExecutionScheduler = threadScheduler

    @Provides @Singleton fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(Endpoints.BASE)
                .client(createClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    private fun createClient(): OkHttpClient {
        val okHttpClientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            val loggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC)
            okHttpClientBuilder.addInterceptor(loggingInterceptor)
        }
        return okHttpClientBuilder.build()
    }
}
