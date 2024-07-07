package com.example.myapplication

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val btnPrev: ImageButton = findViewById(R.id.btnPrev)
        val btnNext: ImageButton = findViewById(R.id.btnNext)

        val monuments = listOf(
            Monument("Taj Mahal", "A beautiful mausoleum in Agra.", R.drawable.taj_mahal),
            Monument("Lotus Temple", "A Baháʼí House of Worship in New Delhi.", R.drawable.lotus_temple),
            Monument("Red Fort", "Historic fort in the city of Delhi in India.", R.drawable.red_fort),
            Monument("India Gate", "A war memorial located astride the Rajpath.", R.drawable.india_gate),
            Monument("Qutub Minar", "A minaret that forms part of the Qutb complex.", R.drawable.qutub_minar),
            Monument("Humayun's Tomb", "Tomb of the Mughal Emperor Humayun in Delhi.", R.drawable.sanchi_stupa),
            Monument("Hawa Mahal", "A palace in Jaipur, India.", R.drawable.hawa_mahal),
            Monument("Mysore Palace", "A historical palace in the city of Mysore.", R.drawable.charminar)
        )

        viewPager.adapter = MonumentPagerAdapter(monuments)

        // Set click listeners for buttons
        btnPrev.setOnClickListener {
            val currentItem = viewPager.currentItem
            if (currentItem > 0) {
                viewPager.currentItem = currentItem - 1
            }
        }

        btnNext.setOnClickListener {
            val currentItem = viewPager.currentItem
            if (currentItem < monuments.size - 1) {
                viewPager.currentItem = currentItem + 1
            }
        }
    }
}
