package com.example.dibujarfondolineas1

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
            canvas.drawRGB(255, 255, 0)
            val ancho = getWidth()
            val pincel1 = Paint()
            pincel1.setARGB(255, 255, 0, 0)
            canvas.drawLine(0f, 30f, ancho.toFloat(), 30f, pincel1)
            pincel1.setStrokeWidth(4f)
            canvas.drawLine(0f, 60f, ancho.toFloat(), 60f, pincel1)
        }
    }
}