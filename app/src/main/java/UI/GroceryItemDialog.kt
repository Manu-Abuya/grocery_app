package UI

import android.content.Context
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import com.example.groceryapp.Database.Entity.GroceryItems
import com.example.groceryapp.R
import kotlinx.android.synthetic.main.grocerydialog.*

class GroceryItemDialog(context: Context, var dialogListener: DialogListener) : AppCompatDialog(context) {

    override fun onCreate(savedInstance: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.grocerydialog)

        // Click listener on save button to save all data.
        tvSave.setOnClickListener {
            // Take all the three inputs in different variables from user and add it in the Grocery Items database
            val name = etItemName.text.toString()
            val quantity = etItemQuantity.text.toString().toInt()
            val price = etItemPrice.text.toString().toInt()

            // Toast to display enter items in edit text
            if (name.isEmpty()) {
                Toast.makeText(context, "Please Enter Item Name", Toast.LENGTH_SHORT).show()
            }

            val item = GroceryItems(name, quantity, price)
            dialogListener.onAddButtonClicked(item)
            dismiss()
        }

        // ON click listener on cancel text to close dialog box
        tvCancel.setOnClickListener {
            cancel()
        }
    }
}