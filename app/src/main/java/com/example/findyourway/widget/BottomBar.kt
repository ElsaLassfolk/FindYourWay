package com.example.findyourway.widget

import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import com.example.findyourway.R
import com.example.findyourway.navigation.Screen


@Composable
fun BottomBar(
    modifier: Modifier,
    currentDestination: NavDestination?,
    onNavigationSelected: (Screen) -> Unit
) {
    BottomNavigation(
        backgroundColor = Color.Black,
        contentColor = Color.White

    ) {
        BottomNavigationItem(
            icon = { Icon(imageVector = Icons.Default.Home, "Home icon", modifier = Modifier.size(width=30.dp, height=30.dp)) },
            label = { Text(stringResource(id = R.string.Home)) },
            selected = currentDestination?.hierarchy?.any { it.route == com.example.findyourway.navigation.Screen.Main.route} == true,
            onClick = { onNavigationSelected(com.example.findyourway.navigation.Screen.Main)},
            selectedContentColor = Color.White,
            unselectedContentColor = Color.White
        )

        BottomNavigationItem(
            icon = { Icon(imageVector = Icons.Default.Help, "Help icon", modifier = Modifier.size(width=30.dp, height=30.dp)) },
            label = { Text(stringResource(id = R.string.Help)) },
            selected = currentDestination?.hierarchy?.any { it.route == com.example.findyourway.navigation.Screen.Help.route } == true,
            onClick = { onNavigationSelected(com.example.findyourway.navigation.Screen.Help) },
            selectedContentColor = Color.White,
            unselectedContentColor = Color.White
        )

        BottomNavigationItem(
            icon = { Icon(imageVector = Icons.Default.ExitToApp, "Exit icon", modifier = Modifier.size(width=30.dp, height=30.dp)) },
            label = { Text(stringResource(id = R.string.Exit)) },
            selected = currentDestination?.hierarchy?.any { it.route == com.example.findyourway.navigation.Screen.Main.route } == true,
            onClick = { onNavigationSelected(com.example.findyourway.navigation.Screen.Main) },
            selectedContentColor = Color.White,
            unselectedContentColor = Color.White
        )
    }
}

