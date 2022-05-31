package com.example.findyourway.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.findyourway.R
import com.example.findyourway.navigation.Screen
import com.example.findyourway.ui.theme.FindYourWayTheme

/**
 * UI screen for Map Live View
 */

@Composable
fun ARscreen(navController: NavController) {
    Surface(Modifier.fillMaxWidth()) {
        Column(
            verticalArrangement = Arrangement.Center,
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
        contentDescription = stringResource(id = R.string.live_view),
        modifier = Modifier
            .height(570.dp)
            .fillMaxWidth())

}



@Composable
fun ARscreenButton(navController: NavController){

    Button(
        onClick = { navController.navigate(Screen.Main.route) },
        modifier = Modifier
            .padding(10.dp)
            .width(400.dp)
            .height(100.dp)
            .clickable(
                onClick = {},
                onClickLabel = stringResource(id = R.string.Add_to_favorite)
            ),
        shape= MaterialTheme.shapes.medium
        

    )
    {
        Text(
            text = stringResource(id = R.string.Add_to_favorite),
            fontSize = 26.sp
        )
        Icon(
            imageVector = Icons.Default.Favorite,
            modifier = Modifier
                .size(40.dp)
                .padding(4.dp),
            contentDescription = null
        )
    }

}
