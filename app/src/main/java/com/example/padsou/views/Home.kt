package com.example.padsou.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.layouts.bottomBarNavigation.BottomBarNavigation
import com.example.padsou.layouts.home.FirstHome
import com.example.padsou.layouts.home.ItemHome
import com.example.padsou.ui.theme.*
import com.google.accompanist.systemuicontroller.SystemUiController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainHome(systemController: SystemUiController, navComposable: NavController) {
    // Variables
    val colorWindow = PadsouPurple

    // Content
    systemController.setStatusBarColor(color = colorWindow, darkIcons = false)

    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorWindow)
                    .padding(top = 60.dp)
            ){
                FirstHome()
                ItemHome(/*navComposable*/)
            }
        },
        bottomBar = { BottomBarNavigation(navController = navComposable) }
    )
}