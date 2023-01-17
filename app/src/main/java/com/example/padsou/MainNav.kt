package com.example.padsou

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainNav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "connexion") {
        composable("connexion") { MainRegister(navController) }
        composable("home") { MainLogin(navController) }

        /*...*/
    }
}