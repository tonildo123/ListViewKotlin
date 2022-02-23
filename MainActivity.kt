package com.example.kotlinlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list = findViewById<ListView>(R.id.listViewK)
        val texto = findViewById<TextView>(R.id.tvTitle)

        val paises = arrayOf("Argentina","EEUU","Rusia","Brasil","Australia")
        val poblacion = arrayOf(40,200,300,200,80)


        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises)
        list.adapter = adaptador

        list.setOnItemClickListener {  adapterView, view, i, l ->
            texto.text = "Población de: ${poblacion[i]}"}


    }
}

/// tengo que ver los cambios 23/02/2022


