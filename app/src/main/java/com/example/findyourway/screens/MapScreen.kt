package com.example.findyourway.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.findyourway.R
import com.example.findyourway.navigation.BottomNavigationGraph
import com.example.findyourway.navigation.NavigationGraph
import com.example.findyourway.navigation.Screens
import com.example.findyourway.widget.BottomBar
import com.example.findyourway.widget.BottomBarView
import com.example.findyourway.widget.SearchBar

@Composable
fun MapScreen(navController: NavController) {

        BottomBarView()
        Surface(Modifier.fillMaxHeight(0.9f)) {
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
                .height(100.dp)
                .fillMaxWidth()
                .padding(start=12.dp, end=12.dp)
        ) {
            Row(
                modifier = Modifier
                    .background(MaterialTheme.colors.surface)
                    .padding(8.dp)
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
                        text = "1km from Eye and Ear Hospital",
                        style = MaterialTheme.typography.body1
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
            onClick = { navController.navigate(Screens.RouteScreen.name) },
            modifier = Modifier
                .padding(10.dp)
                .width(250.dp)
                .height(80.dp),
            shape = MaterialTheme.shapes.medium
        )
        {
            Text(
                text = "Press to route ",
                fontSize = 25.sp,
                style = MaterialTheme.typography.button
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
