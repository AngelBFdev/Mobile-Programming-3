package com.example.indemediarecorder

import android.media.MediaPlayer
import android.media.MediaRecorder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.io.IOException

class MainActivity : AppCompatActivity(),MediaPlayer.OnCompletionListener {

    lateinit var recorder: MediaRecorder
    lateinit var player: MediaPlayer
    lateinit var archivo: File

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener {
            recorder = MediaRecorder()
            recorder.setAudioSource(MediaRecorder.AudioSource.MIC)
            recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP)
            recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB)
            val path = File(Environment.getExternalStorageDirectory()
                    .getPath())
            try {
                archivo = File.createTempFile("temporal", ".3gp", path)
            } catch (e: IOException) {
            }

            recorder.setOutputFile(archivo.absolutePath)
            try {
                recorder.prepare()
            } catch (e: IOException) {
            }

            recorder.start()
            tv1.text ="Grabando"
            b1.setEnabled(false)
            b2.setEnabled(true)
        }

        b2.setOnClickListener {
            recorder.stop()
            recorder.release()
            player = MediaPlayer()
            player.setOnCompletionListener(this)
            try {
                player.setDataSource(archivo.absolutePath)
            } catch (e: IOException) {
            }

            try {
                player.prepare()
            } catch (e: IOException) {
            }

            b1.setEnabled(true)
            b2.setEnabled(false)
            b3.setEnabled(true)
            tv1.text = "Listo para reproducir"
        }

        b3.setOnClickListener {
            player.start();
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            tv1.setText("Reproduciendo");
        }
    }
    override fun onCompletion(mp: MediaPlayer) {
        b1.setEnabled(true)
        b2.setEnabled(true)
        b3.setEnabled(true)
        tv1.setText("Listo")
    }
}