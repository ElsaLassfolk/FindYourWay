package com.example.findyourway.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.findyourway.R
import com.example.findyourway.navigation.Screens

@Composable

fun MapScreen(navController: NavController) {
    androidx.compose.material.Surface(modifier = Modifier.fillMaxSize())
    {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        )
        {
            Row(modifier = Modifier
                .background(MaterialTheme.colors.surface)
                .padding(7.dp)
                .wrapContentHeight()) {

                Surface(modifier = Modifier
                    .padding(8.dp)
                    .size(60.dp),
                    shape = CircleShape,
                    color = Color(0xFFFFC400)
                ) {

                    Column(verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "1 km")
                    }
                }
                Column( modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)) {

                    Text(text = "1km from Eye and Ear Hospital",
                        style=MaterialTheme.typography.body1)
                }

            }



            Image(
                painter = painterResource(id = R.drawable.map),
                contentDescription = "Route icon",
                modifier = Modifier
                    .fillMaxWidth()
            )

            Button(onClick = { navController.navigate(Screens.RouteScreen.name) },
                modifier = Modifier
                    .padding(10.dp)
                    .width(250.dp)
                    .height(150.dp),
                shape = MaterialTheme.shapes.medium
            )
            {
                Text(
                    text = "Press to route ",
                    fontSize = 25.sp,
                    style=MaterialTheme.typography.button
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

    }
}