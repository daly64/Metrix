package com.example.metrix.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.metrix.data.General.StateInit
import com.example.metrix.data.General.navController
import com.example.metrix.data.enums.MetrixScreen
import com.example.metrix.ui.screens.Forme
import com.example.metrix.ui.screens.Formes
import com.example.metrix.ui.screens.Home
import com.example.metrix.ui.screens.MesureUnit
import com.example.metrix.ui.screens.RequestedValue


@Composable
fun Navigation() {
    StateInit()

    NavHost(
        navController = navController,
        startDestination = MetrixScreen.Home.name
    ) {
        composable(MetrixScreen.Home.name) { Home() }
        composable(MetrixScreen.Formes.name) { Formes() }
        composable(MetrixScreen.RequestedValue.name) { RequestedValue() }
        composable(MetrixScreen.MesureUnite.name) { MesureUnit() }
        composable(MetrixScreen.Forme.name) { Forme() }


    }

}

