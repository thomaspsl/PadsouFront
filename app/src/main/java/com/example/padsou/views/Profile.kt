package com.example.padsou.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.padsou.layouts.bottomBarNavigation.BottomBarNavigation
import com.example.padsou.layouts.profile.FirstProfile
import com.example.padsou.layouts.profile.ItemProfile
import com.example.padsou.layouts.profile.LastProfile
import com.example.padsou.ui.theme.*
import com.google.accompanist.systemuicontroller.SystemUiController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainProfile(systemController: SystemUiController, navComposable: NavController) {
    // Variables
    val colorWindow = PadsouPurple

    // Content
    systemController.setStatusBarColor(color = colorWindow, darkIcons = false)

    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .background(colorWindow)
            ){
                FirstProfile()
                ItemProfile(
                    lastProfile = { LastProfile() }
                )
            }
        },
        bottomBar = { BottomBarNavigation(navController = navComposable) }
    )
}