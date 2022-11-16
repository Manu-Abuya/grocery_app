package com.example.groceryapp.Database.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// Data is stored in this data class
// Entities class create a table in database, in our database we will create three columns

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
