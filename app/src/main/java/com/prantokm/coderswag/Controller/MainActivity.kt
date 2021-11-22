package com.prantokm.coderswag.Controller

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
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecycleAdapter(this,DataService.categories)
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