package com.example.findyourway.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.findyourway.screens.*

@Composable
fun Navigation(){

    val navController= rememberNavController()
    NavHost(navController=navController,
        startDestination = Screens.SplashScreen.name){
        composable(Screens.SplashScreen.name){
            FindYourWaySplashScreen(navController=navController)
        }

        composable(Screens.MainScreen.name){
            MainScreen(navController = navController)
        }
        composable(Screens.MapScreen.name){
            MapScreen(navController = navController)
        }
        composable(Screens.RouteScreen.name){
            RouteScreen(navController=navController)
        }
        composable(Screens.ARscreen.name){
            ARscreen(navController=navController)
        }
    }
}

