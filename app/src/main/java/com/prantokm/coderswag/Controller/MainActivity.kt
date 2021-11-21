package com.prantokm.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.prantokm.coderswag.Adapters.CategoryAdapter
import com.prantokm.coderswag.Model.Category
import com.prantokm.coderswag.R
import com.prantokm.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,DataService.categories
           )
        categoryListView.adapter = adapter
    }

}