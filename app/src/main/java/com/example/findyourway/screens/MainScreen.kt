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
                Tips()
                TalkButton(navController)
            }

        }

    }

}

@Composable
fun Tips(){
    Column(
        Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .height(250.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text="Tips: You can type and search the destination address with top bar, or press the lower button to talk and tell your destination address",
            style=MaterialTheme.typography.caption,
            color=MaterialTheme.colors.onSecondary,
            modifier = Modifier.padding(6.dp))
    }
}

@Composable
fun TalkButton(navController: NavController) {
    Column(
        Modifier
            //  .padding(20.dp)
            .fillMaxWidth()
            .height(250.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
    }
    Button(onClick = {
        navController.navigate(Screens.MapScreen.name) },
        modifier = Modifier
            .width(250.dp)
            .height(150.dp),
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
