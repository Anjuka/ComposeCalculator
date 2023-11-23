package com.adk.calculator

sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    object Clear: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}