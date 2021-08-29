package com.ahmed.aelfattah.dagger2mitch.di

import dagger.MapKey
import kotlin.reflect.KClass
import androidx.lifecycle.ViewModel
import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

@Documented
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(RetentionPolicy.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)