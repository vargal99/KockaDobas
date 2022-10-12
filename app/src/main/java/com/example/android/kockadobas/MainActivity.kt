package com.example.android.kockadobas

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dobasGomb: Button = findViewById(R.id.button)
        dobasGomb.setOnClickListener {

            val toast = Toast.makeText(this, "A dobás megtörtént", Toast.LENGTH_SHORT)
            toast.show()


            kockaDobas()
        }


    }

    //"Dobás" funkció
    private fun kockaDobas() {
        val dobokocka = Kocka(6)
        val kockaErtek = dobokocka.dobas()

        val dobokocka2 = Kocka(6)
        val kockaErtek2 = dobokocka2.dobas()

        val kockakep: ImageView = findViewById(R.id.imageView)
        when (kockaErtek) {
            1 -> kockakep.setImageResource(R.drawable.dice_1)
            2 -> kockakep.setImageResource(R.drawable.dice_2)
            3 -> kockakep.setImageResource(R.drawable.dice_3)
            4 -> kockakep.setImageResource(R.drawable.dice_4)
            5 -> kockakep.setImageResource(R.drawable.dice_5)
            6 -> kockakep.setImageResource(R.drawable.dice_6)
        }


        val kockakep2: ImageView = findViewById(R.id.imageView2)
        when (kockaErtek2) {
            1 -> kockakep2.setImageResource(R.drawable.dice_1)
            2 -> kockakep2.setImageResource(R.drawable.dice_2)
            3 -> kockakep2.setImageResource(R.drawable.dice_3)
            4 -> kockakep2.setImageResource(R.drawable.dice_4)
            5 -> kockakep2.setImageResource(R.drawable.dice_5)
            6 -> kockakep2.setImageResource(R.drawable.dice_6)

        }

    }

    class Kocka(val oldalak: Int) {


        fun dobas(): Int {
            val veletlenSzam = (1..oldalak).random()
            return veletlenSzam
        }
    }

    }
