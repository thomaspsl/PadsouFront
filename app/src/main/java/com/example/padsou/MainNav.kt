package com.example.padsou

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.padsou.ui.theme.Test

@Composable
fun MainNav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "test") {
        composable("inscription") { MainRegister(navController) }
        composable("login") { MainLogin(navController) }
        composable("home") { MainOnboarding(navController) }
        composable("test") { Test(id = "12") }

        /*composable("test/{userId}") { backStackEntry ->
            Test(backStackEntry.arguments?.getString("userId"))
        }*/

    }
}