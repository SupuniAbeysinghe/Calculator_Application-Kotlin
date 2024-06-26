package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.simple_calculator.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1: EditText = findViewById(R.id.number1)
        val number2: EditText = findViewById(R.id.number2)
        val result: TextView = findViewById(R.id.result)

        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        val buttonSubtract: Button = findViewById(R.id.buttonSubtract)
        val buttonMultiply: Button = findViewById(R.id.buttonMultiply)
        val buttonDivide: Button = findViewById(R.id.buttonDivide)

        buttonAdd.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                result.text = (num1 + num2).toString()
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        buttonSubtract.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                result.text = (num1 - num2).toString()
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        buttonMultiply.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                result.text = (num1 * num2).toString()
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        buttonDivide.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    result.text = (num1 / num2).toString()
                } else {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
