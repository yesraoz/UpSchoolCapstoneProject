import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product_table")
data class Favorites(

    @ColumnInfo(name = "product_title")
    var productTitle: String,

    @ColumnInfo(name = "product_price")
    var productPrice: String
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "product_id")
    var productId: Int = 0
}