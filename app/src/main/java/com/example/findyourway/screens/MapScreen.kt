package com.example.findyourway.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.findyourway.R
import com.example.findyourway.navigation.Screen

/**
 * UI screen for Map Screen
 */

@Composable
fun MapScreen(navController: NavController) {
    Surface(Modifier.fillMaxHeight(1f)) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MapScreenTextView()
            Map()
            RouteScreenButton(navController = navController)

        }

    }

}



@Composable
fun MapScreenTextView() {
    Surface(
        modifier = Modifier
            .height(80.dp)
            .fillMaxWidth()
            .padding(start = 12.dp, end = 12.dp)
    ) {
        Row(
            modifier = Modifier
                .background(MaterialTheme.colors.surface)
                .padding(4.dp)
                .wrapContentHeight()
                .semantics(mergeDescendants = true){}
        ) {

            Surface(
                modifier = Modifier
                    .padding(8.dp)
                    .size(60.dp),
                shape = CircleShape,
                color = Color(0xFFFFC400)
            ) {

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "1 km")
                }
            }
            Column(
                modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)
            ) {

                Text(
                    text = "1km from Eye and Ear Hospital"

                )
            }

        }
    }

}

@Composable
fun Map() {
    Image(
        painter = painterResource(id = R.drawable.map),
        contentDescription = stringResource(id = R.string.Route_icon),
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
    )


}


@Composable
fun RouteScreenButton(navController: NavController) {
    Button(
        onClick = { navController.navigate(Screen.Route.route) },
        shape= MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(10.dp)
            .width(400.dp)
            .height(100.dp)
            .clickable(
                onClick = {},
                onClickLabel = stringResource(id = R.string.Click_to_direction)
            )
    )
    {
        Text(
            text = stringResource(id = R.string.Press_to_route)

            )
        Image(
            painter = painterResource(id = R.drawable.route),
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .padding(4.dp)
        )
    }

}
