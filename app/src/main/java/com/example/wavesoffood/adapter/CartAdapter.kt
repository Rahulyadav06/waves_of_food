package com.example.wavesoffood.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wavesoffood.databinding.CartItemBinding

class CartAdapter(private val cartItems:MutableList<String>, private val cartItemsPrice:MutableList<String>, private val cartItemImage:MutableList<Int>): RecyclerView.Adapter<CartAdapter.CartViewHolder>() {
    private val itemQuantities = IntArray(cartItems.size){1}
    inner class CartViewHolder(private val binding: CartItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                val quantity = itemQuantities[position]
                cartFoodName.text = cartItems[position]
                cartItemPrice.text = cartItemsPrice[position]
                cartFoodImage.setImageResource(cartItemImage[position])
                cartItemQuantity.text = quantity.toString()

                minusButton.setOnClickListener {
                    decreaseQuantity(position)
                }
                plusButton.setOnClickListener {
                    increaseQuantity(position)
                }
                deleteButton.setOnClickListener {
                    val itemPosition = adapterPosition
                    if(itemPosition != RecyclerView.NO_POSITION){
                        deleteItem(itemPosition)
                    }
                }
            }
        }

        private fun decreaseQuantity(position: Int){
            if(itemQuantities[position]>1){
                itemQuantities[position]--
                binding.cartItemQuantity.text = itemQuantities[position].toString()
            }
        }
        private fun increaseQuantity(position: Int){
            if(itemQuantities[position]<10){
                itemQuantities[position]++
                binding.cartItemQuantity.text = itemQuantities[position].toString()
            }
        }
        private fun deleteItem(position: Int){
            cartItems.removeAt(position)
            cartItemImage.removeAt(position)
            cartItemsPrice.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position,cartItems.size)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CartViewHolder(binding)
    }

    override fun getItemCount(): Int = cartItems.size

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bind(position)
    }
}