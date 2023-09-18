package com.example.wavesoffood.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.R
import com.example.wavesoffood.adapter.NotificationAdapter
import com.example.wavesoffood.databinding.FragmentNotificationBottomBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class NotificationBottomFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentNotificationBottomBinding
    private val notifications = listOf("Your order has been cancelled successfully","Order has been taken by the driver","Congrats your order has been placed")
    private val notificationsImage = listOf(
        R.drawable.sademoji,
        R.drawable.truck,
        R.drawable.congrats
    )
    private val adapter = NotificationAdapter(ArrayList(notifications),ArrayList(notificationsImage))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotificationBottomBinding.inflate(inflater,container,false)
        binding.notificationsRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.notificationsRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }
}