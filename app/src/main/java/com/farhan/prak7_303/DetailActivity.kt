package com.farhan.prak7_303

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.farhan.prak7_303.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Book Detail"
        val book = intent.getSerializableExtra("book") as Book

        Glide.with(this)
            .load(book.cover)
            .into(binding.imgHeader)

        binding.tvTitle.text = book.title
        binding.tvSubTitle.text = book.title
        binding.tvDate.text = book.releaseDate
        binding.tvDesc.text = book.description
        binding.tvPages.text = "Pages: ${book.pages}"
    }
}