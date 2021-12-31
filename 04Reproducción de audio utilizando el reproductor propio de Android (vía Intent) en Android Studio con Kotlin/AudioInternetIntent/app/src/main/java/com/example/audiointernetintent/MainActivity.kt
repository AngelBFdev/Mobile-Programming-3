package com.example.audiointernetintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val data = Uri.parse("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3")
            intent.setDataAndType(data, "audio/mp3")
            startActivity(intent)
        }
    }
}