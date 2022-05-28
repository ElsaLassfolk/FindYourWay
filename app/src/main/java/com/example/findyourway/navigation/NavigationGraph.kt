package com.example.findyourway.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.findyourway.screens.*

@Composable
fun NavigationGraph(){

    val navController= rememberNavController()
    NavHost(navController=navController,
        startDestination = Screens.MainScreen.name){

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
        composable(Screens.HelpScreen.name){
            HelpScreen(navController=navController)
        }

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
