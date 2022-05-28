package com.example.findyourway.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Indigo,
    secondary=Color.Black,
    onPrimary = Color.White,
    onBackground =Color.Black,
    onSecondary = Color.Black,
    onSurface =Color.Black,
    secondaryVariant = Color.Black

)

private val LightColorPalette = lightColors(
    primary = Indigo,
    secondary=Color.Black,
    onPrimary = Color.White,
    onBackground =Color.Black,
    onSecondary = Color.Black,
    onSurface =Color.Black,
    secondaryVariant = Color.Black

)

//dark theme set to false

@Composable
fun FindYourWayTheme(
    darkTheme: Boolean = false,
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