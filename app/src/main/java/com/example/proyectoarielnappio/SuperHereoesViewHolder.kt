package com.example.proyectoarielnappio

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class SuperHereoesViewHolder(view: View) :RecyclerView.ViewHolder(view) {


    val superHereo = view.findViewById<TextView>(R.id.Nombre)
    val editorial = view.findViewById<TextView>(R.id.editoriaal)
    val nombreReal = view.findViewById<TextView>(R.id.nombreREAL)
    val photo = view.findViewById<ImageView>(R.id.imagenSuper)

    fun render(superHeroesM: SuperHeroes){
        superHereo.text = superHeroesM.nombre
        editorial.text = superHeroesM.editorial
        nombreReal.text = superHeroesM.nombreReal
       // photo. = superHeroesM.fotoDelPersonaje

        Glide.with(photo.context).load(superHeroesM.fotoDelPersonaje).into(photo)
    }
}