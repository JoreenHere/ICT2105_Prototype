package com.ict2105.ict2105_prototype

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ict2105.ict2105_prototype.ui.organization.CharityOrganizationFragment
import kotlinx.android.synthetic.main.category_list_item.view.*
import kotlinx.android.synthetic.main.request_list_item.view.*


class RequestListAdapter (private val requestList : ArrayList<String>, private val context: Context): RecyclerView.Adapter<RequestListAdapter.RequestViewHolder>(){

    class RequestViewHolder(view: View , private val context: Context) : RecyclerView.ViewHolder(view), View.OnClickListener{
        val request: TextView = view.textViewItemName

        init{
            view.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val intent = Intent(context, ViewRequestDetailsActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RequestViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.request_list_item, parent, false)
        return RequestViewHolder(view, context)
    }

    override fun getItemCount() = requestList.size

    override fun onBindViewHolder(holder: RequestViewHolder, position: Int) {
        holder.setIsRecyclable(false)
        holder.request.text = requestList[position]
    }

}