package com.example.simple_calculator

class Calculator {

    fun add(a: Double, b: Double): Double = a + b

    fun subtract(a: Double, b: Double): Double = a - b

    fun multiply(a: Double, b: Double): Double = a * b

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) throw IllegalArgumentException("Divider cannot be zero")
        return a / b
    }
}
