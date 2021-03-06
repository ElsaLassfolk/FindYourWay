package com.example.findyourway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.findyourway.navigation.NavigationGraph
import com.example.findyourway.ui.theme.FindYourWayTheme
import com.example.findyourway.widget.BottomBar

/** App Main Activity, with content, app bar and navigation bar.
 *
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FindYourWay()
        }
    }
}


@Composable
fun FindYourWay() {
    FindYourWayTheme() {
        CompositionLocalProvider(LocalRippleTheme provides SecondaryRippleTheme) {


            val navController = rememberNavController()
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination


            Scaffold(
                topBar = {
                    TopAppBar(
                        title = {
                            Text(
                                stringResource(id = R.string.find_your_way),
                                color = MaterialTheme.colors.onPrimary
                            )
                        },
                        navigationIcon = if (navController.previousBackStackEntry != null) {
                            {
                                IconButton(onClick = { navController.navigateUp() },
                                    modifier = Modifier
                                        .semantics(mergeDescendants = true) {}
                                        .clickable(
                                            onClickLabel = stringResource(id = R.string.Click_to_go_back),
                                            onClick = {})
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.back),
                                        contentDescription = null,
                                    )
                                }
                            }
                        } else {
                            null
                        }
                    )
                },
                bottomBar = {
                    BottomBar(
                        modifier = Modifier
                            .fillMaxWidth(),
                        currentDestination = currentDestination,
                        onNavigationSelected = { screen ->
                            navController.navigate(screen.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                },
            )
            { paddingValues ->
                NavigationGraph(Modifier.padding(paddingValues), navController)
            }
        }
    }
}


@Immutable
private object SecondaryRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = RippleTheme.defaultRippleColor(
        contentColor = MaterialTheme.colors.secondary,
        lightTheme = MaterialTheme.colors.isLight
    )

    @Composable
    override fun rippleAlpha() = RippleTheme.defaultRippleAlpha(
        contentColor = MaterialTheme.colors.secondary,
        lightTheme = MaterialTheme.colors.isLight
    )
}