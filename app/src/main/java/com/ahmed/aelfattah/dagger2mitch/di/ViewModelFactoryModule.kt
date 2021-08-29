package com.ahmed.aelfattah.dagger2mitch.di

import androidx.lifecycle.ViewModelProvider
import com.ahmed.aelfattah.dagger2mitch.base.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelProviderFactory): ViewModelProvider.Factory
}