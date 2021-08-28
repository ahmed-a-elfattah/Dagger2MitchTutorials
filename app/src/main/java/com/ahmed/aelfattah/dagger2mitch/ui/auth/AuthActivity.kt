package com.ahmed.aelfattah.dagger2mitch.ui.auth

import android.os.Bundle
import android.util.Log
import com.ahmed.aelfattah.dagger2mitch.R
import com.ahmed.aelfattah.dagger2mitch.databinding.ActivityAuthBinding
import com.ahmed.aelfattah.dagger2mitch.ui.main.MainActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    companion object {
        private const val TAG = "AuthActivity"
    }

    lateinit var binding: ActivityAuthBinding

    @Inject
    lateinit var someData:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "onCreate: $someData")
    }
}