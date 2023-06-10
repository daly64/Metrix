package com.example.metrix.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.metrix.data.enums.FormeName
import com.example.metrix.data.enums.MetrixScreen
import com.example.metrix.data.enums.SelectMesureUnit
import com.example.metrix.data.enums.SelectRequestedValue
import com.example.metrix.data.models.FormeModel
import com.example.metrix.ui.screens.Forme
import com.example.metrix.ui.screens.Formes
import com.example.metrix.ui.screens.Home
import com.example.metrix.ui.screens.MesureUnit
import com.example.metrix.ui.screens.RequestedValue
import com.example.metrix.ui.screens.Result

@Composable
fun Navigation() {
    val navController = rememberNavController()
    var formeState = remember { mutableStateOf(FormeModel(FormeName.Triangle)) }
    var selectRequestedValueState = remember { mutableStateOf(SelectRequestedValue.Perimetre) }
    var mesureUnitState = remember { mutableStateOf(SelectMesureUnit.Metre) }
    var resultState = remember { mutableStateOf("") }
    NavHost(
        navController = navController,
        startDestination = MetrixScreen.Home.name
    ) {
        composable(MetrixScreen.Home.name) { Home(navController = navController) }
        composable(MetrixScreen.Formes.name) {
            Formes(
                navController = navController,
                formeState = formeState
            )
        }
        composable(MetrixScreen.RequestedValue.name) {
            RequestedValue(
                navController = navController,
                requestedValueState = selectRequestedValueState
            )
        }
        composable(MetrixScreen.MesureUnite.name) {
            MesureUnit(
                navController = navController,
                mesureUnitState = mesureUnitState
            )
        }
        composable(MetrixScreen.Forme.name) {
            Forme(
                navController = navController,
                formeState = formeState,
                selectRequestedValueState = selectRequestedValueState,
                mesureUnitState = mesureUnitState,
                resultState = resultState,
            )
        }
        composable(MetrixScreen.Result.name) {
            Result(
                navController = navController,
                resultState = resultState
            )
        }

    }

}

