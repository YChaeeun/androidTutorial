package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycleview.*

class RecycleviewActivity : AppCompatActivity() {

    private var measureUnitList = arrayListOf<MeasureUnit>(
        MeasureUnit("cc", "씨씨"),
        MeasureUnit("ml", "밀리미터"),
        MeasureUnit("L", "리터"),
        MeasureUnit("mg", "밀리그램"),
        MeasureUnit("kg", "킬로그램"),
        MeasureUnit("큰술", "tbsp"),
        MeasureUnit("작은술", "tsp"),
        MeasureUnit("컵", "cup"),
        MeasureUnit("밥숟갈", "15cc"),
        MeasureUnit("베라스푼", "5cc"),
        MeasureUnit("물뚜껑", "7cc"),
        MeasureUnit("소주잔", "50ml")

    )
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleview)


        val recyclerAdapter = MeasureUnitAdapter(this,measureUnitList)
        layout_recyclerview.adapter = recyclerAdapter

        val reManager = LinearLayoutManager(this)
        layout_recyclerview.layoutManager = reManager
        layout_recyclerview.setHasFixedSize(true)
    }
}
