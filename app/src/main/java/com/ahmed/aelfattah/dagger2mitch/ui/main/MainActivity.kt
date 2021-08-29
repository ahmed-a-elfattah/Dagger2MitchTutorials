package com.ahmed.aelfattah.dagger2mitch.ui.main

import android.os.Bundle
import com.ahmed.aelfattah.dagger2mitch.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}