package com.ruangguru.adoptadog.di

import com.ruangguru.adoptadog.AdoptADogApplication
import com.ruangguru.displaydogs.di.DisplayDogsModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [
        AndroidInjectionModule::class,
        ApplicationModule::class,
        DisplayDogsModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<AdoptADogApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<AdoptADogApplication>()
}
