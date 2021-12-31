package com.example.dibujarcirculoevento

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var corx = 0f
    var cory = 0f

    private lateinit var fondo: Lienzo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fondo = Lienzo(this)
        layout1.addView(fondo)
        fondo.setOnTouchListener { view, motionEvent ->
            corx = motionEvent.x
            cory = motionEvent.y
            fondo.invalidate()
            true
        }
    }

    inner class Lienzo(context: Context) : View(context) {

        override fun onDraw(canvas: Canvas) {
            canvas.drawRGB(255, 255, 0)
            val pincel1 = Paint()
            pincel1.setARGB(255, 255, 0, 0)
            pincel1.setStrokeWidth(4f)
            pincel1.setStyle(Paint.Style.STROKE)
            canvas.drawCircle(corx, cory, 20f, pincel1)
        }
    }
}