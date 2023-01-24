package com.example.padsou.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.layouts.home.FirstHome
import com.example.padsou.layouts.home.ItemHome
import com.example.padsou.ui.components.ShortSearch
import com.example.padsou.ui.components.ShortThematicCard
import com.example.padsou.ui.components.ShortTextField
import com.example.padsou.ui.theme.*
import com.google.accompanist.systemuicontroller.SystemUiController

@Composable
fun MainHome(systemController: SystemUiController, navComposable: NavController) {
    // Variables
    val colorWindow = PadsouPurple

    // Content
    systemController.setStatusBarColor(color = colorWindow, darkIcons = false)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorWindow)
            .padding(top = 60.dp)
    ){
        FirstHome()
        ItemHome(navComposable)
    }
}