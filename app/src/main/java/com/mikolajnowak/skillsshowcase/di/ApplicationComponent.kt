package com.mikolajnowak.skillsshowcase.di

import android.app.Application
import com.mikolajnowak.skillsshowcase.SkillsShowcaseApplication
import com.mikolajnowak.skillsshowcase.di.view.ContributeModule
import com.mikolajnowak.skillsshowcase.di.viewModel.ViewModelsModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ContributeModule::class,
        ViewModelsModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: SkillsShowcaseApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }
}