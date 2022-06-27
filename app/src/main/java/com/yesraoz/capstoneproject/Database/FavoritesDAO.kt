import androidx.room.*

@Dao
interface ProductDao {
    @Insert
    fun insertProduct(product: Favorites)

    @Query("SELECT * FROM product_table ORDER BY product_id DESC")
    fun getAllProduct(): List<Favorites>

    @Update
    fun updateProduct(product: Favorites)

    @Delete
    fun deleteProduct(product: Favorites)

}