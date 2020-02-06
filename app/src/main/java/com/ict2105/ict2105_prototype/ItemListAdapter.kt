package com.ict2105.ict2105_prototype

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.category_list_item.view.*
import kotlinx.android.synthetic.main.item_card.view.*

class ItemListAdapter (private val itemList : ArrayList<String>): RecyclerView.Adapter<ItemListAdapter.ItemViewHolder>(){

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val itemName: TextView = view.textViewItemName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.setIsRecyclable(false)
        holder.itemName.text = itemList[position]
    }

}