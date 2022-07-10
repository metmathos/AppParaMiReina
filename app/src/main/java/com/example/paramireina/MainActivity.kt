package com.example.paramireina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.paramireina.adapter.RecuerdoAdapter
import com.example.paramireina.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val misRecuerdos = Datasource().cargarRecuerdos()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = RecuerdoAdapter(this,misRecuerdos)

        recyclerView.setHasFixedSize(true)

    }
}