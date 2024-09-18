package com.figmatask.ui

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.view.View
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.figmatask.MainActivity
import com.figmatask.R
import java.util.logging.Handler

class SplashActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash)

            // This is used to hide the status bar and make
            // the splash screen as a full screen activity.
//            window.setFlags(
//                WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN
//            )

            window.decorView.apply {
                // Hide both the navigation bar and the status bar.
                // SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
                // a general rule, you should design your app to hide the status bar whenever you
                // hide the navigation bar.
                systemUiVisibility = android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
            }
            // we used the postDelayed(Runnable, time) method
            // to send a message with a delayed time.
            //Normal Handler is deprecated , so we have to change the code little bit

            // Handler().postDelayed({
            android.os.Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
                finish()
            }, 2000) // 3000 is the delayed time in milliseconds.
        }
    }
