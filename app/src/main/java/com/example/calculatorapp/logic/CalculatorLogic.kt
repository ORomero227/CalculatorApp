package com.example.calculatorapp.logic

import kotlin.math.sqrt

fun getNumbersFromOperation(operation: String): List<Int> {
    val regex = Regex(pattern = "\\d+")
    val numbers = regex.findAll(operation).map { it.value.toInt() }.toList()
    return numbers
}

fun getMathOperators(operation: String): List<String> {
    val regex = Regex(pattern = "[%√÷x+-]+")
    val symbols = regex.findAll(operation).map { it.value }.toList()
    return symbols
}

fun applyOperation(a: Int, b: Int, operator: String): Int {
    return when (operator) {
        "+" -> a + b
        "-" -> a - b
        "x" -> a * b
        "÷" -> if (b != 0) a / b else 0
        else -> a
    }
}

fun calculateOperation(operation: String): Int {
    if (operation.isEmpty()) return 0

    val numbers = getNumbersFromOperation(operation).toMutableList()
    val operators = getMathOperators(operation).toMutableList()

    if (numbers.isEmpty() || operators.size >= numbers.size) return 0

    var result = numbers[0]
    for (i in operators.indices) {
        result = applyOperation(result, numbers[i + 1], operators[i])
    }

    return result
}
