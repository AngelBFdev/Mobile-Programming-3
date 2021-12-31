package com.example.dibujarfondolineas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.opengl.ETC1
import android.opengl.ETC1.getHeight
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
            val alto= getHeight()
            val pincel1 = Paint()
            pincel1.setARGB(255, 0, 0, 0)
            canvas.drawLine(120f, 0f, 120f, alto.toFloat(), pincel1)
            for(x in 1..(alto/50)) {
                canvas.drawLine(0f, (x*60+120).toFloat(), ancho.toFloat(), (x*60+120).toFloat(), pincel1)
            }
        }
    }
}