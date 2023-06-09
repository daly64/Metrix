package com.example.metrix.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.metrix.data.enums.FormeName
import com.example.metrix.data.models.Forme
import com.example.metrix.ui.theme.MetrixTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Forme(modifier: Modifier = Modifier) {
    val forme = Forme(FormeName.Triangle)
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
        Text(
            text = forme.areaFormula,
            style = MaterialTheme.typography.titleLarge,
        )


        forme.cotes.keys.forEach { cote ->
            TextField(
                value = "",
                onValueChange = { },
//                label = { Text(text = cote) },
                placeholder = { Text(text = cote) },
            )
        }

        Button(onClick = {  }) {
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