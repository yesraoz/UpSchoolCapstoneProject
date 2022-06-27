package com.yesraoz.capstoneproject.Models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Product (

    @SerializedName("id")
    var productId: Int,

    @SerializedName("user")
    var user: String,

     @SerializedName("title")
     var productName: String,

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

    ) :Serializable, Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(productId)
        parcel.writeString(user)
        parcel.writeString(productName)
        parcel.writeString(price)
        parcel.writeString(description)
        parcel.writeString(category)
        parcel.writeString(image)
        parcel.writeString(rate)
        parcel.writeInt(count)
        parcel.writeInt(saleState)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Product> {
        override fun createFromParcel(parcel: Parcel): Product {
            return Product(parcel)
        }

        override fun newArray(size: Int): Array<Product?> {
            return arrayOfNulls(size)
        }
    }
}
