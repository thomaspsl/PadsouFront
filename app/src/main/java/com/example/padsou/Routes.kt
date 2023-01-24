package com.example.padsou

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Routes(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "onboarding") {
        composable("onboarding") { MainOnboarding(navController) }
        composable("register") { MainRegister(/*navController*/) }
        composable("login") { MainLogin(/*navController*/) }
        composable("home") { MainHome(/*navController*/) }
        composable("addPlan") { MainAddPlan(/*navController*/) }
        composable("plan") { MainPlan(/*navController*/) }

        /*...*/
    }
}