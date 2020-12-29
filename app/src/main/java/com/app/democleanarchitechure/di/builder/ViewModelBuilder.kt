package com.architecture.clean.di.builder


import androidx.lifecycle.ViewModelProvider
import com.app.democleanarchitechure.di.builder.AppViewModelBuilder
import com.app.democleanarchitechure.presenter.viewModel.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module(includes = [
    (RepositoryBuilder::class),
    (AppViewModelBuilder::class)
])
abstract class ViewModelBuilder {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}