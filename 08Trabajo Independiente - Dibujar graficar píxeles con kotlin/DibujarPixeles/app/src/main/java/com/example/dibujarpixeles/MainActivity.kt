package com.example.dibujarpixeles

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
            canvas.drawRGB(0,0,0)
            val ancho = getWidth()
            val alto = getHeight()
            val pincel1 = Paint()
            pincel1.setARGB(255, 255, 255, 255)
            for(x in 1..10000) {
                var alex = (Math.random() * ancho).toFloat()
                var aley = (Math.random() * alto).toFloat()
                canvas.drawPoint(alex, aley , pincel1)
            }
        }
    }
}