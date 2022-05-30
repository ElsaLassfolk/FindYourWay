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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.findyourway.R

@Composable
fun SearchBar(
    title: String="Title",
    icon: ImageVector?=null,
    isMainScreen:Boolean=true,
    elevation: Dp =0.dp,
    onAddActionClicked: () -> Unit={},
    onButtonClicked:()-> Unit={}

){

    TopAppBar(modifier=Modifier
        .clickable(onClickLabel= stringResource(id = R.string.Enter_address),onClick={})
        .semantics(mergeDescendants = true) {},
        title = {
        Text(text = title,
            color=MaterialTheme.colors.onSecondary,
            style=MaterialTheme.typography.body1)
    },
        actions= {
            if (isMainScreen) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null
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
