import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Favorites::class],
    version = 1
)
abstract class FavoritesDatabase : RoomDatabase() {

    abstract fun getProductDao(): ProductDao

    companion object {
        private var instance: FavoritesDatabase? = null

        fun getProductDatabase(context: Context): FavoritesDatabase? {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context,
                    FavoritesDatabase::class.java,
                    "product.db"
                ).allowMainThreadQueries().build()
            }
            return instance
        }
    }
}