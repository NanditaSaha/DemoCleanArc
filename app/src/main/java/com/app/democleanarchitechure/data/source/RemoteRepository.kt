package com.app.democleanarchitechure.data.source

import com.app.democleanarchitechure.core.Configuration
import com.app.democleanarchitechure.data.restApi.ApiService
import com.app.democleanarchitechure.domain.module.RecipeModule
import com.app.democleanarchitechure.presenter.utility.Constant
import io.reactivex.Single

class RemoteRepository(private val apIs: ApiService) : BaseRemoteRepository {
    override fun getHome(): Single<RecipeModule> {
            return apIs.getHome(url = Configuration.NON_VEG,appId =  Configuration.APP_ID,appKey =  Configuration.APP_KEY,from = "0",to="10")
    }

}