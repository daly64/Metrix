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
import androidx.compose.runtime.mutableStateOf
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
import com.example.metrix.data.models.getArea
import com.example.metrix.data.models.getPerimeter
import com.example.metrix.ui.screens.element.AppButton
import com.example.metrix.ui.screens.element.AppCotesInput
import com.example.metrix.ui.screens.element.AppFormulaLabel
import com.example.metrix.ui.theme.MetrixTheme
import kotlin.math.roundToLong


@Composable
fun Forme(
    modifier: Modifier = Modifier,
    navController: NavController = NavController(LocalContext.current),
    formeState: MutableState<FormeModel>? = null,
    selectRequestedValueState: MutableState<SelectRequestedValue>? = null,
    mesureUnitState: MutableState<SelectMesureUnit>? = null,
    resultState: MutableState<String> = mutableStateOf("0"),
) {

    val forme = formeState?.value ?: FormeModel(FormeName.Triangle)
    val requestedValue = selectRequestedValueState?.value ?: SelectRequestedValue.Perimetre
    val mesureUnit = mesureUnitState?.value ?: SelectMesureUnit.Metre


    fun goTo(destination: MetrixScreen) = navController.navigate(destination.name)

    fun calculat(
        forme: FormeModel,
        requestedValue: SelectRequestedValue,
        mesureUnit: SelectMesureUnit,

        ): String {
        return when (requestedValue) {
            SelectRequestedValue.Perimetre -> {
                forme.getPerimeter()
                val unit = if (mesureUnit == SelectMesureUnit.Centimetre) " Cm" else " m"
                val value = (forme.perimeterValue.roundToLong()).toDouble()
                "$value $unit"
            }

            SelectRequestedValue.Aire -> {
                forme.getArea()
                val unit = if (mesureUnit == SelectMesureUnit.Centimetre) " Cm²" else " m²"
//                "${forme.areaValue} $unit"
                val value = (forme.areaValue.roundToLong()).toDouble()
                "$value $unit"
            }

        }
    }

    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = forme.formeName.toString(),
            style = MaterialTheme.typography.displayMedium,
            color = MaterialTheme.colorScheme.primary
        )
        Image(
            painter = painterResource(id = forme.imageID),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
        )
        Spacer(modifier = Modifier.size(10.dp))

        when (requestedValue) {
            SelectRequestedValue.Perimetre -> {
                AppFormulaLabel(formula = forme.perimeterFormula)
                AppCotesInput(
                    requestedCotes = forme.perimeterCotes,
                    forme = forme
                ) { resultState.value = calculat(forme, requestedValue, mesureUnit) }
            }

            SelectRequestedValue.Aire -> {
                AppFormulaLabel(formula = forme.areaFormula)
                AppCotesInput(
                    requestedCotes = forme.areaCotes,
                    forme = forme
                ) { resultState.value = calculat(forme, requestedValue, mesureUnit) }
            }
        }


        Spacer(modifier = Modifier.size(20.dp))


        Text(
            text = "${requestedValue.name} = ${resultState.value}",
            style = MaterialTheme.typography.headlineMedium,
        )
        Spacer(modifier = Modifier.size(20.dp))
        AppButton(
            onClick = { goTo(MetrixScreen.Home) },
            text = stringResource(R.string.retour),
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