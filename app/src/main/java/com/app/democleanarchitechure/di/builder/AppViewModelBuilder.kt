package com.app.democleanarchitechure.di.builder

import androidx.lifecycle.ViewModel
import com.app.democleanarchitechure.di.qualifier.ViewModelKey
import com.app.democleanarchitechure.presenter.viewModel.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AppViewModelBuilder {
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(dashboardViewModel: HomeViewModel): ViewModel



}