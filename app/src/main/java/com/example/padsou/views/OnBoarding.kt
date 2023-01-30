package com.example.padsou.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.padsou.layouts.onBoarding.*
import com.example.padsou.models.AuthViewModel
import com.example.padsou.ui.theme.*
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

@Composable
fun MainOnboarding(systemController: SystemUiController, navComposable: NavController) {
    // Variables
    val paddingWindow = 60.dp
    val colorWindow = PadsouPurple

    // Content
    systemController.setStatusBarColor(color = colorWindow, darkIcons = false)

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .background(colorWindow)
            .fillMaxSize()
    ) {
        FirstOnBoarding(paddingWindow)
        ItemOnBoarding(paddingWindow)
        LastOnBoarding(paddingWindow, navComposable)
    }
}
