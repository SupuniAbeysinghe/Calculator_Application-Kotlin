package com.example.simple_calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {
    private val calculator = Calculator()

    private val _result = MutableLiveData<Double>()
    val result: LiveData<Double>
        get() = _result

    fun add(a: Double, b: Double) {
        _result.value = calculator.add(a, b)
    }

    fun subtract(a: Double, b: Double) {
        _result.value = calculator.subtract(a, b)
    }

    fun multiply(a: Double, b: Double) {
        _result.value = calculator.multiply(a, b)
    }

    fun divide(a: Double, b: Double) {
        _result.value = calculator.divide(a, b)
    }
}
