package com.app.democleanarchitechure.data.restApi

import com.app.democleanarchitechure.domain.module.RecipeModule
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface ApiService {

    @GET
    fun getHome(
        @Url url: String,
        @Query("app_id") appId: String,
        @Query("app_key") appKey: String,
        @Query("from") from: String,
        @Query("to") to: String
    ): Single<RecipeModule>


}