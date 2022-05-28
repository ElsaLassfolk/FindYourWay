package com.example.findyourway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.findyourway.navigation.BottomNavigationGraph
import com.example.findyourway.navigation.NavigationGraph
import com.example.findyourway.ui.theme.FindYourWayTheme
import com.example.findyourway.widget.BottomBarView

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
        BottomBarView()
        Surface(
            color = MaterialTheme.colors.primary,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()){
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                NavigationGraph()



            }
        }
    }
}

