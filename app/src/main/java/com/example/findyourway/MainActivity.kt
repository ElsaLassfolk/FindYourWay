package com.example.findyourway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.findyourway.navigation.Navigation
import com.example.findyourway.ui.theme.FindYourWayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FindYourWay()
        }
    }
}


@Composable
fun FindYourWay() {
    FindYourWayTheme() {
        Surface(
            color = MaterialTheme.colors.primary,
            modifier = Modifier.fillMaxSize()){
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Navigation()
            }
        }
    }
}

