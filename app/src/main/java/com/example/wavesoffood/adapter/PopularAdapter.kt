package com.example.wavesoffood.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wavesoffood.databinding.PopularItemBinding


class PopularAdapter(private val items:List<String>, private val price:List<String>, private val images:List<Int>): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder(PopularItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item = items[position]
        val price = price[position]
        val image = images[position]
        holder.bind(item,price,image)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PopularViewHolder(private val binding: PopularItemBinding):RecyclerView.ViewHolder(binding.root) {
        private val imageView = binding.foodImage
        fun bind(item: String, price:String, image: Int) {
            binding.foodNamePopular.text = item
            binding.pricePopular.text = price
            imageView.setImageResource(image)
        }

    }

}