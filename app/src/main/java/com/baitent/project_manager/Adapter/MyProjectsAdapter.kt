package com.baitent.project_manager.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.baitent.project_manager.Domain.ProjectDomain
import com.baitent.project_manager.R

class MyProjectsAdapter(private val items: List<ProjectDomain>) :
    RecyclerView.Adapter<MyProjectsAdapter.Viewholder>() {
    inner class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleTxt)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyProjectsAdapter.Viewholder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_projects, parent, false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: MyProjectsAdapter.Viewholder, position: Int) {


        val item = items[position]
        holder.title.text = item.title

    }

    override fun getItemCount(): Int = items.size

}