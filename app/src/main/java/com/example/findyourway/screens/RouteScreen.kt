package com.example.findyourway.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.findyourway.R
import com.example.findyourway.navigation.Screen
import com.example.findyourway.ui.theme.FindYourWayTheme

@Composable

fun RouteScreen(navController: NavController) {
    FindYourWayTheme() {
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
}
        @Composable
        fun DirectionTextView() {
            Surface(modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
                .padding(start = 8.dp, end=8.dp)){
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.arrow),
                        contentDescription = "arrow icon",
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
        modifier = Modifier
            .padding(10.dp)
            .width(300.dp)
            .height(80.dp),
    )
    {
        Text(
            text = "See Live View",
            fontSize = 25.sp,
            style = MaterialTheme.typography.button
        )
        Image(
            painter = painterResource(id = R.drawable.route),
            contentDescription = "favorite icon",
            modifier = Modifier
                .size(40.dp)
                .padding(4.dp)
        )
    }

}