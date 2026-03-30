package com.example.socialspark

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//ViewCompact
        //Code goes below here vvv
        //Declarations
        //Elements

        val editTimeInput = findViewById<EditText>(R.id.editTimeInput)
        val tvSuggestion = findViewById<TextView>(R.id.tvSuggestion)
        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        val tvSubtitle = findViewById<TextView>(R.id.tvSubtitle)
        val btnGetSuggestion = findViewById<Button>(R.id.btnGetSuggestion)
        val btnReset = findViewById<Button>(R.id.btnReset)

        btnGetSuggestion.setOnClickListener()
        {
            //Store input from element in variables
            val userInput = editTimeInput.text.toString().trim()
            val time = userInput.lowercase()
            //Let check the user's input
            if (time == "morning") {
                tvSuggestion.text = "Send a 'Good morning' text to a family member"

            } else if (time == "mid-morning") {
                tvSuggestion.text = "Send a quick 'Thank you' to a colleague"

            } else if (time == "afternoon") {
                tvSuggestion.text = "Share a funny meme or interesting link with a friend"

            } else if (time == "afternoon snack time") {
                tvSuggestion.text = "Send a 'thinking of you' message"

            } else if (time == "dinner") {
                tvSuggestion.text = "Call a friend or relative for a 5-minute catch-up"

            } else if (time == "night" || time == "after dinner") {
                tvSuggestion.text = "Leave a thoughtful comment on a friends post"

            } else {
                tvSuggestion.text = "Pleas try something like Morning, Afternoon, or Dinner"
            }
        }
        //btnGetSuggestion.setOnClickListener
        btnReset.setOnClickListener {
            editTimeInput.text.clear()
            tvSuggestion.text = ""
        }
        //btnGetSuggestion.setOnClickListener
        //code goes above here ^^^
    }//override fun onCreate
}//class MainActivity
