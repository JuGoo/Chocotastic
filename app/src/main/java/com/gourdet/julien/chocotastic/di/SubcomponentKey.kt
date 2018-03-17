package com.gourdet.julien.chocotastic.di

import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class SubcomponentKey(val key: KClass<*>)
