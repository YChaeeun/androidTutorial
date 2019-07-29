package com.example.practice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.calc_layout.*

class CalcActivity: AppCompatActivity() {

    var cnt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calc_layout)

        val h = intent?.getStringExtra("hi")
        val w = intent?.getStringExtra("wi")

        btn_reset_intent.setOnClickListener {
            ingre.text = h
            ingre2.text = w
        }

        btn_mul2.setOnClickListener {
            val num: Int = textNum.text.toString().toInt() * 5
            Log.d("형변환 되어줘!!", " " + (num * 5))

//            Log.d("로그 메시지", "내가 보고 싶은거")
            showMulResult.text = num.toString()
        }

        delNum.setOnClickListener{
            textNum.text = ""
        }

        num0.setOnClickListener {
            if (cnt < 5){
                textNum.text = textNum.text.toString().plus("0")
                cnt++
            } else {
                textNum.text = ""
                cnt = 0
            }

        }
        num1.setOnClickListener {
            textNum.text = textNum.text.toString().plus("1")
        }
        num2.setOnClickListener {
            textNum.text = textNum.text.toString().plus("2")
        }
        num3.setOnClickListener {
            textNum.text = textNum.text.toString().plus("3")
        }
        num4.setOnClickListener {
            textNum.text = textNum.text.toString().plus("4")
        }
        num5.setOnClickListener {
            textNum.text = textNum.text.toString().plus("5")
        }
        num6.setOnClickListener {
            textNum.text = textNum.text.toString().plus("6")
        }
        num7.setOnClickListener {
            textNum.text = textNum.text.toString().plus("7")
        }
        num8.setOnClickListener {
            textNum.text = textNum.text.toString().plus("8")
        }
        num9.setOnClickListener {
            textNum.text = textNum.text.toString().plus("9")
        }
    }
}