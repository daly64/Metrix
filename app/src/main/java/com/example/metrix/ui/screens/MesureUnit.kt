package com.example.metrix.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.metrix.R
import com.example.metrix.ui.navigation.MetrixScreen
import com.example.metrix.ui.screens.element.AppButton
import com.example.metrix.ui.theme.MetrixTheme


@Composable
fun MesureUnit(
    modifier: Modifier = Modifier,
    navController: NavController = NavController(LocalContext.current),
) {
    fun goTo(destination: MetrixScreen) = navController.navigate(destination.name)
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = stringResource(R.string.mesure_select),
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(325.dp)
        )
        Spacer(modifier = Modifier.size(30.dp))
        AppButton(
            onClick = { goTo(MetrixScreen.Forme) },
            text = stringResource(R.string.centimtrem)
        )
        Spacer(modifier = Modifier.size(30.dp))
        AppButton(
            onClick = { goTo(MetrixScreen.Forme) },
            text = stringResource(R.string.metre))


    }
}

@Preview(showBackground = true)
@Composable
fun MesureUnitPreview() {
    MetrixTheme {
        MesureUnit()
    }
}