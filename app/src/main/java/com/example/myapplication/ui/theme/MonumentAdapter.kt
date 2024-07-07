package com.example.myapplication.ui.theme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Import the Monument class from its correct package
import com.example.myapplication.Monument
import com.example.myapplication.R

class MonumentAdapter(private val monuments: List<Monument>) :
    RecyclerView.Adapter<MonumentAdapter.MonumentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonumentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.monument_item, parent, false)
        return MonumentViewHolder(view)
    }

    override fun onBindViewHolder(holder: MonumentViewHolder, position: Int) {
        val monument = monuments[position]
        holder.bind(monument)
    }

    override fun getItemCount(): Int = monuments.size

    class MonumentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val textView: TextView = itemView.findViewById(R.id.textView)

        fun bind(monument: Monument) {
            imageView.setImageResource(monument.imageResId)
            textView.text = monument.name
        }
    }
}
