package com.example.calculatorapp.model

enum class Functionality {
    NUMBER, OPERATION, UTILITY
}

data class KeypadButton(
    val label: String,
    val functionality: Functionality,
    val weight: Float = 1F
)