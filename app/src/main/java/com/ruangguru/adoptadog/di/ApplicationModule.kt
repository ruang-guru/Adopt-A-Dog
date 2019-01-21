package com.ruangguru.adoptadog.di

import com.ruangguru.adoptadog.AdoptADogActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ApplicationModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): AdoptADogActivity
}
