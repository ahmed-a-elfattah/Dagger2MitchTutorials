package com.ahmed.aelfattah.dagger2mitch.di

import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.ahmed.aelfattah.dagger2mitch.R
import com.ahmed.aelfattah.dagger2mitch.base.BaseApplication
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    companion object{

        @Provides
        @JvmStatic
        fun provideRequestOptions():RequestOptions{
            return RequestOptions()
                .placeholder(R.drawable.white_background)
                .error(R.drawable.white_background)
        }

        @Provides
        @JvmStatic
        fun provideGlideInstance(application: BaseApplication,requestOptions: RequestOptions):RequestManager{
            return Glide.with(application)
                .setDefaultRequestOptions(requestOptions)
        }

        @Provides
        @JvmStatic
        fun provideAppDrawable(application: BaseApplication):Drawable{
            return ContextCompat.getDrawable(application,R.drawable.logo)!!
        }
    }
}