package com.example.admob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.admob.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun initListeners(){
        val bannerIntent = Intent(this,BannerActivity::class.java)
        binding.btnBanner.setOnClickListener{
            startActivity(bannerIntent)
        }
    }
}