import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIInstance {
    private const val BASE_URL = "https://canerture.com/api/ecommerce/"
    private var retrofit: Retrofit? = null

    fun getInstance(): Retrofit {
        if (retrofit == null)
            retrofit =
                Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build()

        return retrofit as Retrofit
    }
}