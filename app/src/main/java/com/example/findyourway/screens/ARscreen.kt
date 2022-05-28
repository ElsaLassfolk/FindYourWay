package com.example.findyourway.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.findyourway.R
import com.example.findyourway.navigation.Screens
import com.example.findyourway.widget.BottomBarView

@Composable
fun ARscreen(navController: NavController) {
    BottomBarView()
    Surface(Modifier.fillMaxWidth()) {
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ARscreenImage()
            ARscreenButton(navController = navController)

        }

    }

    }


@Composable
fun ARscreenImage(){
        Image(painter = painterResource(id = R.drawable.ar),
            contentDescription = "Live View",
            modifier = Modifier
                .width(550.dp))
    }



        @Composable
        fun ARscreenButton(navController: NavController){

            Button(onClick = { navController.navigate(Screens.MainScreen.name)},
                modifier = Modifier
                    .width(250.dp)
                    .height(80.dp),
                shape = MaterialTheme.shapes.medium)
            {
                Text(
                    text = "Add to favorite",
                    style=MaterialTheme.typography.button,
                    textAlign = TextAlign.Justify
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
