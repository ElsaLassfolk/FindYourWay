package com.example.findyourway.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.findyourway.R
import com.example.findyourway.navigation.Screen
import com.example.findyourway.ui.theme.FindYourWayTheme

@Composable
fun MapScreen(navController: NavController) {
    FindYourWayTheme() {
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
}


    @Composable
    fun MapScreenTextView() {
        Surface(
            modifier = Modifier
                .height(80.dp)
                .fillMaxWidth()
                .padding(start=12.dp, end=12.dp)
        ) {
            Row(
                modifier = Modifier
                    .background(MaterialTheme.colors.surface)
                    .padding(4.dp)
                    .wrapContentHeight()
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
            contentDescription = "Route icon",
            modifier = Modifier
                .fillMaxWidth()
        )


    }


    @Composable
    fun RouteScreenButton(navController: NavController) {
        Button(
            onClick = { navController.navigate(Screen.Route.route) },
            modifier = Modifier
                .padding(10.dp)
                .width(300.dp)
                .height(80.dp),
        )
        {
            Text(
                text = "Press to route ",

            )
            Image(
                painter = painterResource(id = R.drawable.route),
                contentDescription = "Route icon",
                modifier = Modifier
                    .size(40.dp)
                    .padding(4.dp)
            )
        }

    }
