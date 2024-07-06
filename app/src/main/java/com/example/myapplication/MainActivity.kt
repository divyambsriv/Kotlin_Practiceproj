@file:Suppress("DEPRECATION")

package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private var currentImage = 0
    lateinit var image : ImageView
    var places = arrayOf("Taj Mahal","Lotus Temple","India Gate","Golden Temple","Gateway of India","Sanchi Stupa","Char Minar","Red Fort")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prev = findViewById<ImageButton>(R.id.btnPrev)
        val next = findViewById<ImageButton>(R.id.btnNext)
        val placename = findViewById<TextView>(R.id.tVName)

        next.setOnClickListener {
            var idcurrentimageString = "pic$currentImage"

            var idcurrentimageInt = this.resources.getIdentifier(idcurrentimageString, "id", packageName)
            image = findViewById(idcurrentimageInt)
            image.alpha = 0f

            currentImage = (8+currentImage+1)%8
            var idImagetoshowString = "pic$currentImage"
            var idImagetoshowInt = this.resources.getIdentifier(idImagetoshowString, "id", packageName)
            image = findViewById(idImagetoshowInt)
            image.alpha = 1f
            placename.text=places[currentImage]

        }


        prev.setOnClickListener {
            var idcurrentimageString = "pic$currentImage"

            var idcurrentimageInt = this.resources.getIdentifier(idcurrentimageString, "id", packageName)
            image = findViewById(idcurrentimageInt)
            image.alpha = 0f

            currentImage = (7+currentImage-1)%7
            var idImagetoshowString = "pic$currentImage"
            var idImagetoshowInt = this.resources.getIdentifier(idImagetoshowString, "id", packageName)
            image = findViewById(idImagetoshowInt)
            image.alpha = 1f
            placename.text=places[currentImage]

        }
    }
}


