package com.example.githublab.navigation.screens

import kotlinx.serialization.Serializable

@Serializable
sealed class Screens(val route: String) {
    @Serializable
    data object Auth : Screens("auth")
    @Serializable
    data object Home : Screens("home")
    @Serializable
    data object Profile : Screens("profile")
}