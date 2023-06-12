package com.example.metrix.data

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.metrix.data.enums.FormeName
import com.example.metrix.data.enums.MetrixScreen
import com.example.metrix.data.enums.SelectMesureUnit
import com.example.metrix.data.enums.SelectRequestedValue
import com.example.metrix.data.models.FormeModel

object General {

    //    App States
    @SuppressLint("StaticFieldLeak")
    lateinit var navController: NavHostController
    var formeState: MutableState<FormeModel>? = null
    var requestedValueState: MutableState<SelectRequestedValue>? = null
    var mesureUnitState: MutableState<SelectMesureUnit>? = null
    var resultState: MutableState<String> = mutableStateOf("")

    //    App Screens
    val HomeScreen = MetrixScreen.Home
    val FormesScreen = MetrixScreen.Formes
    val RequestedValueScreen = MetrixScreen.RequestedValue
    val MesureUniteScreen = MetrixScreen.MesureUnite
    val FormeScreen = MetrixScreen.Forme

    @Composable
    fun StateInit() {
        navController = rememberNavController()
        formeState = remember { mutableStateOf(FormeModel(FormeName.Triangle)) }
        requestedValueState = remember { mutableStateOf(SelectRequestedValue.Perimetre) }
        mesureUnitState = remember { mutableStateOf(SelectMesureUnit.Metre) }
        resultState = remember { mutableStateOf("") }
    }


    fun goTo(destination: MetrixScreen) {
        navController.navigate(destination.name)
    }

}