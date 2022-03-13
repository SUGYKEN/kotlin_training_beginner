package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // *******************
        // HappyBirthdayCard
        // *******************
//        setContentView(R.layout.activity_main)
        // *******************
        // Roll Dice
        // *******************
        setContentView(R.layout.activity_main2)


        // *******************
        // Roll Dice
        // *******************
        // button no id
        val rollButton: Button = findViewById(R.id.Roll)
        // use lambda
        rollButton.setOnClickListener {
            // show Toast
//            val toast = Toast.makeText(this, "Dice Rolled!!",Toast.LENGTH_LONG)
//            toast.show()
            rollDice()
        }
    }

    // *******************
    // Roll Dice
    // *******************
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.diceTextView)
        resultTextView.text = diceRoll.toString()
    }
}

// *******************
// Roll Dice
// *******************
// Dice Class
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}