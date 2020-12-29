package com.architecture.clean.domain.usecase


import com.app.democleanarchitechure.data.mapper.CloudErrorMapper
import com.app.democleanarchitechure.domain.module.RecipeModule
import com.app.democleanarchitechure.domain.repository.RecipeListRepository
import com.architecture.clean.domain.usecase.base.SingleUseCase
import io.reactivex.Single
import javax.inject.Inject

class GetHomeUseCase @Inject constructor(
    errorUtil: CloudErrorMapper,
    private val appRepository: RecipeListRepository
) : SingleUseCase<RecipeModule>(errorUtil) {

    override fun execute(): Single<RecipeModule> {
        return appRepository.getRecipeList()
    }
}