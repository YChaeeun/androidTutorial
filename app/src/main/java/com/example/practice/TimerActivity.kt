package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.stop_watch_2.*
import java.util.Timer
import kotlin.concurrent.timer

private var time = 0
private var timerTask:Timer? = null
private var isRunning = false
private var lap = 1

class TimerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stop_watch_2)

        pauseFAB.setOnClickListener{
            isRunning = !isRunning

            if (isRunning){
                start()
            } else {
                pause()
            }
        }

        labTime.setOnClickListener {
            recordLapTime()
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

    private fun recordLapTime(){
        val lapTime = time
        val textView = TextView(this)
        textView.text = "$lap LAB : ${lapTime / 100}.${lapTime % 100}"

        scrollLAB.addView(textView, 0)
        lap++
    }
}

