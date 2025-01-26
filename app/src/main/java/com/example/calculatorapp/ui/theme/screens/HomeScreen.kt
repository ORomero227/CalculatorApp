package com.example.calculatorapp.ui.theme.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculatorapp.ui.theme.CalculatorAppTheme

@Composable
fun HomeScreen() {

}


@Preview(name = "LightTheme")
@Composable
fun HomeScreenLightThemePreview() {
    CalculatorAppTheme() {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            HomeScreen()
        }
    }
}

@Preview(name = "DarkTheme")
@Composable
fun HomeScreenDarkThemePreview() {
    CalculatorAppTheme(darkTheme = true) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            HomeScreen()
        }
    }
}

