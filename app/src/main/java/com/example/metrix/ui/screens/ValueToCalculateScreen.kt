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
import com.example.metrix.ui.theme.MetrixTheme

@Composable
fun ValueToCalculateScreen(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = stringResource(R.string.value_screen),
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(325.dp)
        )
        Spacer(modifier = Modifier.size(30.dp))
        Button(onClick = {  }) {
            Text(
                text = stringResource(R.string.primtre),
                style = MaterialTheme.typography.displaySmall,
            )
        }
        Spacer(modifier = Modifier.size(30.dp))
        Button(onClick = {  }) {
            Text(
                text = stringResource(R.string.aire),
                style = MaterialTheme.typography.displaySmall,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ValueToCalculateScreenPreview() {
    MetrixTheme {
        ValueToCalculateScreen()
    }
}