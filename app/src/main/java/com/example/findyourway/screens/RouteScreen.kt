package com.example.findyourway.screens

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.findyourway.R
import com.example.findyourway.navigation.Screens

@Composable

fun RouteScreen(navController: NavController) {
    androidx.compose.material.Surface(modifier = Modifier.fillMaxSize())
    {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        )
        {

            Surface(modifier = Modifier.fillMaxWidth().padding(4.dp)){
                Row(horizontalArrangement = Arrangement.Center, verticalAlignment = CenterVertically){
                    Image(painter = painterResource(id=R.drawable.arrow),
                        contentDescription = "arrow icon",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(40.dp)
                            .padding(4.dp))
                    Text("Head northwest on Topeliuksenkatu/Topeliusgatan toward Eino Leinon katu/Eino Leinos gata",
                        style=MaterialTheme.typography.body1 )

                }
            }
            Image(
                painter = painterResource(id = R.drawable.routewithcues),
                contentDescription = "Route icon",
                modifier = Modifier
                    .fillMaxWidth()
            )


            Button(onClick = { navController.navigate(Screens.ARscreen.name)},
                modifier = Modifier
                    .padding(10.dp)
                    .width(250.dp)
                    .height(150.dp),
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

    }
}