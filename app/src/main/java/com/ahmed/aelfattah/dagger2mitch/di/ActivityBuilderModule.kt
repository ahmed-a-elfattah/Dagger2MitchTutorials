package com.ahmed.aelfattah.dagger2mitch.di

import com.ahmed.aelfattah.dagger2mitch.di.auth.AuthViewModelModule
import com.ahmed.aelfattah.dagger2mitch.ui.auth.view.AuthActivity
import com.ahmed.aelfattah.dagger2mitch.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity():MainActivity

    @ContributesAndroidInjector(modules = [AuthViewModelModule::class])
    abstract fun contributeAuthActivity(): AuthActivity
}