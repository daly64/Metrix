package com.example.metrix.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.metrix.R
import com.example.metrix.data.enums.FormeName
import com.example.metrix.ui.theme.MetrixTheme

@Composable
fun Formes(modifier: Modifier = Modifier) {

    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = stringResource(R.string.selectionner_une_fugure),
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(325.dp)
        )

        FormeName.values().forEach {
            Spacer(modifier = Modifier.size(20.dp))
            Button(onClick = {  }) {
                Text(
                    text = "    $it  ",
                    style = MaterialTheme.typography.titleLarge,
                )
            }
        }





    }
}

@Preview(showBackground = true)
@Composable
fun FormesPreview() {
    MetrixTheme {
        Formes()
    }
}