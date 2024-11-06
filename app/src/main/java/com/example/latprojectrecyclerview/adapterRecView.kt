package com.example.latprojectrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class adapterRecView(private val listWayang : ArrayList<wayang>) : RecyclerView.Adapter<adapterRecView.ListViewHolder>(){
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var _namaWayang = itemView.findViewById<TextView>(R.id.namaWayang)
        var _karakterWayang = itemView.findViewById<TextView>(R.id.karakterWayang)
        var _deskripsiWayang = itemView.findViewById<TextView>(R.id.deskripsiWayang)
        var _gambarWayang = itemView.findViewById<TextView>(R.id.gambarWayang)
    }
}