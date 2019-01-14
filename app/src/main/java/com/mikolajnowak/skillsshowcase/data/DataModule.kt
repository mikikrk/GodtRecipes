package com.mikolajnowak.skillsshowcase.data

import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    @Singleton
    fun provideGson() = GsonBuilder().create()
}
