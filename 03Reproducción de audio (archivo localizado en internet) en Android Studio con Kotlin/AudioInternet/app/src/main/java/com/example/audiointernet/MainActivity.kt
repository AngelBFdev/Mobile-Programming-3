package com.example.audiointernet

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException

class MainActivity : AppCompatActivity(),MediaPlayer.OnPreparedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1.setOnClickListener {
            val mp = MediaPlayer()
            mp.setOnPreparedListener(this)
            try {
                mp.setDataSource("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3")
                mp.prepareAsync()
            } catch (e: IOException) {
                Toast.makeText(this, "Error al encontrar audio", Toast.LENGTH_SHORT).show()

            }
            Toast.makeText(this, "Espere un momento mientras se carga el mp3", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onPrepared(p0: MediaPlayer?) {
        p0?.start();
    }
}