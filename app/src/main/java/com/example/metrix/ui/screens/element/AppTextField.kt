package com.example.metrix.ui.screens.element

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.metrix.ui.theme.MetrixTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTextField(
    value: String = "",
    onValueChange: (String) -> Unit = {},
    placeholder: @Composable (() -> Unit) = {},
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = placeholder,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Decimal,
            imeAction = ImeAction.Next
        ),
    )
}

@Preview(showBackground = true)
@Composable
fun AppTextFieldPreview() {
    MetrixTheme {
        AppTextField()
    }
}