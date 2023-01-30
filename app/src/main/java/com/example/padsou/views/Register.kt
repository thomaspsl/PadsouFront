package com.example.padsou.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.layouts.register.ItemRegister
import com.example.padsou.layouts.register.LastRegister
import com.example.padsou.ui.theme.*
import com.google.accompanist.systemuicontroller.SystemUiController

@Composable
fun MainRegister(systemController: SystemUiController, navComposable: NavController) {
    // Variables
    val colorWindow = PadsouWheat

    // Content
    systemController.setStatusBarColor(color = colorWindow, darkIcons = true)
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .background(colorWindow)
            .fillMaxSize()
            .padding(horizontal = 25.dp)
            .padding(top = 75.dp, bottom = 55.dp)
    ){
        ItemRegister(navComposable)
        LastRegister(navComposable)
    }
}