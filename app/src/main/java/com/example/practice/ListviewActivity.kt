package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_listview.*

class ListviewActivity : AppCompatActivity() {

    // var studentList = arrayListOf<StudentInfo>()

    var studentList = arrayListOf<StudentInfo>(
        StudentInfo("chae yahoo", "20160000", "Female", "Religious Studies"),
        StudentInfo("leah hoo", "20190000", "Female", "Economic"),
        StudentInfo("yoo hoo", "20140000", "Male", "Social Studies"),
        StudentInfo("yang ooo", "20160001", "Female", "English Literature"),
        StudentInfo("won now", "20170000", "Female", "Korean Language"),
        StudentInfo("choi lala", "20190001", "Male", "Computer Engineering"),
        StudentInfo("eun yoo", "20150000", "Male", "Chemistry Engineering"),
        StudentInfo("ha haho", "20130000", "Female", "Commerce and Trade"),
        StudentInfo("sunn shine","2018000", "Female", "Political Science" )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        val studentAdapter = ListviewAdapter(this, studentList)
        layout_studentListView.adapter = studentAdapter
    }
}
