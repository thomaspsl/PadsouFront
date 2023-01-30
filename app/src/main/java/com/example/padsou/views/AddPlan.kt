package com.example.padsou.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.padsou.layouts.addPlan.FirstAddPlan
import com.example.padsou.layouts.addPlan.ItemAddPlan
import com.example.padsou.layouts.addPlan.LastAddPlan
import com.example.padsou.layouts.bottomBarNavigation.BottomBarNavigation
import com.example.padsou.ui.theme.*
import com.google.accompanist.systemuicontroller.SystemUiController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainAddPlan(systemController: SystemUiController, navComposable: NavController) {
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
                FirstAddPlan()
                ItemAddPlan(
                    lastAddPlan = { LastAddPlan() }
                )
            }
        },
        bottomBar = { BottomBarNavigation(navController = navComposable) }
    )
}
