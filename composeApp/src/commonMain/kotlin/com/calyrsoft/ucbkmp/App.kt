package com.calyrsoft.ucbkmp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.calyrsoft.ucbkmp.calculator.CalculatorUI
import com.calyrsoft.ucbkmp.options.OptionsUI
import com.ucb.ucbtest.navigation.AppNavigation
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme(
        colors = themeColors()
    ) {
        AppNavigation()
    }
}