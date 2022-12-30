package com.example.telegram

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.*
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class profileadapter(
    timelist: Array<String>,
    namelist: Array<String>,
    grouplist: Array<String>,
    imglist: Array<Int>,
    msgcountlist: Array<String>
) : Adapter<profileadapter.userlistholder>() {
    lateinit var context: Context
    var imglist = imglist
    var namelist = namelist
    var timelist = timelist
    var grouplist = grouplist
    var msgcountlist = msgcountlist

    class userlistholder(itemView: View) : ViewHolder(itemView) {
        var imgpro = itemView.findViewById<CircleImageView>(R.id.imgpro)
        var group = itemView.findViewById<TextView>(R.id.group)
        var name = itemView.findViewById<TextView>(R.id.name)
        var msgcount = itemView.findViewById<TextView>(R.id.msgcount)
        var time = itemView.findViewById<TextView>(R.id.time)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): userlistholder {
        context = parent.context
        var view = LayoutInflater.from(parent.context).inflate(R.layout.profilelist, parent, false)
        return userlistholder(view)
    }

    override fun onBindViewHolder(holder: userlistholder, position: Int) {
        Glide.with(context).load(imglist.get(position)).into(holder.imgpro)
        holder.time.text = timelist.get(position)
        holder.msgcount.text = msgcountlist.get(position)
        holder.name.text = namelist.get(position)
        holder.group.text = grouplist.get(position).toString()
        // holder.txtName.text = nameList.get(position)
        //  Glide.with(context).load(imglist.get(position)).into(holder.imageview)
    }

    override fun getItemCount(): Int {
        return namelist.size
    }
}