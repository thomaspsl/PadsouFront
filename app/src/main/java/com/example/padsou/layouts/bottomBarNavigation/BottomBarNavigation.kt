package com.example.padsou.layouts.bottomBarNavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.ui.theme.PadsouLightGrey
import com.example.padsou.ui.theme.PadsouPurple
import com.example.padsou.ui.theme.PadsouWheat
import com.example.padsou.ui.theme.PadsouWhite

@Composable
fun BottomBarNavigation(navController: NavController) {
    // Variables
    val currentRoute = navController.currentBackStackEntry?.destination?.route

    // Content
    BottomNavigation(
        backgroundColor = PadsouWheat,
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .padding(horizontal = 80.dp)
        ) {
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "",
                        modifier = Modifier
                            .size(32.dp)
                    )
                },
                selected = currentRoute == "home",
                onClick = { navController.navigate("home") },
                unselectedContentColor = PadsouLightGrey,
                selectedContentColor = PadsouPurple,
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(vertical = 10.dp, horizontal = 8.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
                    .background(PadsouWhite)
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "",
                        modifier = Modifier
                            .size(32.dp)
                    )
                },
                selected = currentRoute == "addPlan",
                onClick = { navController.navigate("addPlan") },
                unselectedContentColor = PadsouLightGrey,
                selectedContentColor = PadsouPurple,
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(vertical = 10.dp, horizontal = 8.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
                    .background(PadsouWhite)
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "",
                        modifier = Modifier
                            .size(32.dp)
                    )
                },
                selected = currentRoute == "profile",
                onClick = { navController.navigate("profile") },
                unselectedContentColor = PadsouLightGrey,
                selectedContentColor = PadsouPurple,
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(vertical = 10.dp, horizontal = 8.dp)
                    .clip(shape = RoundedCornerShape(5.dp))
                    .background(PadsouWhite)
            )
        }
    }
}