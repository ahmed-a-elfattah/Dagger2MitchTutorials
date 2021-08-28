package com.ahmed.aelfattah.dagger2mitch.di

import com.ahmed.aelfattah.dagger2mitch.ui.auth.AuthActivity
import com.ahmed.aelfattah.dagger2mitch.ui.main.MainActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity():MainActivity

    @ContributesAndroidInjector
    abstract fun contributeAuthActivity():AuthActivity
}