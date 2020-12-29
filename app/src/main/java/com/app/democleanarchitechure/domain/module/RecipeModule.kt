package com.app.democleanarchitechure.domain.module

import com.google.gson.annotations.SerializedName

data class RecipeModule (

    @SerializedName("uri") val uri : String,
    @SerializedName("label") val label : String,
    @SerializedName("image") val image : String,
    @SerializedName("source") val source : String,
    @SerializedName("url") val url : String,
    @SerializedName("shareAs") val shareAs : String,
    @SerializedName("yield") val yield : Int,
    @SerializedName("dietLabels") val dietLabels : List<String>,
    @SerializedName("healthLabels") val healthLabels : List<String>,
    @SerializedName("cautions") val cautions : List<String>,
    @SerializedName("ingredientLines") val ingredientLines : List<String>,
    @SerializedName("ingredients") val ingredients : List<Ingredients>,
    @SerializedName("calories") val calories : Double,
    @SerializedName("totalWeight") val totalWeight : Double,
    @SerializedName("totalTime") val totalTime : Int,
  //  @SerializedName("totalNutrients") val totalNutrients : TotalNutrients,
  //  @SerializedName("totalDaily") val totalDaily : TotalDaily,
    @SerializedName("digest") val digest : List<Digest>
)

data class Ingredients (

    @SerializedName("text") val text : String,
    @SerializedName("weight") val weight : Int,
    @SerializedName("image") val image : String
)

data class Digest (

    @SerializedName("label") val label : String,
    @SerializedName("tag") val tag : String,
    @SerializedName("schemaOrgTag") val schemaOrgTag : String,
    @SerializedName("total") val total : Double,
    @SerializedName("hasRDI") val hasRDI : Boolean,
    @SerializedName("daily") val daily : Double,
    @SerializedName("unit") val unit : String
   // @SerializedName("sub") val sub : List<Sub>
)