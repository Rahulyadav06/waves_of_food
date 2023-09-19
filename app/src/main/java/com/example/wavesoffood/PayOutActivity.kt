package com.example.wavesoffood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.wavesoffood.databinding.ActivityPayOutBinding
import com.example.wavesoffood.fragment.CongratsBottomSheetFragment

class PayOutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPayOutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPayOutBinding.inflate(LayoutInflater.from(this))
        binding.placeMyOrderButton.setOnClickListener {
            val bottomSheet = CongratsBottomSheetFragment()
            bottomSheet.show(supportFragmentManager,"show")
        }
        binding.payOutBackImageButton.setOnClickListener {
            finish()
        }
        setContentView(binding.root)
    }
}