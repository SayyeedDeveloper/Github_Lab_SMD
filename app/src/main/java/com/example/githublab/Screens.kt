package com.example.githublab

import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer

@Serializable
sealed class Screens(val route: String) {
    @Serializable
    data object Auth : Screens("auth")
    @Serializable
    data object Home : Screens("home")
    @Serializable
    data object Profile : Screens("profile")
}