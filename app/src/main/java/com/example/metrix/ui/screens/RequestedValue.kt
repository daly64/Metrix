package com.example.metrix.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
import com.example.metrix.ui.theme.MetrixTheme

@Composable
fun RequestedValue(
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
            text = stringResource(R.string.value_screen),
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(325.dp)
        )
        Spacer(modifier = Modifier.size(30.dp))
        Button(
            onClick = { goTo(MetrixScreen.MesureUnite) },
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.primtre),
                style = MaterialTheme.typography.displaySmall,
            )
        }
        Spacer(modifier = Modifier.size(30.dp))
        Button(
            onClick = { goTo(MetrixScreen.MesureUnite) },
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.aire),
                style = MaterialTheme.typography.displaySmall,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RequestedValuePreview() {
    MetrixTheme {
        RequestedValue()
    }
}