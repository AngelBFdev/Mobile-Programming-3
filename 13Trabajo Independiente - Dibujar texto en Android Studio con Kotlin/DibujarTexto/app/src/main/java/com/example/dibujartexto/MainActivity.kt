package com.example.dibujartexto

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Typeface
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

        @SuppressLint("WrongConstant")
        override fun onDraw(canvas: Canvas) {
            canvas.drawRGB(0, 0, 0)
            val pincel1 = Paint()
            pincel1.setARGB(255, 255, 0, 0)
            pincel1.setTextSize(60f)
            pincel1.setTypeface(Typeface.SERIF)
            canvas.drawText("Hola Mundo (SERIF)", 10f, 100f, pincel1)

            pincel1.setTypeface(Typeface.SANS_SERIF)
            canvas.drawText("Hola Mundo (SANS SERIF)", 10f, 200f, pincel1)

            pincel1.setTypeface(Typeface.MONOSPACE)
            canvas.drawText("Hola Mundo (MONOSPACE)", 10f, 300f, pincel1)

            var tf = Typeface.create(Typeface.SERIF, Typeface.ITALIC)
            pincel1.setTypeface(tf)
            canvas.drawText("Hola Mundo (SERIF ITALIC)", 10f, 400f, pincel1)

            tf = Typeface.create(Typeface.SERIF, Typeface.BOLD or Typeface.ITALIC)
            pincel1.setTypeface(tf)
            canvas.drawText("Hola Mundo (SERIF ITALIC BOLD)", 10f, 500f, pincel1)
        }
    }
}