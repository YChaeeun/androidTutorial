package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.stop_watch.*
import java.util.Timer
import kotlin.concurrent.timer

private var time = 0
private var timerTask:Timer? = null
private var isRunning = false

class TimerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stop_watch)

        pauseFAB.setOnClickListener{
            isRunning = !isRunning

            if (isRunning){
                start()
            } else {
                pause()
            }
        }
    }

    private fun pause() {
        pauseFAB.setImageResource(R.drawable.ic_play_arrow_black_24dp)
        timerTask?.cancel()
    }

    private fun start() {
        pauseFAB.setImageResource(R.drawable.ic_pause_black_24dp)

        timerTask = timer(period = 10){
            time++

            val sec = time / 100
            val milli = time % 100

            // 워커스레드에서는 UI조작을 못하기 때문에 runOnUiThread 로 감싼 영역에서 UI 조작
            runOnUiThread {
                timeSec.text = "$sec"
                timeMilliSec.text = "$milli"
            }
        }
    }

}
