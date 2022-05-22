package com.example.myapplication_1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TeamRVAdapter (private val data:ArrayList<AppcenterTeam>): RecyclerView.Adapter<TeamRVAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val name: TextView = view.findViewById(R.id.name)
        val age: TextView = view.findViewById(R.id.age)
        val part: TextView = view.findViewById(R.id.part)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.team_list, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = data[position].name
        holder.age.text = data[position].age
        holder.part.text = data[position].part
        setColor(holder)
        setClick(holder)
        setLongClick(holder,position)
    }


    override fun getItemCount() = data.size

    private fun setColor(holder:ViewHolder){
        when (holder.part.text) {
            "Design" -> {
                holder.part.setTextColor(holder.part.context.resources.getColor(R.color.purple_500))
            }
            "Android" -> {
                holder.part.setTextColor(holder.part.context.resources.getColor(R.color.teal_200))
            }
            else -> {
                holder.part.setTextColor(holder.part.context.resources.getColor(R.color.teal_700))
            }
        }
    }

    private fun setClick(holder:ViewHolder){
        holder.itemView.setOnClickListener {
            Intent(it.context,TeamDetail::class.java).run {
                putExtra("part",holder.part.text)
                it.context.startActivity(this)
            }
        }
    }

    private fun setLongClick(holder:ViewHolder,position:Int){
        holder.itemView.setOnLongClickListener {
            DeleteDialog { removeData(position) }.show(it.context)
            true
        }
    }



    private fun removeData(position: Int){
        data.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position,data.size)
    }
}