package com.ahmed.aelfattah.dagger2mitch.di.auth

import androidx.lifecycle.ViewModel
import com.ahmed.aelfattah.dagger2mitch.di.ViewModelKey
import com.ahmed.aelfattah.dagger2mitch.ui.auth.viewmodel.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel):ViewModel
}