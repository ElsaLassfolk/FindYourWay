package com.example.findyourway.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.findyourway.R
import com.example.findyourway.navigation.Screen

/**
 * UI screen for Route Screen
 */

@Composable
fun RouteScreen(navController: NavController) {
    Surface(Modifier.fillMaxHeight(1f)) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            DirectionTextView()
            RouteMap()
            RouteButton(navController = navController)

        }
    }
}

@Composable
fun DirectionTextView() {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .height(120.dp)
        .padding(start = 8.dp, end = 8.dp)
       ){
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = CenterVertically,
            modifier = Modifier.semantics(mergeDescendants = true){}
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(40.dp)
                    .padding(4.dp)
            )
            Text(stringResource(id = R.string.direction), style=MaterialTheme.typography.body1)

        }
    }

}

@Composable
fun RouteMap() {
    Image(
        painter = painterResource(id = R.drawable.routewithcues),
        contentDescription = "Route icon",
        modifier = Modifier
            .fillMaxWidth())

}


@Composable
fun RouteButton(navController: NavController) {
    Button(
        onClick = { navController.navigate(Screen.AR.route) },
        shape= MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(10.dp)
            .width(400.dp)
            .height(100.dp)
            .clickable(
                onClick = {},
                onClickLabel = stringResource(id = R.string.Click_to_LiveView)
            )
    )
    {
        Text(
            text = stringResource(id = R.string.See_Live_View),
            style = MaterialTheme.typography.button
        )
        Image(
            painter = painterResource(id = R.drawable.liveview),
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .padding(4.dp)
        )
    }

}