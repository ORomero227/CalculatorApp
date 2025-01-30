package com.example.calculatorapp.data

import androidx.compose.ui.Modifier
import com.example.calculatorapp.model.Functionality
import com.example.calculatorapp.model.KeypadButton

object KeypadButtons {
    val buttons: List<List<KeypadButton>> = listOf(
        listOf(
            KeypadButton(label = "C", functionality = Functionality.UTILITY, weight = 3F),
            KeypadButton(label = "÷", functionality = Functionality.OPERATION)
        ),
        listOf(
            KeypadButton(label = "7", functionality = Functionality.NUMBER),
            KeypadButton(label = "8", functionality = Functionality.NUMBER),
            KeypadButton(label = "9", functionality = Functionality.NUMBER),
            KeypadButton(label = "x", functionality = Functionality.OPERATION)
        ),
        listOf(
            KeypadButton(label = "4", functionality = Functionality.NUMBER),
            KeypadButton(label = "5", functionality = Functionality.NUMBER),
            KeypadButton(label = "6", functionality = Functionality.NUMBER),
            KeypadButton(label = "+", functionality = Functionality.OPERATION)
        ),
        listOf(
            KeypadButton(label = "1", functionality = Functionality.NUMBER),
            KeypadButton(label = "2", functionality = Functionality.NUMBER),
            KeypadButton(label = "3", functionality = Functionality.NUMBER),
            KeypadButton(label = "-", functionality = Functionality.OPERATION)
        ),
        listOf(
            KeypadButton(label = "0", functionality = Functionality.NUMBER, weight = 2f),
            KeypadButton(label = "<-", functionality = Functionality.NUMBER),
            KeypadButton(label = "=", functionality = Functionality.OPERATION)
        )
    )
}