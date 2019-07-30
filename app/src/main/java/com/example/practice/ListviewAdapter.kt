package com.example.practice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListviewAdapter (val context: Context, val studentList: ArrayList<StudentInfo>) : BaseAdapter() {
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.activity_listview_items, null)

        val item_studentName = view.findViewById<TextView>(R.id.id_studentName)
        val item_studentId = view.findViewById<TextView>(R.id.id_studentId)
        val item_studentGender = view.findViewById<TextView>(R.id.id_studentGender)
        val item_studentMajor = view.findViewById<TextView>(R.id.id_studentMajor)

        val student = studentList[p0]
        item_studentName.text = student.studentName
        item_studentId.text = student.studenId
        item_studentGender.text = student.studentGender
        item_studentMajor.text = student.studentMajor

        return view
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getItem(p0: Int): Any {
        return studentList[p0]
    }

    override fun getCount(): Int {
        return studentList.size
    }
}