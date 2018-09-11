package com.example.oldspice.android_audio

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Creamos la accion a realizar al presionar el boton
        button.setOnClickListener {

            //Usaremos la clase "Media Player", creamos un objeto y le indicamos
            //el contexto (this) y en donde se encuentra nuestro sonido
            //la URL = R.raw.sonido y declaramos .start para escucharlo
            val mediaPlayer = MediaPlayer.create(this, R.raw.sonido).start()
        }
    }
}
