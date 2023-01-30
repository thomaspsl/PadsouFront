package com.example.padsou

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.padsou.models.AuthViewModel
import com.example.padsou.views.*
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

@Composable
fun Routes(){
    // Variables
    val navController = rememberNavController()
    val systemController = rememberSystemUiController()
    val authViewModel = viewModel<AuthViewModel>()

    // Routes
    NavHost(navController = navController, startDestination = "onboarding") {
        composable("onboarding") { MainOnboarding(systemController, navController) }
        composable("register") { MainRegister(systemController, navController) }
        composable("login") { MainLogin(systemController, navController) }
        composable("home") { MainHome(systemController, navController) }
        composable("addPlan") { MainAddPlan(systemController, navController) }
        composable("plan") { MainPlan(systemController, navController) }
        composable("profile") { MainProfile(systemController, navController) }
    }
}