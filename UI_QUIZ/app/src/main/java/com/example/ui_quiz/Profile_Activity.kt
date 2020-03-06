package com.example.ui_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Profile_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val bundle = intent.extras

        //get data from activity
        val intent = intent
        val get_name_student = intent.getStringExtra("name")
        val get_idstudent = intent.getStringExtra("idstu")
        val get_major = intent.getStringExtra("major")
        val get_icon = bundle!!.getInt("icon")

        //get ID from view
        val profile = findViewById<ImageView>(R.id.profile)
        val namestudent = findViewById<TextView>(R.id.name)
        val idstudent = findViewById<TextView>(R.id.idstudent)
        val major = findViewById<TextView>(R.id.major)


        profile.setImageResource(get_icon)
        namestudent.text = get_name_student
        idstudent.text = get_idstudent
        major.text = get_major
    }
}
