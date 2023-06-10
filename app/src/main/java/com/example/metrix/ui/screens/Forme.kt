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
import com.example.metrix.data.models.Forme
import com.example.metrix.ui.navigation.MetrixScreen
import com.example.metrix.ui.screens.element.AppButton
import com.example.metrix.ui.screens.element.AppTextField
import com.example.metrix.ui.theme.MetrixTheme


@Composable
fun Forme(
    modifier: Modifier = Modifier,
    navController: NavController = NavController(LocalContext.current),
) {
    val forme = Forme(FormeName.Triangle)
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


        Text(
            text = forme.perimeterFormula,
            style = MaterialTheme.typography.headlineMedium,
        )
        Spacer(modifier = Modifier.size(10.dp))
        Text(
            text = forme.areaFormula,
            style = MaterialTheme.typography.headlineMedium,
        )


        forme.cotes.keys.forEach { cote ->
            Spacer(modifier = Modifier.size(15.dp))
            AppTextField(
                value = "",
                onValueChange = { },
                placeholder = { Text(text = cote) },
            )
        }
        Spacer(modifier = Modifier.size(20.dp))

        AppButton(
            onClick = { goTo(MetrixScreen.Result) },
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