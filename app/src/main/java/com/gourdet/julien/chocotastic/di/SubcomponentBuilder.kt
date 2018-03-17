package com.gourdet.julien.chocotastic.di

interface SubcomponentBuilder<out T> {
    fun build(): T
}
