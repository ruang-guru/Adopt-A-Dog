package com.ruangguru.adoptadog

import android.os.Bundle
import com.ruangguru.displaydogs.view.DisplayDogsFragment
import dagger.android.support.DaggerAppCompatActivity

class AdoptADogActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adopt_a_dog)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.main_fragment, DisplayDogsFragment())
            commit()
        }
    }
}
