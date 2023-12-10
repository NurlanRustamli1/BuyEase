package com.ruhlanusubov.buyease.presentation.utils

import android.content.Context
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.ruhlanusubov.buyease.presentation.splash.SplashFragment
import com.ruhlanusubov.buyease.presentation.splash.SplashFragmentDirections
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun transition(fragment:Fragment){

    CoroutineScope(Dispatchers.Main).launch {
        delay(4000L)
        fragment.findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToLoginFragment())
    }
}