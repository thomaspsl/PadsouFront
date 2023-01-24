package com.example.padsou.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.padsou.layouts.addPlan.FirstAddPlan
import com.example.padsou.layouts.addPlan.ItemAddPlan
import com.example.padsou.layouts.addPlan.LastAddPlan
import com.example.padsou.ui.theme.*
import com.google.accompanist.systemuicontroller.SystemUiController

@Composable
fun MainAddPlan(systemController: SystemUiController, /*navComposable: NavController*/) {
    // Variables
    val colorWindow = PadsouPurple

    // Content
    systemController.setStatusBarColor(color = colorWindow, darkIcons = false)

    Column(
        modifier = Modifier
            .background(colorWindow)
    ){
        FirstAddPlan()
        ItemAddPlan(
            lastAddPlan = { LastAddPlan() }
        )
    }
}