package com.farhan.prak7_303

import android.R.attr.onClick
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.farhan.prak7_303.databinding.ItemBookBinding

class BookAdapter(
    private var list: List<Book>,
    private var onClick: (Book) -> Unit
) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemBookBinding)
        : RecyclerView.ViewHolder(binding.root) {

        fun bind(book: Book) {
            binding.tvCardTitle.text = book.title
            binding.tvCardDate.text = book.releaseDate

            Glide.with(binding.imgCover.context)
                .load(book.cover)
                .into(binding.imgCover)

            binding.root.setOnClickListener {
                onClick(book)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBookBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}