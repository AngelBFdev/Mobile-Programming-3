package com.example.dibujartextoexterno

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

        override fun onDraw(canvas: Canvas) {
            canvas.drawRGB(255, 255, 255)
            val pincel1 = Paint()
            pincel1.setARGB(255, 0, 0, 0)
            pincel1.setTextSize(80f)
            val face = Typeface.createFromAsset(getContext().getAssets(),  "Action Jackson.ttf")
            pincel1.setTypeface(face)
            canvas.drawText("Hola Mundo", 0f, 120f, pincel1)
        }
    }
}