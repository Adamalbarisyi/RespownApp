package com.kpti.respownapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.kpti.respownapp.R
import com.kpti.respownapp.model.User


class UsersRecyclerAdapter(private val listUsers: List<User>) : RecyclerView.Adapter<UsersRecyclerAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        // inflating recycler item view
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_user_recycler, parent, false)

        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.textViewName.text = listUsers[position].name
        holder.textViewEmail.text = listUsers[position].email
        holder.textViewPassword.text = listUsers[position].password
    }

    override fun getItemCount() = listUsers.size


    inner class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var textViewName: AppCompatTextView = view.findViewById<View>(R.id.textViewName) as AppCompatTextView
        var textViewEmail: AppCompatTextView = view.findViewById<View>(R.id.textViewEmail) as AppCompatTextView
        var textViewPassword: AppCompatTextView = view.findViewById<View>(R.id.textViewPassword) as AppCompatTextView

    }


}