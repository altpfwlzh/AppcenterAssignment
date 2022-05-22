package com.example.myapplication_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TeamDetail : AppCompatActivity() {

    private val detailName : TextView by lazy{
        findViewById(R.id.team_detail)
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_detail)

        detailName.text = "나는 "+intent.getStringExtra("part")+"파트야"
    }
}