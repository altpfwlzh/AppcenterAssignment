package com.example.myapplication_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SubActivity_1 : AppCompatActivity() {

    val recyclerView : RecyclerView by lazy{
        findViewById(R.id.team_recyclerView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub1)

        recyclerView.adapter = TeamRVAdapter(createData())
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun createData(): ArrayList<AppcenterTeam>{
        val data = arrayListOf<AppcenterTeam>()
        data.add(AppcenterTeam("성이름","00","Android"))
        data.add(AppcenterTeam("성이름","00","Design"))
        data.add(AppcenterTeam("성이름","00","Server"))
        data.add(AppcenterTeam("성이름","00","Android"))
        data.add(AppcenterTeam("성이름","00","Server"))
        data.add(AppcenterTeam("성이름","00","Android"))
        data.add(AppcenterTeam("성이름","00","Design"))
        data.add(AppcenterTeam("성이름","00","Android"))
        data.add(AppcenterTeam("성이름","00","Server"))
        data.add(AppcenterTeam("성이름","00","Server"))
        data.add(AppcenterTeam("성이름","00","Android"))
        data.add(AppcenterTeam("성이름","00","Design"))
        data.add(AppcenterTeam("성이름","00","Android"))
        data.add(AppcenterTeam("성이름","00","Server"))

        return data
    }
}