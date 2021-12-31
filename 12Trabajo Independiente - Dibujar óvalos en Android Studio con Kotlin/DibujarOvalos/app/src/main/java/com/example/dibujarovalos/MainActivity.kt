package com.example.dibujarovalos

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
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
        supportActionBar!!.hide()
    }

    class Lienzo(context: Context) : View(context) {

        override fun onDraw(canvas: Canvas) {
            canvas.drawRGB(255, 255, 255)
            val ancho = getWidth()
            val alto = getHeight()

            val pincel1 = Paint()
            pincel1.setARGB(255, 0, 0, 0)
            pincel1.setStrokeWidth(5f)
            pincel1.setStyle(Paint.Style.STROKE)
            val rectangulo1 = RectF(0f, 0f, ancho.toFloat(), alto.toFloat())
            canvas.drawOval(rectangulo1, pincel1)

            val menor: Int
            if (ancho < alto)
                menor = ancho
            else
                menor = alto

            pincel1.setStyle(Paint.Style.FILL)
            pincel1.setARGB(255, 255, 255, 0)
            canvas.drawCircle((ancho / 2).toFloat(), (alto / 2).toFloat(), (menor / 2).toFloat(), pincel1)
        }
    }
}