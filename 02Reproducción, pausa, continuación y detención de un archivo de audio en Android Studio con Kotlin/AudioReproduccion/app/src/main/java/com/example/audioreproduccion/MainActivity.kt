package com.example.audioreproduccion

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var  mp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mp = MediaPlayer.create(this, R.raw.numeros)
        var posicion = 0

        b1.setOnClickListener {
            mp.start()
            if (b5.text == "No Loop")
                mp.isLooping = false
            else
                mp.isLooping = true
        }

        b2.setOnClickListener {
            if (mp.isPlaying()) {
                posicion = mp.getCurrentPosition()
                mp.pause()
            }
        }

        b3.setOnClickListener {
            if (mp.isPlaying() == false) {
                mp.seekTo(posicion)
                mp.start()
            }
        }

        b4.setOnClickListener {
            mp.pause()
            posicion = 0
            mp.seekTo(0)
        }

        b5.setOnClickListener {
            if (b5.text  == "No Loop")
                b5.setText("Loop")
            else
                b5.setText("No Loop")
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        mp.release()
    }
}