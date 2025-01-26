package com.example.calculatorapp.ui.theme.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculatorapp.ui.theme.CalculatorAppTheme

@Composable
fun HomeScreen() {

}


@Preview
@Composable
fun HomeScreenPreview() {
    CalculatorAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            HomeScreen()
        }
    }
}