package com.example.simplecalculator.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.simplecalculator.R
import com.example.simple_calculator.CalculatorViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val calculatorViewModel: CalculatorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculatorViewModel.result.observe(this, Observer {
            resultTextView.text = it.toString()
        })

        addButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDoubleOrNull()
            val number2 = number2EditText.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                calculatorViewModel.add(number1, number2)
            }
        }

        subtractButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDoubleOrNull()
            val number2 = number2EditText.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                calculatorViewModel.subtract(number1, number2)
            }
        }

        multiplyButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDoubleOrNull()
            val number2 = number2EditText.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                calculatorViewModel.multiply(number1, number2)
            }
        }

        divideButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toDoubleOrNull()
            val number2 = number2EditText.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                calculatorViewModel.divide(number1, number2)
            }
        }
    }
}
