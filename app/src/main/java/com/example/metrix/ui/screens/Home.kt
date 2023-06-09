package com.example.metrix.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.metrix.R
import com.example.metrix.ui.navigation.MetrixScreen
import com.example.metrix.ui.theme.MetrixTheme


@Composable
fun Home(
    modifier: Modifier = Modifier,
    navController: NavController = NavController(LocalContext.current),
) {
    fun goTo(destination: MetrixScreen) = navController.navigate(destination.name)
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Image(
            painter = painterResource(id = R.drawable.measuring),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = stringResource(id = R.string.app_name),
            style = MaterialTheme.typography.displayLarge,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = stringResource(R.string.Home_label),
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(325.dp)
        )
        Button(onClick = { goTo(MetrixScreen.Formes)  },
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier.fillMaxWidth()
            ) {
            Text(
                text = stringResource(R.string.commencer),
                style = MaterialTheme.typography.displaySmall,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    MetrixTheme {
        Home()
    }
}