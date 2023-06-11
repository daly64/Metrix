package com.example.metrix.ui.screens.element

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.metrix.data.enums.FormeName
import com.example.metrix.data.models.FormeModel
import com.example.metrix.data.models.setCote
import com.example.metrix.ui.theme.MetrixTheme

@Composable
fun AppCotesInput(
    requestedCotes: Array<String>,
    forme: FormeModel = FormeModel(FormeName.Triangle),
    onImeDone: () -> Unit = {},

    ) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        requestedCotes.forEachIndexed { index, cote ->
            var input by rememberSaveable { mutableStateOf("") }
            Spacer(modifier = Modifier.size(15.dp))

            AppTextField(
                cote = cote,
                value = input,
                onValueChange = {
                    input = if (it == "") "0" else it
                    forme.setCote(cote, if (it == "") 0.0 else it.toDouble())
                },
                imeAction = if (index == requestedCotes.lastIndex)
                    ImeAction.Done.apply {
                        onImeDone()
                    }
                else ImeAction.Next
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppCotesInputPreview() {
    MetrixTheme {
        AppCotesInput(arrayOf("a", "b", "c"))
    }
}