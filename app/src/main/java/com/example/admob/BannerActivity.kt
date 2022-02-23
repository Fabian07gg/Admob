package com.example.admob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.admob.databinding.ActivityBannerBinding
import com.google.android.gms.ads.AdRequest

class BannerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBannerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBannerBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    private fun initLoadAds(){
        val adRequest = AdRequest.Builder().build()
        binding.banner.loadAd(adRequest)
    }
}