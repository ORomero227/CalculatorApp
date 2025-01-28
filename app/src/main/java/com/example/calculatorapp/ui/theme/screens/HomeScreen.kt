package com.example.calculatorapp.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorapp.model.Functionality
import com.example.calculatorapp.model.KeypadButton
import com.example.calculatorapp.model.KeypadButtons
import com.example.calculatorapp.ui.theme.CalculatorAppTheme


@Composable
fun HomeScreen() {
    val rowModifiers = Modifier.fillMaxWidth()
    val rowHorizontalSpace = Arrangement.spacedBy(10.dp)
    val currentCalculation by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .statusBarsPadding()
            .safeDrawingPadding()
            .padding(10.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Box(
            modifier = Modifier.fillMaxWidth().weight(1f),
            contentAlignment = Alignment.BottomEnd,
        ) {
            Text(text = "0", fontSize = 40.sp)
            Text(text = currentCalculation, fontSize = 85.sp)
        }
        Spacer(Modifier.padding(20.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
        ) {
            Row(modifier = rowModifiers, horizontalArrangement = rowHorizontalSpace) {
                KeypadButton(
                    button = KeypadButtons.clearButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.plusMinusButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.percentageButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.divideButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
            }
            Spacer(Modifier.padding(10.dp))
            Row(modifier = rowModifiers, horizontalArrangement = rowHorizontalSpace) {
                KeypadButton(
                    button = KeypadButtons.sevenButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.eightButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.nineButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.multiplyButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
            }
            Spacer(Modifier.padding(10.dp))
            Row(modifier = rowModifiers, horizontalArrangement = rowHorizontalSpace) {
                KeypadButton(
                    button = KeypadButtons.fourButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.fiveButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.sixButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.subtractButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
            }
            Spacer(Modifier.padding(10.dp))
            Row(modifier = rowModifiers, horizontalArrangement = rowHorizontalSpace) {
                KeypadButton(
                    button = KeypadButtons.oneButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.twoButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.threeButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.addButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
            }
            Spacer(Modifier.padding(10.dp))
            Row(modifier = rowModifiers, horizontalArrangement = rowHorizontalSpace) {
                KeypadButton(
                    button = KeypadButtons.zeroButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(2f)
                )
                KeypadButton(
                    button = KeypadButtons.dotButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
                KeypadButton(
                    button = KeypadButtons.equalButton,
                    onClick = { },
                    modifier = Modifier.size(80.dp).weight(1f)
                )
            }
        }
    }
}


@Composable
fun KeypadButton(button: KeypadButton, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val containerColor = when(button.functionality) {
        Functionality.NUMBER -> colorScheme.onSecondary
        Functionality.UTILITY -> colorScheme.secondary
        else -> colorScheme.primary
    }

    Button(
        onClick = onClick,
        shape = RoundedCornerShape(30),
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor =
            if (button.functionality == Functionality.OPERATION) {
                Color.White
            } else {
                colorScheme.onSurface
            }
        ),
        modifier = modifier
    ) {
        Text(
            text = button.label,
            style = typography.headlineSmall,
        )
    }
}

@Preview(name = "LightTheme")
@Composable
fun HomeScreenLightThemePreview() {
    CalculatorAppTheme(darkTheme = true) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = colorScheme.surface
        ) {
            HomeScreen()
        }
    }
}


