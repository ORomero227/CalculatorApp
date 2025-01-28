package com.example.calculatorapp.model

enum class Functionality {
    NUMBER, OPERATION, UTILITY
}

data class KeypadButton(
    val label: String,
    val functionality: Functionality
)

object KeypadButtons {

    // Utility Buttons
    val clearButton = KeypadButton(label = "C", functionality = Functionality.UTILITY)
    val percentageButton = KeypadButton(label = "%", functionality = Functionality.UTILITY)
    val plusMinusButton = KeypadButton(label = "+/-", functionality = Functionality.UTILITY)

    // Number Buttons
    val zeroButton = KeypadButton(label = "0", functionality = Functionality.NUMBER)
    val oneButton = KeypadButton(label = "1", functionality = Functionality.NUMBER)
    val twoButton = KeypadButton(label = "2", functionality = Functionality.NUMBER)
    val threeButton = KeypadButton(label = "3", functionality = Functionality.NUMBER)
    val fourButton = KeypadButton(label = "4", functionality = Functionality.NUMBER)
    val fiveButton = KeypadButton(label = "5", functionality = Functionality.NUMBER)
    val sixButton = KeypadButton(label = "6", functionality = Functionality.NUMBER)
    val sevenButton = KeypadButton(label = "7", functionality = Functionality.NUMBER)
    val eightButton = KeypadButton(label = "8", functionality = Functionality.NUMBER)
    val nineButton = KeypadButton(label = "9", functionality = Functionality.NUMBER)
    val dotButton = KeypadButton(label = ".", functionality = Functionality.NUMBER)

    // Operations Buttons
    val divideButton = KeypadButton(label = "÷", functionality = Functionality.OPERATION)
    val multiplyButton = KeypadButton(label = "x", functionality = Functionality.OPERATION)
    val addButton = KeypadButton(label = "+", functionality = Functionality.OPERATION)
    val subtractButton = KeypadButton(label = "-", functionality = Functionality.OPERATION)
    val equalButton = KeypadButton(label = "=", functionality = Functionality.OPERATION)

}