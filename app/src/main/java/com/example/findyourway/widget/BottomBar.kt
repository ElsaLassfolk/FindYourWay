package com.example.findyourway.widget

import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.findyourway.navigation.BottomNavItem
import com.example.findyourway.navigation.BottomNavigationGraph

@Composable
fun BottomBar(navController: NavController){

    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Help,
        BottomNavItem.Exit
    )

    BottomNavigation(
        elevation = 5.dp
    ){
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.map {
            BottomNavigationItem(
                icon= {
                },
                label= {
                    Text(
                        text = it.title
                    )
                },
                selected = currentRoute == it.route,
                selectedContentColor= Color.White,
                unselectedContentColor= Color.White.copy(alpha = 0.4f),
                onClick = {
                    navController.navigate(it.route)
                }
            )
        }

    }
}

@Composable
fun BottomBarView() {
    val navController = rememberNavController()
    Scaffold(bottomBar = {
        BottomBar(navController)
    }
    ) {
        BottomNavigationGraph(navController = navController)
    }
}