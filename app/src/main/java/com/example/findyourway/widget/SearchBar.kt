package com.example.findyourway.widget

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchBar(
    title: String="Title",
    icon: ImageVector?=null,
    isMainScreen:Boolean=true,
    elevation: Dp =0.dp,
    onAddActionClicked: () -> Unit={},
    onButtonClicked:()-> Unit={}

){
    TopAppBar(title = {
        Text(text = title,
            color=MaterialTheme.colors.onSecondary,
            style=TextStyle(fontWeight = FontWeight.Bold,
                fontSize = 25.sp))
    },
        actions= {
            if (isMainScreen) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Enter your destination address "
                    )
                }
            } else Box {}
        },
        navigationIcon = {
            if (icon != null) {
                Icon(imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.clickable{
                        onButtonClicked.invoke()
                    })
            }
        },


        backgroundColor= Color.Transparent,
        elevation = elevation)

}
