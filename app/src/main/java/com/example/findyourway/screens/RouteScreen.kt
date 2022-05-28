package com.example.findyourway.screens

import android.app.MediaRouteButton
import android.view.Gravity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.findyourway.R
import com.example.findyourway.navigation.Screens
import com.example.findyourway.widget.BottomBarView

@Composable

fun RouteScreen(navController: NavController) {
    BottomBarView()
    Surface(Modifier.fillMaxHeight(0.9f)) {
        Column(
            verticalArrangement = Arrangement.Center,
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
                .padding(8.dp)) {
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
                    StringResourceText()

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
        fun RouteButton(navController: NavController){
            Button(onClick = { navController.navigate(Screens.ARscreen.name)},
                modifier = Modifier
                    .padding(2.dp)
                    .width(250.dp)
                    .height(80.dp),
                shape = MaterialTheme.shapes.medium
            )
            {
                Text(
                    text = "See live view",
                    style=MaterialTheme.typography.button,
                    textAlign = TextAlign.Center,
                )
                Icon(
                    imageVector = Icons.Default.Favorite,
                    modifier = Modifier
                        .size(40.dp)
                        .padding(4.dp),
                    contentDescription = "favorite icon"
                )
            }

        }


@Composable
fun StringResourceText() {
    Text(stringResource(R.string.direction))
}