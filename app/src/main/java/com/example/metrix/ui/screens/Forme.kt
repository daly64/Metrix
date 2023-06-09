package com.example.metrix.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.metrix.data.enums.FormeName
import com.example.metrix.data.models.Forme
import com.example.metrix.ui.navigation.MetrixScreen
import com.example.metrix.ui.theme.MetrixTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Forme(modifier: Modifier = Modifier,
          navController: NavController = NavController(LocalContext.current),
) {
    val forme = Forme(FormeName.Triangle)
    fun goTo(destination: MetrixScreen) = navController.navigate(destination.name)
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = forme.imageID),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
        )
        Text(
            text = forme.name.toString(),
            style = MaterialTheme.typography.displayMedium,
            color = MaterialTheme.colorScheme.primary
        )

        Text(
            text = forme.perimeterFormula,
            style = MaterialTheme.typography.titleLarge,
        )
        Spacer(modifier = Modifier.size(10.dp))
        Text(
            text = forme.areaFormula,
            style = MaterialTheme.typography.titleLarge,
        )


        forme.cotes.keys.forEach { cote ->
            Spacer(modifier = Modifier.size(15.dp))
            OutlinedTextField(
                value = "",
                onValueChange = { },
                placeholder = { Text(text = cote) },
            )
        }
Spacer(modifier = Modifier.size(20.dp))
        Button(onClick = {  goTo(MetrixScreen.Result) },
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Calculer",
                style = MaterialTheme.typography.titleLarge,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormePreview() {
    MetrixTheme {
        Forme()
    }
}