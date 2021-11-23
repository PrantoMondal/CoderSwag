package com.prantokm.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.prantokm.coderswag.Adapters.CategoryAdapter
import com.prantokm.coderswag.Adapters.CategoryRecycleAdapter
import com.prantokm.coderswag.Model.Category
import com.prantokm.coderswag.R
import com.prantokm.coderswag.Services.DataService
import com.prantokm.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.category_list_item.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecycleAdapter(this,DataService.categories) { category ->
            val productIntent = Intent (this,ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)

        }
        categoryListView.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

//        categoryListView.setOnItemClickListener { adapterView, view, i, l->
//        val category = DataService.categories[i]
//        Toast.makeText(this, "You clicked on the ${category.title}cell",Toast.LENGTH_SHORT).show()
//
//        }


    }
}