package com.example.findyourway.navigation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.findyourway.screens.*

/**
 * Navigation logic for the app.
 */

sealed class Screen(
    val route: String
) {
    object Help : Screen("Help")
    object Main : Screen("Main")
    object Map : Screen("Map")
    object Route : Screen("Route")
    object AR : Screen("AR")
}

@Composable
fun NavigationGraph(
    modifier: Modifier,
    navController: NavHostController,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Screen.Main.route,
    ) {
        composable(Screen.Main.route) {
            MainScreen(navController = navController)
        }
        composable(Screen.Map.route) {
            MapScreen(navController = navController)
        }
        composable(Screen.Route.route) {
            RouteScreen(navController = navController)
        }
        composable(Screen.AR.route) {
            ARscreen(navController = navController)
        }
        composable(Screen.Help.route) {
            HelpScreen(navController = navController)
        }
    }
}