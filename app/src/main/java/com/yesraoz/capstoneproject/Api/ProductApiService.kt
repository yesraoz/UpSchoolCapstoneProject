package com.yesraoz.capstoneproject.Api

import com.yesraoz.capstoneproject.Models.CRUDResponse
import com.yesraoz.capstoneproject.Models.Product
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ProductApiService {

    @POST(" add_product.php")
        @FormUrlEncoded
        fun addProduct(
            @Field(" user") user: String,
            @Field("title") title: String,
            @Field("price") price: Double,
            @Field("description") description: String,
            @Field(" category") category: String,
            @Field("image") image: String,
            @Field("rate") rate: Double,
            @Field("count") count: Int,
            @Field("sale_state") saleState: Int): CRUDResponse


        @GET("get_products.php")
             fun getProducts(): Call<ArrayList<Product>>

    @POST("get_products_by_id.php")
    @FormUrlEncoded
    fun getProductsById(
        @Field("id") user: String,
    ): Call<List<Product>>



    @POST("get_products_by_user.php")
        @FormUrlEncoded
         fun getProductsByUser(
        @Field("user") user: String,
            ): Call<List<Product>>

    @POST("get_products_by_category.php")
        @FormUrlEncoded
        fun getProductsByCategory(
            @Field("category") category: String,
            ): Call<List<Product>>


    @POST(" get_products_by_user_and_category.php")
        @FormUrlEncoded
         fun getProductsByUserAndCategory(
            @Field(" user") user: String,
            @Field("category") category:String,
            ): Call<List<Product>>

    @GET("get_sale_products.php")
             fun getSaleProducts(): List<Product>

    @POST("get_sale_products_by_user.php")
        @FormUrlEncoded
         fun getSaleProductsByUser(
            @Field("user") user: String,
            ): Call<List<Product>>

}