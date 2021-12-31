package com.example.dibujarcirculos

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.opengl.ETC1.getWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fondo = Lienzo(this)
        layout1.addView(fondo)
    }
    class Lienzo(context: Context) : View(context) {

        override fun onDraw(canvas: Canvas) {
            canvas.drawRGB(255, 255, 255)
            val ancho = getWidth()
            val alto = getHeight()
            val pincel1 = Paint()
            pincel1.setARGB(255, 255, 0, 0)
            pincel1.setStyle(Paint.Style.STROKE)
            for (f in 0..9)
                canvas.drawCircle((ancho / 2).toFloat(), (alto / 2).toFloat(), (f * 15).toFloat(), pincel1)
        }
    }
}