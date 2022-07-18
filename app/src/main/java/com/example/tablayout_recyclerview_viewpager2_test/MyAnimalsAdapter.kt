package com.example.tablayout_recyclerview_viewpager2_test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAnimalsAdapter :
    RecyclerView.Adapter<MyAnimalsAdapter.MyViewHolder>() {

    private var titles= arrayOf("dog","rat","snakes","cows","monkeys","lizards","baboons","tigers","lions",
        "flies","ants","birds","spiders","bears", "kangaroo", "pigs","cats", "horses",
        "whales","sharks", "dolphins","crabs","starfish","fish"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val v = LayoutInflater.from(parent.context)
          .inflate(R.layout.item_list_layout, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = titles[position]
        data.let { holder.bindItem(it) }
    }

    override fun getItemCount(): Int {
        return titles.size
    }
    class MyViewHolder(v:View):RecyclerView.ViewHolder(v) {

       var itemTitle: TextView = itemView.findViewById(R.id.text1)

        ///For data binding purposes
        fun bindItem(data: String){
            itemTitle.text = data
        }

    }
}