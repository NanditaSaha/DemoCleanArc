package com.app.democleanarchitechure.domain.repository

import com.app.democleanarchitechure.domain.module.RecipeModule
import io.reactivex.Single

interface RecipeListRepository {

    fun getRecipeList(
    ): Single<RecipeModule>
}