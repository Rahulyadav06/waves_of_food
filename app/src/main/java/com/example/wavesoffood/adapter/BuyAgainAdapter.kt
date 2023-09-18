package com.example.wavesoffood.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wavesoffood.databinding.BuyAgainItemBinding

class BuyAgainAdapter(private val buyAgainFoodName: MutableList<String>, private val buyAgainFoodPrice: MutableList<String>, private val buyAgainFoodImage: MutableList<Int>):
    RecyclerView.Adapter<BuyAgainAdapter.BuyAgainViewHolder>() {
    class BuyAgainViewHolder(private val binding: BuyAgainItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(foodName: String, foodPrice: String, foodImage: Int) {
            binding.apply {
                buyAgainFoodName.text = foodName
                buyAgainFoodPrice.text = foodPrice
                buyAgainFoodImage.setImageResource(foodImage)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuyAgainViewHolder {
        val binding = BuyAgainItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BuyAgainViewHolder(binding)
    }

    override fun getItemCount(): Int = buyAgainFoodName.size

    override fun onBindViewHolder(holder: BuyAgainViewHolder, position: Int) {
        holder.bind(buyAgainFoodName[position],buyAgainFoodPrice[position],buyAgainFoodImage[position])
    }

}