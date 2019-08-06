package com.example.pets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    var MyPets = arrayOf("Rainbow", "Jasmine", "Fatty", "Lira", "Rollie")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (Petlist in MyPets) {
            (findViewById<LinearLayout>(R.id.ListofMyPets)).addView(genTextView(Petlist))
        }

    }

    fun genTextView(animals: String): TextView {
        val view = TextView(this)
        view.text = animals
        view.setTextColor(resources.getColor(R.color.colorPrimary))
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16f)
        return view
    }

}
