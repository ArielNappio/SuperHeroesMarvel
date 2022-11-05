package com.example.proyectoarielnappio

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectoarielnappio.SuperHereoesCompanionObj.Companion.ListaDeSuperHeroes

class SuperHereoesAdapter(): RecyclerView.Adapter<SuperHereoesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHereoesViewHolder {
        val layaoutInflater = LayoutInflater.from(parent.context)
        return SuperHereoesViewHolder(layaoutInflater.inflate(R.layout.item_superheroe,parent,false))
    }

    override fun onBindViewHolder(holder: SuperHereoesViewHolder, position: Int) {
        val item = ListaDeSuperHeroes[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
     return  ListaDeSuperHeroes.size
    }
}