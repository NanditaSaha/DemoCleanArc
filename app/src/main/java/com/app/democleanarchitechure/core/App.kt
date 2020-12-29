package com.app.democleanarchitechure.core

import com.app.democleanarchitechure.di.component.CoreComponent
import com.app.democleanarchitechure.di.component.DaggerCoreComponent
import com.app.democleanarchitechure.di.component.DaggerCoreComponent.builder
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App: DaggerApplication()  {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerCoreComponent
            .builder()
            .application(this)
            .build()
    }
}