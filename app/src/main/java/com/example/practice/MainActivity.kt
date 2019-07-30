package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bmi_calculator.*
import org.jetbrains.anko.sdk27.coroutines.onClick
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

        list.setOnClickListener {
            startActivity<ListviewActivity>()
        }

        click()
    }

    fun click() {
        btn_calc.onClick {
            startActivity<CalcActivity>(
                "hi" to heightEdit.text?.toString(),
                "wi" to weightEdit.text?.toString()
            )
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
