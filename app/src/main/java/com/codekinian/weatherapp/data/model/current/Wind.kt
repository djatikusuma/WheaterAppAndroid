package com.codekinian.weatherapp.data.model.current


import com.google.gson.annotations.SerializedName

data class Wind(
    @SerializedName("deg")
    val deg: Int? = null,
    @SerializedName("gust")
    val gust: Double? = null,
    @SerializedName("speed")
    val speed: Double? = null
)