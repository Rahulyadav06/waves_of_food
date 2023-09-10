package com.example.wavesoffood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wavesoffood.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val signInIntent = Intent(this,SignInActivity::class.java)
        val homeIntent = Intent(this,MainActivity::class.java)
        binding.buttonLogin.setOnClickListener {
            startActivity(homeIntent)
            finish()
        }
        binding.textViewDontHaveAccount.setOnClickListener {
            startActivity(signInIntent)
            finish()
        }
    }
}