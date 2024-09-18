package com.figmatask.ui

import android.content.Intent
import android.health.connect.datatypes.units.Length
import android.nfc.Tag
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.figmatask.MainActivity
import com.figmatask.R

class WelcomeActivity : AppCompatActivity() {
    lateinit var imgView: ImageView
    lateinit var welcome_txt: TextView
    lateinit var welcome_note: TextView
    lateinit var signup_btn: Button
    lateinit var signin_btn: Button
    lateinit var terms_txt: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        var imgView = findViewById<ImageView>(R.id.imageIcon)
        var welcome_txt = findViewById<TextView>(R.id.welcomeTv)
        var welcome_note = findViewById<TextView>(R.id.welcomeNoteTv)
        var signup_btn = findViewById<Button>(R.id.signupButton)
        var signin_btn = findViewById<Button>(R.id.signinButton)
        var terms_txt = findViewById<TextView>(R.id.termsText)

        signup_btn.setOnClickListener{
            Toast.makeText(this, "Please Click Login..", Toast.LENGTH_SHORT).show()
        }

        signin_btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}