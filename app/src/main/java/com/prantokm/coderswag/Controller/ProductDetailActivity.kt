package com.prantokm.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prantokm.coderswag.Model.Product
import com.prantokm.coderswag.R
import com.prantokm.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*
import kotlinx.android.synthetic.main.product_list_item.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product?.image, "drawable", packageName)
        detailImageView.setImageResource(resourceId)
        detailProductName.text = product?.title

        detailProductPrice.text = product?.price


    }
}