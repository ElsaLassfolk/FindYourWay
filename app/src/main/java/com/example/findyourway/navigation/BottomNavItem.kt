package com.example.findyourway.navigation

import androidx.annotation.DrawableRes
import com.example.findyourway.R

sealed class BottomNavItem (val route: String, val title : String) {
        object Home : BottomNavItem(route = "home", title = "Home")
        object Help : BottomNavItem( route = "Help", title = "Help")
        object Exit : BottomNavItem(route = "exit", title = "Exit")
    }

