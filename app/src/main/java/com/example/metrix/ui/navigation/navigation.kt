package com.example.metrix.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.metrix.ui.screens.Forme
import com.example.metrix.ui.screens.Formes
import com.example.metrix.ui.screens.Home
import com.example.metrix.ui.screens.MesureUnit
import com.example.metrix.ui.screens.RequestedValue
import com.example.metrix.ui.screens.Result

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MetrixScreen.Home.name) {
        composable(MetrixScreen.Home.name) { Home() }
        composable(MetrixScreen.Formes.name) { Formes() }
        composable(MetrixScreen.RequestedValue.name) { RequestedValue() }
        composable(MetrixScreen.MesureUnite.name) { MesureUnit() }
        composable(MetrixScreen.Forme.name) { Forme() }
        composable(MetrixScreen.Result.name) { Result() }

    }
}