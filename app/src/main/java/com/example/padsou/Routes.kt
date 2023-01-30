package com.example.padsou

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.padsou.ui.theme.Test
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.padsou.models.AuthViewModel
import com.example.padsou.views.*
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun Routes(){
    // Variables
    val navController = rememberNavController()
    val systemController = rememberSystemUiController()

    // Routes
    NavHost(navController = navController, startDestination = "register") {
        composable("onboarding") { MainOnboarding(systemController, navController) }
        composable("register") { MainRegister(systemController, navController) }
        composable("login") { MainLogin(systemController, navController) }
        composable("home") { MainHome(systemController, navController) }
        composable("test") { Test(navController, /*navController*/) }
        /*composable("test/{userId}") { backStackEntry ->
            Test(backStackEntry.arguments?.getString("userId"),navController)
            */

        composable("addPlan") { MainAddPlan(systemController, navController) }
        composable("plan") { MainPlan(systemController, navController) }
        composable("profile") { MainProfile(systemController, navController) }
    }
}
