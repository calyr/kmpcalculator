package com.calyrsoft.ucbkmp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.calyrsoft.ucbkmp.calculator.CalculatorUI
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        CalculatorUI()
    }
}