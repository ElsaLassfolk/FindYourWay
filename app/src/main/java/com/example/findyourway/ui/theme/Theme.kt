package com.example.findyourway.ui.theme

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Customized Material Theme for color
 */

private val DarkColorPalette = darkColors(
    primary = Indigo,
    secondary=Color.White,
    onPrimary = Color.Blue,
    onBackground =Color.White,
    onSecondary = Color.DarkGray,
    onSurface =Color.White,
    secondaryVariant = Color.Black

)

private val LightColorPalette = lightColors(
    primary = Indigo,
    secondary=Color.White,
    onPrimary = Color.White,
    onBackground =Color.Black,
    onSecondary = Color.Black,
    onSurface =Color.Black,
    secondaryVariant = Color.Black

)



@Composable
fun FindYourWayTheme(
    darkTheme: Boolean = false, //dark theme set to false
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

