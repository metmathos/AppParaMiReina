package com.example.paramireina.data

import com.example.paramireina.R
import com.example.paramireina.modelo.Recuerdo

class Datasource {
    fun cargarRecuerdos(): List<Recuerdo>{
        return listOf<Recuerdo>(
            Recuerdo(R.drawable.image1,R.string.titulo1,R.string.fecha1,R.string.frase1),
            Recuerdo(R.drawable.image2,R.string.titulo2,R.string.fecha2,R.string.frase2),
            Recuerdo(R.drawable.image3,R.string.titulo3,R.string.fecha3,R.string.frase3),
            Recuerdo(R.drawable.image4,R.string.titulo4,R.string.fecha4,R.string.frase4),
            Recuerdo(R.drawable.image5,R.string.titulo5,R.string.fecha5,R.string.frase5),
            Recuerdo(R.drawable.image6,R.string.titulo6,R.string.fecha6,R.string.frase6),
            Recuerdo(R.drawable.image7,R.string.titulo7,R.string.fecha7,R.string.frase7),
            Recuerdo(R.drawable.image8,R.string.titulo8,R.string.fecha8,R.string.frase8),
            Recuerdo(R.drawable.image9,R.string.titulo9,R.string.fecha9,R.string.frase9),
            Recuerdo(R.drawable.image10,R.string.titulo10,R.string.fecha10,R.string.frase10)

        )
    }


}