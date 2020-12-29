package com.app.democleanarchitechure.data.repository

import com.app.democleanarchitechure.data.source.BaseRemoteRepository
import com.app.democleanarchitechure.domain.module.RecipeModule
import com.app.democleanarchitechure.domain.repository.RecipeListRepository
import io.reactivex.Single
import javax.inject.Inject

class AppRepoImp  @Inject constructor(
        private val baseRemoteRepository: BaseRemoteRepository

): RecipeListRepository {
    override fun getRecipeList(

    ): Single<RecipeModule> {
       return baseRemoteRepository.getHome()
    }
}