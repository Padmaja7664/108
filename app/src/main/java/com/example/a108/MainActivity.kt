package com.example.a108

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var currimg=0
    lateinit var image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prev=findViewById<ImageView>(R.id.imgprev)
        val next=findViewById<ImageView>(R.id.imgnext)
        val video = findViewById<ImageView>(R.id.vidPlay)

        prev.setOnClickListener {
            val idcurrimg ="pic$currimg" //we got id in string format so we need to convert it into integer
            val idcurrimgint =this.resources.getIdentifier(idcurrimg,"id",packageName)

            image=findViewById(idcurrimgint)
            image.alpha=0f  //for making image invisible

            currimg=(9+currimg-1)%9;

            val idtoshow ="pic$currimg" //we got id in string format so we need to convert it into integer
            val idtoshowint =this.resources.getIdentifier(idtoshow,"id",packageName)

            image=findViewById(idtoshowint)
            image.alpha=1f    // to make image visible

        }

        next.setOnClickListener {

            val idcurrimg ="pic$currimg" //we got id in string format so we need to convert it into integer
            val idcurrimgint =this.resources.getIdentifier(idcurrimg,"id",packageName)

            image=findViewById(idcurrimgint)
            image.alpha=0f

            currimg=(9+currimg+1)%9;

            val idtoshow ="pic$currimg" //we got id in string format so we need to convert it into integer
            val idtoshowint =this.resources.getIdentifier(idtoshow,"id",packageName)

            image=findViewById(idtoshowint)
            image.alpha=1f
        }

        video.setOnClickListener {

          val intent =Intent(this,Videoscreen::class.java)
            startActivity(intent)
            finish()
        }

    }
}