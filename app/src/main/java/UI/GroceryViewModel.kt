package com.example.grocerylist.UI

import androidx.lifecycle.ViewModel
import com.example.groceryapp.Database.Entity.GroceryItems
import com.example.grocerylist.Database.GroceryRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModel(private val repository: GroceryRepository) : ViewModel() {

    // In the coroutines thread insert item in insert function
    fun insert(item: GroceryItems) = GlobalScope.launch {
        repository.insert(item)
    }

    // In coroutines thread delete item in delete function
    fun delete(item: GroceryItems) = GlobalScope.launch {
        repository.delete(item)
    }

    // We initialize allGroceryItems function with repository
    fun allGroceryItems() = repository.allGroceryItems()
}