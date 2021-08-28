package com.ahmed.aelfattah.dagger2mitch.ui.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.ahmed.aelfattah.dagger2mitch.R
import com.ahmed.aelfattah.dagger2mitch.databinding.ActivityMainBinding
import com.ahmed.aelfattah.dagger2mitch.ui.auth.AuthActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var someData:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "onCreate: $someData")

        binding.navigateAuth.setOnClickListener {
            val intent=Intent(applicationContext,AuthActivity::class.java)
            startActivity(intent)
        }
    }
}