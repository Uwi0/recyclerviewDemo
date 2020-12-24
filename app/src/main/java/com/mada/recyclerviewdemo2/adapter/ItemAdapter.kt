package com.mada.recyclerviewdemo2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.mada.recyclerviewdemo2.R

class ItemAdapter(
        private var context: Context,
        private var items: ArrayList<String>
) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tvItem: TextView = itemView.findViewById(R.id.tv_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
                LayoutInflater.from(context).inflate(
                        R.layout.items_row,
                        parent,
                        false
                )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.tvItem.text = item

        if(position %2 == 0) {
            holder.tvItem.setBackgroundColor(
                    ContextCompat.getColor(
                            context,
                            R.color.colorLightGray,
                    )
            )
        }else{
            holder.tvItem.setBackgroundColor(
                    ContextCompat.getColor(
                            context,
                            R.color.white
                    )
            )
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}