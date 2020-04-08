package com.example.recyclerview

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.my_item.view.*

class MyItemAdapter (private val myItemList: List<MyItem>) : RecyclerView.Adapter<MyItemAdapter.MyItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyItemViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.my_item, parent, false)
        return MyItemViewHolder(itemView)
    }

    override fun getItemCount() = myItemList.size

    override fun onBindViewHolder(holder: MyItemViewHolder, position: Int) {
        val currentItem = myItemList[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView.text = currentItem.text1
        holder.textView2.text = currentItem.text2
    }

    class MyItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.image_view
        val textView: TextView = itemView.text
        val textView2: TextView = itemView.text2
    }

}
