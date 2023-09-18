package com.example.wavesoffood.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.R
import com.example.wavesoffood.adapter.BuyAgainAdapter
import com.example.wavesoffood.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {
    private lateinit var binding: FragmentHistoryBinding
    private lateinit var adapter: BuyAgainAdapter
    private val foodNames = listOf("Burger","Sandwich","Momo's","Pizza","Noodle's","Manchuriya","Pasta","Chicken65")
    private val prices = listOf("$5","$7","$8","$10","$5","$7","$8","$10")
    private val foodImages = listOf(
        R.drawable.menu1,
        R.drawable.menu2,
        R.drawable.menu3,
        R.drawable.menu4,
        R.drawable.menu5,
        R.drawable.menu6,
        R.drawable.menu7,
        R.drawable.menu1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(inflater,container,false)
        binding.buyAgainRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = BuyAgainAdapter(ArrayList(foodNames),ArrayList(prices),ArrayList(foodImages))
        binding.buyAgainRecyclerView.adapter = adapter
        return binding.root
    }
}