package com.app.democleanarchitechure.data.source

import com.app.democleanarchitechure.domain.module.RecipeModule
import io.reactivex.Single

interface BaseRemoteRepository {
    fun getHome(
    ): Single<RecipeModule>
}