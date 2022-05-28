package com.example.findyourway.screens

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Help
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.findyourway.navigation.Screens
import com.example.findyourway.widget.SearchBar
import com.example.findyourway.R

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(topBar= {
        SearchBar(
            title = "Search destination",
            elevation = 5.dp)

        Log.d("TAG", "MainSearch")
    }){
        Surface() {
            Column(verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CompanyLogo()
                Tips()
                TalkButton(navController)
            }

        }

    }

}

@Composable
fun CompanyLogo() {
        Column(
            modifier = Modifier.padding(1.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_size),
                contentDescription = "company logo",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(200.dp)
            )

        }
    }

@Composable
fun Tips(){
    Column(
        Modifier
            .padding(30.dp)
            .fillMaxWidth()
            .fillMaxHeight(0.6f)
        ){
        Text(text="Tips: You can type and search the destination address with top bar, or press the lower button to talk and tell your destination address",
            style=MaterialTheme.typography.caption,
            color=MaterialTheme.colors.onSecondary,
            modifier = Modifier.padding(6.dp))
    }
}

@Composable
fun TalkButton(navController: NavController) {

    Button(onClick = {
        navController.navigate(Screens.MapScreen.name) },
        modifier = Modifier
            .width(250.dp)
            .height(80.dp),
        shape = MaterialTheme.shapes.medium){
        Text(text = "Press and Talk",
            style=MaterialTheme.typography.button)

        Image(painter = painterResource(id=R.drawable.microphone),
            contentDescription = "microphone icon",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(40.dp)
                .padding(4.dp))
    }
}
