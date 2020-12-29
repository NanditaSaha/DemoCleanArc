package com.architecture.clean.di.builder


import com.app.democleanarchitechure.data.repository.AppRepoImp
import com.app.democleanarchitechure.domain.repository.RecipeListRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryBuilder {
    @Binds
    abstract fun bindsRecipeRepository(repoImp: AppRepoImp): RecipeListRepository
}