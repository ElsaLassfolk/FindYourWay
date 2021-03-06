package com.example.findyourway.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
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
            elevation = 5.dp,
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
        //modifier = Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_size),
            contentDescription = stringResource(id = R.string.CompanyLogo),
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(200.dp)
        )

    }
}

@Composable
fun Tips(){
    Column(modifier = Modifier
        .wrapContentSize()
        .padding(start = 30.dp, bottom = 20.dp, end = 30.dp),
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
            .padding(10.dp)
            .width(350.dp)
            .height(100.dp)
            .clickable(
                onClick = {},
                onClickLabel = stringResource(id = R.string.Press_and_talk)
            )
            .semantics(mergeDescendants = true){},
            shape= MaterialTheme.shapes.medium
    ){
        Text(text = stringResource(id = R.string.Press_and_talk),
            style=MaterialTheme.typography.button)

        Image(painter = painterResource(id=R.drawable.microphone),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(40.dp)
                .padding(4.dp))
    }
}

