package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlanetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var nameTextView: TextView = itemView.findViewById(R.id.textview_name)
}

class PlanetsAdapter(val planets: List<Planet>): RecyclerView.Adapter<PlanetViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_planet, parent, false)
        return PlanetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.nameTextView.setText(planets.get(position).name)
    }

    override fun getItemCount(): Int {
        return planets.count()
    }
}