package com.example.homework

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
             zvanok.setOnClickListener {
                 val rasm = edit.text.toString()
                 if (rasm.isNotEmpty()) {
                     val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode(rasm)))
                     startActivity(intent)
                 } else {
                     Toast.makeText(this, "Polyani toltirin", Toast.LENGTH_LONG).show()
                 }
             }

                     google.setOnClickListener {
                         val rasm1 = edit1.text.toString()
                         if (rasm1.isNotEmpty()) {
                             val intent = Intent(Intent.ACTION_VIEW)
                             intent.setData(Uri.parse("https://google.com"));
                             startActivity(intent)
                         } else {
                             Toast.makeText(this, "Polyani toltirin", Toast.LENGTH_LONG).show()
                         }
                     }
                    market.setOnClickListener {
                        val rasm2 = edit2.text.toString()
                        if (rasm2.isNotEmpty()) {
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.setData(Uri.parse("https://play.google.com"));
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, "Polyani toltirin", Toast.LENGTH_LONG).show()
                        }
                    }
                 }

             }
