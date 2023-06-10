package com.example.metrix.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.metrix.R
import com.example.metrix.data.enums.FormeName
import com.example.metrix.data.enums.MetrixScreen
import com.example.metrix.data.enums.SelectMesureUnit
import com.example.metrix.data.enums.SelectRequestedValue
import com.example.metrix.data.models.FormeModel
import com.example.metrix.ui.screens.element.AppButton
import com.example.metrix.ui.screens.element.AppTextField
import com.example.metrix.ui.theme.MetrixTheme


@Composable
fun Forme(
    modifier: Modifier = Modifier,
    navController: NavController = NavController(LocalContext.current),
    formeState: MutableState<FormeModel>? = null,
    selectRequestedValueState: MutableState<SelectRequestedValue>? = null,
    mesureUnitState: MutableState<SelectMesureUnit>? = null,
    resultState: MutableState<String>? = null,
) {

    val forme = formeState?.value ?: FormeModel(FormeName.Triangle)
    val requestedValue = selectRequestedValueState?.value ?: SelectRequestedValue.Perimetre
    val mesureUnit = mesureUnitState?.value ?: SelectMesureUnit.Metre
    var result = resultState?.value ?: ""


    fun goTo(destination: MetrixScreen) = navController.navigate(destination.name)
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = forme.name.toString(),
            style = MaterialTheme.typography.displayMedium,
            color = MaterialTheme.colorScheme.primary
        )
        Image(
            painter = painterResource(id = forme.imageID),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
        )

        if (requestedValue == SelectRequestedValue.Perimetre) {
            Text(
                text = forme.perimeterFormula,
                style = MaterialTheme.typography.headlineMedium,
            )
        }

        Spacer(modifier = Modifier.size(10.dp))
        if (requestedValue == SelectRequestedValue.Aire) {
            Text(
                text = forme.areaFormula,
                style = MaterialTheme.typography.headlineMedium,
            )
        }



        forme.cotes.keys.forEach { cote ->
            var coteValue = forme.cotes[cote]
            var input by rememberSaveable { mutableStateOf("") }
            Spacer(modifier = Modifier.size(15.dp))
            AppTextField(
                value = input,
                onValueChange = { input = it },
            )
        }
        Spacer(modifier = Modifier.size(20.dp))

        fun calculat(
            forme: FormeModel,
            requestedValue: SelectRequestedValue,
            mesureUnit: SelectMesureUnit,
        ) {
            if (requestedValue == SelectRequestedValue.Perimetre) {
                resultState!!.value = forme.perimeter.toString()
            }
            if (requestedValue == SelectRequestedValue.Aire) {
                resultState!!.value = forme.area.toString()
            }

        }

        AppButton(
            onClick = {
                goTo(MetrixScreen.Result)
                calculat(forme, requestedValue, mesureUnit)
            },
            text = stringResource(R.string.calculer)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun FormePreview() {
    MetrixTheme {
        Forme()
    }
}