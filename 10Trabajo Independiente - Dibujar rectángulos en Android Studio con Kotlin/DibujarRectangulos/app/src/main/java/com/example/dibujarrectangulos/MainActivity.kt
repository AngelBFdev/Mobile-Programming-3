package com.example.dibujarrectangulos

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
            val pincel1 = Paint()

            pincel1.setARGB(255, 255, 0, 0)
            canvas.drawRect(10f, 10f, (ancho - 10).toFloat(), 40f, pincel1)

            pincel1.setStyle(Paint.Style.STROKE)
            canvas.drawRect(10f, 60f, (ancho - 10).toFloat(), 90f, pincel1)

            pincel1.setStrokeWidth(3f)
            canvas.drawRect(10f, 110f, (ancho - 10).toFloat(), 140f, pincel1)

        }
    }
}