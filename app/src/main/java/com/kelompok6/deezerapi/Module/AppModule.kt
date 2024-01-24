package com.kelompok6.deezerapi.Module


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    var baseURL = "https://api.deezer.com/"

    @Provides
    @Singleton
    fun getRetrofitServiceInstance(retrofit: Retrofit): com.kelompok6.deezerapi.Retrofit.Retrofit {
        return retrofit.create(com.kelompok6.deezerapi.Retrofit.Retrofit::class.java)
    }

    @Singleton
    @Provides
    fun getRetroInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}