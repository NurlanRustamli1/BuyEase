package com.ruhlanusubov.buyease.presentation.utils

import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.ruhlanusubov.buyease.presentation.splash.SplashFragmentDirections
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun splashTransition(fragment:Fragment,navDirections: NavDirections){

    CoroutineScope(Dispatchers.Main).launch {
        delay(4000L)
        fragment.findNavController().navigate(navDirections)
    }
}
fun action(fragment:Fragment,navDirections: NavDirections){
    fragment.findNavController().navigate(navDirections)
}

