package com.example.assignment3_p3.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment3_p3.R

class MovieAdapter(
    private val movies: List<String>
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieName: TextView = itemView.findViewById(R.id.movie_name)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                val movieTitle = movies[position]
                Toast.makeText(itemView.context, "Clicked on $movieTitle", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.movieName.text = movies[position]
    }
    override fun getItemCount(): Int = movies.size
}

