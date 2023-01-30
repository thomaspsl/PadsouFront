package com.example.padsou.layouts.bottomBarNavigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBarNavigation(navController: NavController) {
    BottomNavigation() {
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = ""
                )
            },
            selected = true,
            onClick = { navController.navigate("home") }
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = ""
                )
            },
            selected = true,
            onClick = { navController.navigate("addPlan") }
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = ""
                )
            },
            selected = true,
            onClick = { navController.navigate("profile") }
        )
    }
}