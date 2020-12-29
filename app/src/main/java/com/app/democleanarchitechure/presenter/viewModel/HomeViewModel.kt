package com.app.democleanarchitechure.presenter.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.app.democleanarchitechure.domain.module.RecipeModule
import com.architecture.clean.domain.model.response.ErrorModel
import com.architecture.clean.domain.model.response.ErrorResponse
import com.architecture.clean.domain.model.response.SuccessResponse
import com.architecture.clean.domain.model.response.UseCaseResponse
import com.architecture.clean.domain.usecase.GetHomeUseCase
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val getHomeUseCase: GetHomeUseCase) : BaseViewModel() {
    private val TAG = HomeViewModel::class.java.simpleName
    val homeData: MutableLiveData<RecipeModule> by lazy { MutableLiveData<RecipeModule>() }
    val error : MutableLiveData<ErrorModel> by lazy { MutableLiveData<ErrorModel>() }
    init {
        getHomeUseCase.execute(compositeDisposable, this::getHomeResponse)
    }
    public fun getHomeResponse(response: UseCaseResponse<RecipeModule>) {
        Log.d(TAG, "getHomeResponse() called  with: response = [$response]")
        when (response) {
            is SuccessResponse -> homeData.value = response.value
            is ErrorResponse -> error.value=response.error
        }
    }
}