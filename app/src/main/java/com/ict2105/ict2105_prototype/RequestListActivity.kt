package com.ict2105.ict2105_prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RequestListActivity : AppCompatActivity() {

    private lateinit var recyclerViewRequestList: RecyclerView
    private lateinit var requestListAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private val requestList: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_list)

        supportActionBar?.title = "Volunteer Requests"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        requestList.add("Assorted T-shirts")
        requestList.add("Assorted T-shirts")
        requestList.add("Assorted T-shirts")
        requestList.add("Assorted T-shirts")
        requestList.add("Assorted T-shirts")
        requestList.add("Assorted T-shirts")
        requestList.add("Assorted T-shirts")
        requestList.add("Assorted T-shirts")

        requestListAdapter = RequestListAdapter(requestList, this)
        viewManager = LinearLayoutManager(this)

        recyclerViewRequestList = findViewById<RecyclerView>(R.id.recyclerViewRequestList).apply {
            adapter = requestListAdapter
            layoutManager = viewManager

        }

    }
}
