package com.example.a108

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class Videoscreen : AppCompatActivity() {
    lateinit var vido: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videoscreen)

        vido = findViewById(R.id.videoView)
        val videoUrl = "android.resource://" + packageName + "/" + R.raw.videoplayback

        // Uri object to refer the
        // resource from the videoUrl

        val uri = Uri.parse(videoUrl)

        // sets the resource from the
        // videoUrl to the videoView
        vido.setVideoURI(uri)

        // creating object of
        // media controller class


        val mediaController = MediaController(this)

        // sets the anchor view
        // anchor view for the videoView
        mediaController.setAnchorView(vido)

        // sets the media player to the videoView
        mediaController.setMediaPlayer(vido)

        // sets the media controller to the videoView
        vido.setMediaController(mediaController);

        // starts the video
        vido.start();
    }
}