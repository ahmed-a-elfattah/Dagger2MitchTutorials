package com.ahmed.aelfattah.dagger2mitch.ui.auth.view

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.ahmed.aelfattah.dagger2mitch.base.ViewModelProviderFactory
import com.ahmed.aelfattah.dagger2mitch.databinding.ActivityAuthBinding
import com.ahmed.aelfattah.dagger2mitch.ui.auth.viewmodel.AuthViewModel
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    companion object {
        private const val TAG = "AuthActivity"
    }

    private lateinit var binding: ActivityAuthBinding

    lateinit var authViewModel: AuthViewModel

    @Inject
    lateinit var logo:Drawable

    @Inject
    lateinit var requestManager: RequestManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        authViewModel= ViewModelProvider(this).get(AuthViewModel::class.java)

        requestManager.load(logo).into(binding.loginLogo)
    }
}