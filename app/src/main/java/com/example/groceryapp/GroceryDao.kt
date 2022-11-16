package com.example.grocerylist.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.groceryapp.Database.Entity.GroceryItems

// This class is used to create function for database
@Dao
interface GroceryDao {

    // The Insert function is used to insert data in the database
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: GroceryItems)

    // The Delete function is used to delete data in the database
    @Delete
    suspend fun delete(item: GroceryItems)

    // getAllGroceryItems function is used to get all the data from the database
    @Query("SELECT * FROM grocery_items")
    fun getAllGroceryItems(): LiveData<List<GroceryItems>>
}