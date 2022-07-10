package com.example.paramireina.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.paramireina.R
import com.example.paramireina.modelo.Recuerdo

class RecuerdoAdapter(private val context: Context, private val lista: List<Recuerdo>): RecyclerView.Adapter<RecuerdoAdapter.RecuerdoHolder>() {
    class RecuerdoHolder(private val view:View): RecyclerView.ViewHolder(view) {
            val imageview:ImageView = view.findViewById(R.id.item_imagen)
            val texttitulo:TextView = view.findViewById(R.id.item_titulo)
            val textfecha:TextView = view.findViewById(R.id.item_fecha)
            val textfrase:TextView = view.findViewById(R.id.item_frase)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecuerdoHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_recuerdo,parent,false)
        return RecuerdoHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: RecuerdoHolder, position: Int) {
        val item = lista[position]
        holder.imageview.setImageResource(item.idRecursoImagen)
        holder.texttitulo.text = context.resources.getString(item.idRecursoCadena1)
        holder.textfecha.text = context.resources.getString(item.idRecursoCadena2)
        holder.textfrase.text = context.resources.getString(item.idRecursoCadena3)

    }

    override fun getItemCount(): Int = lista.size

}