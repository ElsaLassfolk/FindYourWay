package com.example.findyourway.widget

import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
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
    val activity = (LocalContext.current as? Activity)
    BottomNavigation(
        backgroundColor = Color.Black,
        contentColor = Color.White,
        modifier = Modifier.semantics(mergeDescendants = true) {}
    ) {
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Help,
                    contentDescription=null,
                    modifier = Modifier.size(width = 30.dp, height = 30.dp)
                )
            },
            label = { Text(stringResource(id = R.string.Help)) },
            selected = currentDestination?.hierarchy?.any { it.route == com.example.findyourway.navigation.Screen.Help.route } == true,
            onClick = { onNavigationSelected(com.example.findyourway.navigation.Screen.Help) },
            selectedContentColor = Color.White,
            unselectedContentColor = Color.White,
            modifier = Modifier.clickable(
                onClickLabel = stringResource(id = R.string.Click_to_help),
                onClick = {}
            )
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.ExitToApp,
                    contentDescription=null,
                    modifier = Modifier.size(width = 30.dp, height = 30.dp)
                )
            },
            label = { Text(stringResource(id = R.string.Exit)) },
            selected = currentDestination?.hierarchy?.any { it.route == com.example.findyourway.navigation.Screen.Main.route } == true,
            onClick = { activity?.finish() },
            selectedContentColor = Color.White,
            unselectedContentColor = Color.White,
            modifier = Modifier.clickable(
                onClickLabel = stringResource(id = R.string.Click_to_exit),
                onClick = {}
            )
        )
    }
}

