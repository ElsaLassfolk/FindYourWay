package com.example.findyourway.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * Customized Material Theme for color
 */

private val DarkColorPalette = darkColors(
    primary = Indigo,
    secondary=Color.Black,
    onPrimary = Color.White,
    onBackground =Color.Black,
    onSecondary = Color.Black,
    onSurface =Color.White,
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