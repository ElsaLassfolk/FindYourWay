package com.example.findyourway.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.findyourway.screens.*

@Composable
fun BottomNavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.route) {
        composable(BottomNavItem.Home.route) {
            MainScreen(navController = navController)
        }
        composable(BottomNavItem.Help.route) {
            HelpScreen(navController = navController)
        }

        composable(BottomNavItem.Exit.route) {
            MainScreen(navController = navController)
        }

    }
}