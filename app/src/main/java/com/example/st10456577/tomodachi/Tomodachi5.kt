package com.example.st10456577.tomodachi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity<int> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tomodachi5)
    }
    private lateinit var feedProgressBar: ProgressBar
    private lateinit var cleanProgressBar: ProgressBar
    private lateinit var playProgressBar: ProgressBar


    private var feedProgressStatus: Int = 0
    private var cleanProgressStatus: Int = 0
    private var playProgressStatus: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v,
                                                                             insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        feedProgressBar = findViewById(R.id.feedProgressBar)
        cleanProgressBar = findViewById(R.id.cleanProgressBar)
        playProgressBar = findViewById(R.id.playProgressBar)
    }
        val buttonFeed = findViewById<Button>(R.id.buttonFeed)
        val buttonClean = findViewById<Button>(R.id.buttonClean)
        val buttonPlay = findViewById<Button>(R.id.buttonPlay)

        buttonFeed.setOnClickListener{
            feedProgressStatus = 0
            feedProgressBar.progress =
                Thread(Runnable{
                    while(feedProgressStatus < 100){
                        feedProgressStatus +=5
                        Thread.sleep(1000)
                        runOnUiThread {
                            feedProgressBar.progress =feedProgressStatus

                        }
                    }
                    runOnUiThread {

                    }
                }).start()

        buttonClean.setOnClickListener{
            cleanProgressStatus = 0
            cleanProgressBar.progress =
                Thread(Runnable{
                    while(cleanProgressStatus < 100){
                        cleanProgressStatus +=5
                        Thread.sleep(1000)
                        runOnUiThread {
                            cleanProgressBar.progress =cleanProgressStatus

                        }
                    }
                    runOnUiThread {

                    }
                }).start()

            buttonPlay.setOnClickListener{
                playProgressStatus = 0
                playProgressBar.progress =
                    Thread(Runnable{

                        while(playProgressStatus < 100){
                            playProgressStatus +=5
                        }
                            Thread.sleep(1000)
                            runOnUiThread {
                                playProgressBar.progress =playProgressStatus

                            }
                        }
                        runOnUiThread {

                        }
                    }).start()



    }
        }


