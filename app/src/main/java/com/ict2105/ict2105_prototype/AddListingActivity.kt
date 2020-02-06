package com.ict2105.ict2105_prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_add_listing.*

class AddListingActivity : AppCompatActivity() {

    private lateinit var recyclerViewCategoryList: RecyclerView
    private lateinit var categoryListAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private val categoryList: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_listing)
        supportActionBar?.title = "Choose a category"

        //Set Actionbar Back Button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        addCategory()

        categoryListAdapter = CategoryListAdapter(categoryList, this)
        viewManager = LinearLayoutManager(this)

        recyclerViewCategoryList = findViewById<RecyclerView>(R.id.recyclerViewCategoryList).apply {
            adapter = categoryListAdapter
            layoutManager = viewManager

        }
    }

    private fun addCategory(){
        categoryList.add("Books")
        categoryList.add("Papers")
        categoryList.add("Furniture")
        categoryList.add("Clothes")
        categoryList.add("Electronic Devices")
        categoryList.add("Bags")
    }
}
