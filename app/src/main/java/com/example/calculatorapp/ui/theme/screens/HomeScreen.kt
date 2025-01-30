package com.example.calculatorapp.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorapp.data.KeypadButtons
import com.example.calculatorapp.logic.calculateOperation
import com.example.calculatorapp.model.Functionality
import com.example.calculatorapp.model.KeypadButton
import com.example.calculatorapp.ui.theme.CalculatorAppTheme

@Composable
fun HomeScreen() {
    var operation by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    val removeLastOperand: () -> Unit = {
        operation = operation.dropLast(1)
    }

    val clearOperation: () -> Unit = {
        operation = ""
        result = ""
    }

    val addOperand: (operand: String) -> Unit = { operand -> operation += operand }

    val calculateOperation: () -> Unit = {
        result = calculateOperation(operation).toString()
        operation = ""
    }

    Column(
        modifier = Modifier.statusBarsPadding().safeDrawingPadding().padding(10.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        // Operation and Result Screen
        Box(
            modifier = Modifier.fillMaxWidth().weight(1f),
            contentAlignment = Alignment.BottomEnd
        ) {
            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) {
                Text(text= operation, fontSize = 40.sp)
                Text(text = result, fontSize = 85.sp)
            }
        }
        // Keypad with all the buttons
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom
        ) {
            for(keypadButtons in KeypadButtons.buttons) {
                KeypadButtonRow(
                    buttons = keypadButtons,
                    clearOperation = clearOperation,
                    addOperand = addOperand,
                    removeLastOperand = removeLastOperand,
                    calculateOperation = calculateOperation,
                    modifier = Modifier.padding(top = 10.dp)
                )
            }
        }
    }
}


@Composable
fun KeypadButtonRow(
    buttons: List<KeypadButton>,
    clearOperation: () -> Unit,
    calculateOperation: () -> Unit,
    removeLastOperand: () -> Unit,
    addOperand: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        for(button in buttons) {
            Button(
                onClick = {
                    when(button.label) {
                        "C" -> { clearOperation() }
                        "=" -> { calculateOperation() }
                        "<-" -> { removeLastOperand() }
                        else -> { addOperand(button.label) }
                    }
                },
                shape = RoundedCornerShape(30),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =
                        when(button.functionality) {
                            Functionality.NUMBER -> colorScheme.onSecondary
                            Functionality.UTILITY -> colorScheme.secondary
                            else -> colorScheme.primary
                        },
                    contentColor =
                        if(button.functionality == Functionality.OPERATION) {
                            Color.White
                        } else {
                            colorScheme.onSurface
                        }
                ),
                modifier = Modifier.size(90.dp).weight(button.weight)
            ) {
                Text(text = button.label, style = typography.headlineSmall)
            }
        }
    }
}


@Preview(name = "LightTheme")
@Composable
fun HomeScreenLightThemePreview() {
    CalculatorAppTheme(darkTheme = true) {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            HomeScreen()
        }
    }
}

