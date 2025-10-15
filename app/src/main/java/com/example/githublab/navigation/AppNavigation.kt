package com.example.githublab.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.githublab.AuthScreen
import com.example.githublab.Screens

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Auth.route
    ){
        composable(Screens.Auth.route){
            AuthScreen(
                navController = navController
            )
        }
    }
}