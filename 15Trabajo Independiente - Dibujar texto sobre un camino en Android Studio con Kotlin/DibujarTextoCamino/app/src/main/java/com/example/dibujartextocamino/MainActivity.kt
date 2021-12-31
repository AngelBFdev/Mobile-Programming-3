package com.example.dibujartextocamino

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
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
            canvas.drawRGB(0, 0, 0)
            val alto = getHeight()
            val camino = Path()
            camino.moveTo(20f, (alto / 2).toFloat())
            camino.lineTo(60f, (alto / 2 - 30).toFloat())
            camino.lineTo(100f, (alto / 2 - 60).toFloat())
            camino.lineTo(140f, (alto / 2 - 90).toFloat())
            camino.lineTo(180f, (alto / 2 - 120).toFloat())
            camino.lineTo(240f, (alto / 2 - 150).toFloat())
            camino.lineTo(300f, (alto / 2 - 180).toFloat())
            camino.lineTo(360f, (alto / 2 - 210).toFloat())
            val pincel1 = Paint()
            pincel1.setARGB(255, 255, 0, 0)
            pincel1.setTextSize(80f)
            canvas.drawTextOnPath("Hola Mundo", camino, 0f, 0f, pincel1)
        }
    }
}