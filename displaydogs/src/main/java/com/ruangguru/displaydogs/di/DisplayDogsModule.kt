package com.ruangguru.displaydogs.di

import com.ruangguru.displaydogs.view.DisplayDogsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class DisplayDogsModule {

    @ContributesAndroidInjector(
        modules = [RepositoryModule::class]
    )
    abstract fun bindDisplayDogsFragment(): DisplayDogsFragment

}