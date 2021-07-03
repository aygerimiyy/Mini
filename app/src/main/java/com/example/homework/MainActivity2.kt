package com.example.homework

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn.setOnClickListener {
            val san1 = birsan.text.toString()
            val san2 = ekisan.text.toString()
            val san3 = amel.text.toString()
            var resultt: Double = 0.0
            if (san3.isNotEmpty() && san1.isNotEmpty() && san2.isNotEmpty()) {
                when (san3) {
                    "+" -> resultt = san1.toDouble() + san2.toDouble()
                    "-" -> resultt = san1.toDouble() - san2.toDouble()
                    "/" -> resultt = san1.toDouble() / san2.toDouble()
                    "*" -> resultt = san1.toDouble() * san2.toDouble()
                }
                result.text = resultt.toString()
            } else {
                if (san1.isEmpty()) {birsan.error="Meni toltir"}
                if (san2.isEmpty()) {ekisan.error="Meni toltir"}
                if (san3.isEmpty()) {amel.error="Meni toltir"}
            }
        }
        clear.setOnClickListener {
            birsan.text!!.clear()
            ekisan.text!!.clear()
            amel.text!!.clear()
            result.text = ""
            birsan.error=""
            ekisan.error = ""
            amel.error = ""
        }

    }
}

