package com.example.groceryapp.Database.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "grocery_items")

data class GroceryItems (
    // Create itemName variable to store grocery items.
    @ColumnInfo(name = "itemName")
    var itemName: String,

    // Create itemQuantity variable to store grocery quantity
    @ColumnInfo(name = "itemQuantity")
    var itemQuantity: Int,

    // Create itemQuantity variable to store price
    @ColumnInfo(name = "itemPrice")
    var itemPrice: Int
) {
    // Primary key is a unique key for different database
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
