package com.ict2105.ict2105_prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddItemDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item_details)

        supportActionBar?.title = "Add Details"

        //Set Actionbar Back Button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
