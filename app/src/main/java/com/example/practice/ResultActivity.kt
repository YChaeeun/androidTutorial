package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import org.jetbrains.anko.image
import org.jetbrains.anko.imageResource
import java.math.BigInteger

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // 값을 전달 받음 
        // 예외처리 해야 함-> 입력값이 숫자가 아닌 경우, 공백이 같이 입력되는 경우, 입력되지 않은 경우, 너무 큰 수를 입력한 경우, 음수를 입력한 경우, 0을 입력한 경우

        //val height = intent.getStringExtra("height").toInt()
        //val weight = intent.getStringExtra("weight").toInt()

        val height = intent.getStringExtra("height") as? Int ?: 0
        val weight = intent.getStringExtra("weight") as? Int ?: 0

        // height나 weight가 0인 경우, 강제 종료 혹은 다시 입력하라는 안내창 띄우기(?)

        // bmi 계산
        val bmi = weight / Math.pow(height / 100.0, 2.0)


        // 결과
        when {
            bmi >= 35 -> result.text = "고도비만"
            bmi >= 30 -> result.text = "비만 (2단계)"
            bmi >= 25 -> result.text = "비만 (1단계)"
            bmi >= 23 -> result.text = "과체중"
            bmi >= 18.5 -> result.text = "정상"
            else -> result.text = "저체중"
        }

        // 이미지
        when {
            bmi >= 23 -> {
                imageView.setImageResource(R.drawable.ic_local_hospital_black_24dp)
                resultText.text = "삐용삐용"
            }
            bmi >= 18.5 -> {
                imageView.setImageResource(R.drawable.ic_insert_emoticon_black_24dp)
                resultText.text = "좋아요!"
            }
            else -> {
                imageView.setImageResource(R.drawable.ic_directions_run_black_24dp)
                resultText.text = "운동운동"
            }
        }

    }
}
