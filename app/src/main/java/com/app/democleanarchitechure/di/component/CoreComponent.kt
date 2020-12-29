package com.app.democleanarchitechure.di.component

import android.app.Application
import com.app.democleanarchitechure.core.App
import com.app.democleanarchitechure.di.builder.ActivityBuilder
import com.app.democleanarchitechure.di.module.ContextModule
import com.app.democleanarchitechure.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, NetworkModule::class,  ActivityBuilder::class, ContextModule::class])
interface CoreComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): CoreComponent
    }


}