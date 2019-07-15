package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bmi_calculator.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi_calculator)

        resultButton.setOnClickListener {
            startActivity<ResultActivity>(
                "height" to heightEdit.text.toString(),
                "weight" to weightEdit.text.toString()
            )
        }
        timer.setOnClickListener {
            startActivity<TimerActivity>()
        }
    }
}
