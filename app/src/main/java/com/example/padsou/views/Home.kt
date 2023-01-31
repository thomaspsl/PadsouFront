package com.example.padsou.views

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.navigation.NavController
import com.example.padsou.R
import com.example.padsou.layouts.bottomBarNavigation.BottomBarNavigation
import com.example.padsou.layouts.home.FirstHome
import com.example.padsou.layouts.home.ItemHome
import com.example.padsou.ui.components.MiniNotification
import com.example.padsou.ui.theme.*
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.android.exoplayer2.util.NotificationUtil.createNotificationChannel

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainHome(systemController: SystemUiController, navComposable: NavController) {
    // Variables
    val colorWindow = PadsouPurple

    // Notification
    MiniNotification(LocalContext.current, "Padsou ?!", "Content de vous revoir parmi nous, grattons ensemble de nouveaux bons plans !")

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
                ItemHome(navComposable)
            }
        },
        bottomBar = { BottomBarNavigation(navController = navComposable) }
    )
}