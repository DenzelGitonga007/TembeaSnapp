package com.denzel.tembeasnapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.denzel.tembeasnapp.ui.screens.HomeScreen

/*
* This function sets up navigation for the app.
* It helps the users move/switch between screens.
* */

@Composable
fun NavGraph() {
//    Create a controller to manage navigation
    val navController = rememberNavController()

//    Navigation structure
    NavHost(
        navController = navController, // controller that manages the navigation
        startDestination = "home_screen" // the first screen to show
    ) {
//        Define the screen routes
        composable("home_screen") {
            HomeScreen()
        }
    }



}