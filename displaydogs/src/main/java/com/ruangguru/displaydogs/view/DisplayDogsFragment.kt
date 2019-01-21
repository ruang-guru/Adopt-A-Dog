package com.ruangguru.displaydogs.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ruangguru.displaydogs.R
import com.ruangguru.displaydogs.model.Dog
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class DisplayDogsFragment : DaggerFragment() {

    /** The data used for the display */
    @Inject
    lateinit var dogsList: List<Dog>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_dogs_display, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        /* do something with the dogsList */
    }

}

