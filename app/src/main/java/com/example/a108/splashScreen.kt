package com.example.a108

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashImg = findViewById<ImageView>(R.id.logo)
        val slideAnim = AnimationUtils.loadAnimation(this,R.anim.sideslide)
        splashImg.startAnimation(slideAnim)


        Handler().postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },4000)
    }
}