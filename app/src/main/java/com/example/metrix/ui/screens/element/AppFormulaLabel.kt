package com.example.metrix.ui.screens.element

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.metrix.ui.theme.MetrixTheme

@Composable
fun AppFormulaLabel(formula:String) {
    Text(
        text = formula,
        style = MaterialTheme.typography.headlineMedium,
    )
}

@Preview(showBackground = true)
@Composable
fun AppFormulaLabelPreview() {
    MetrixTheme {
        AppFormulaLabel("a+b=c")
    }
}