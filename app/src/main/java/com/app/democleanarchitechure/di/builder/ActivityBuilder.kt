package com.app.democleanarchitechure.di.builder


import com.app.democleanarchitechure.presenter.view.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun bindHomeActivity(): HomeActivity

}