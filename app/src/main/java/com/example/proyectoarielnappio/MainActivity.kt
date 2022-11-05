package com.example.proyectoarielnappio

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // SuperHereoesCompanionObj.ListaDeSuperHeroes
        setContentView(R.layout.activity_main)





        inicioDelRecyclerView()

    }

    fun inicioDelRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerH)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SuperHereoesAdapter()
        }

}