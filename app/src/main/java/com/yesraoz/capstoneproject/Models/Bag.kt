package com.yesraoz.capstoneproject.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Bag (
    @SerializedName("id")
    @Expose var Id: Int,

    @SerializedName("user")
    var user: String,

    @SerializedName("title")
    var title: String,

    @SerializedName("price")
    var price: String,

    @SerializedName("description")
    var description: String,

    @SerializedName("category")
    var category: String,

    @SerializedName("image")
    var image: String,
    @SerializedName("rate")
    var rate: String,

    @SerializedName("count")
    var count: Int,

    @SerializedName("saleState")
    var saleState: Int

    ):Serializable
