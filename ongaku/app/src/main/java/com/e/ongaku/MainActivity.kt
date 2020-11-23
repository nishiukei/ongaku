package com.e.ongaku

import android.media.AudioAttributes
import android.media.MediaPlayer
import android.media.SoundPool
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    lateinit var bgm: MediaPlayer
    lateinit var soundPool: SoundPool
    var sound1 = 0
    var sound2 = 0
    var sound3 = 0
    var sound4 = 0
    var sound5 = 0
    var sound6 = 0


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bgm = MediaPlayer.create(this,R.raw.drum)
        bgm.isLooping=true

        val audioAttributes=AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
            .build()

            soundPool = SoundPool.Builder()
                    .setAudioAttributes(audioAttributes)
                    .setMaxStreams(6)
                    .build()
            sound1=soundPool.load(this,R.raw.sound1,1)
            sound2=soundPool.load(this,R.raw.sound2,1)
            sound3=soundPool.load(this,R.raw.sound3,1)
            sound4=soundPool.load(this,R.raw.sound4,1)
            sound5=soundPool.load(this,R.raw.sound5,1)
            sound6=soundPool.load(this,R.raw.sound6,1)


        val startButton = findViewById<ImageButton>(R.id.imageButton)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        var flag = 0
        startButton.setOnClickListener {
            when (flag) {
                0 -> {
                    startButton.setImageResource(R.drawable.cdj)
                    flag = 1
                    bgm.start()
                }
                1 -> { startButton.setImageResource(R.drawable.tante)
                       flag = 2
                       bgm.pause()
                }
                2 -> {
                    startButton.setImageResource(R.drawable.cdj)
                    flag = 1
                    bgm.start()
                }
            }
        }

        button1.setOnClickListener {
            soundPool.play(sound1, 1.0f, 1.0f, 0, 0, 1.0f)
        }
        button2.setOnClickListener {
            soundPool.play(sound2, 1.0f, 1.0f, 0, 0, 1.0f)
        }
        button3.setOnClickListener {
            soundPool.play(sound3, 1.0f, 1.0f, 0, 0, 1.0f)
        }
        button4.setOnClickListener {
            soundPool.play(sound4, 1.0f, 1.0f, 0, 0, 1.0f)
        }
        button5.setOnClickListener {
            soundPool.play(sound5, 1.0f, 1.0f, 0, 0, 1.0f)
        }
        button6.setOnClickListener {
            soundPool.play(sound6, 1.0f, 1.0f, 0, 0, 1.0f)
        }

    }
}