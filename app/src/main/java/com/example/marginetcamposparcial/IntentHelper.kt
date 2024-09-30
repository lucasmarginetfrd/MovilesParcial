package com.example.marginetcamposparcial

import android.content.Context
import android.content.Intent

class IntentHelper {
    fun getIntent(nombre: String, deporte: String, actividad: String, context: Context) {
        val intent = Intent(context, SecondActivity::class.java)
        intent.putExtra("nombre", nombre)
        intent.putExtra("deporte", deporte)
        intent.putExtra("actividad", actividad)
        context.startActivity(intent)
    }
}