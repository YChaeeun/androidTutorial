package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickButton.setOnClickListener{
            textView.text = "버튼을 눌렀습니다."
        }
        // 아래 것만 나옴. 왜?
        clickButton.setOnClickListener{
            textView.text = "짜자잔"
        }
    }
}
