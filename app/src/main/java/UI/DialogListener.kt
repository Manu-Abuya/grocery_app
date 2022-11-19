package UI

import com.example.groceryapp.Database.Entity.GroceryItems

interface DialogListener {
    // Create a function to add items in GroceryItems on clicking
    fun onAddButtonClicked(item:GroceryItems)
}