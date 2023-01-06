package com.example.dz1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SpotiAdapter(newArrayList: ArrayList<Spotify>) :RecyclerView.Adapter<SpotiAdapter.SpotiHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpotiHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.spotyfy_items,parent,false)
        return SpotiHolder(view)
    }

    override fun onBindViewHolder(holder: SpotiHolder, position: Int) {
       val items =  newArrayList[position]
        holder.album.text = items.album
        holder.image.setImageResource(items.image)
        holder.name.text = items.name
    }

    override fun getItemCount(): Int {
       return newArrayList.size
    }

    class SpotiHolder(item: View):RecyclerView.ViewHolder(item){
        var image:ImageView = itemView.findViewById(R.id.image)
        var name :TextView =itemView.findViewById(R.id.name)
        var album :TextView = item.findViewById(R.id.muz)
    }
}


