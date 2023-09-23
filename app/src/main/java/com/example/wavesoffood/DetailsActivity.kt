package com.example.wavesoffood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wavesoffood.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val foodName = intent.getStringExtra("ItemName")
        val foodImage = intent.getIntExtra("ItemImage",0)
        binding.detailFoddName.text = foodName
        binding.detailFoodImage.setImageResource(foodImage)
        binding.backimageButton.setOnClickListener {
            finish()
        }
    }
}