package org.techtown.recyclerview_app

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(val items : MutableList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)

        return ViewHolder(view)
    }

    // 클릭했을 때때
   interface ItemClick {
        fun onClick(view : View, position: Int)
    }
    var itemClick : ItemClick? = null

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if(itemClick != null) {
            holder.itemView.setOnClickListener { v->
                itemClick?.onClick(v, position)
            }
        }
        holder.bindItems(items[position])
    }

    // 전체 리사이클러뷰의 갯수
    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(item : String) {
            val rv_text = itemView.findViewById<TextView>(R.id.rvItem)
            rv_text.text = item
        }
    }
}