package com.example.findyourway.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.findyourway.widget.SearchBar
import com.example.findyourway.R
import com.example.findyourway.navigation.Screen

/**
 * UI screen for Main Screen
 */

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(topBar = {
        SearchBar(
            title = "Search destination",
            elevation = 5.dp
        )

        Log.d("TAG", "MainSearch")
    }) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(
                verticalArrangement = Arrangement.Center,
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
        modifier = Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_size),
            contentDescription = "company logo",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(220.dp)
        )

    }
}

@Composable
fun Tips(){
    Column(modifier = Modifier
        .wrapContentSize()
        .padding(start=60.dp, bottom=60.dp, end=40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        Text(text="Tips: You can type and search the destination address with top bar, or press the lower button to talk and tell your destination address",
            style=MaterialTheme.typography.body1,
            color=MaterialTheme.colors.onSecondary,
            modifier = Modifier.padding(6.dp))
    }
}

@Composable
fun TalkButton(navController: NavController) {

    Button(onClick = {
        navController.navigate(Screen.Map.route) },
        modifier = Modifier
            .width(300.dp)
            .height(80.dp),
        shape = MaterialTheme.shapes.medium

    ){
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

