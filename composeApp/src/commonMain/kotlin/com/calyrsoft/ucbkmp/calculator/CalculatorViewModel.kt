package com.calyrsoft.ucbkmp.calculator

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CalculatorViewModel: ViewModel() {

    data class CalculatorState(
        val firstOperand: String = "0",
        val currentOperand: String = "0",
        val operator: String = ""
    )
    private val _state = MutableStateFlow(CalculatorState())

    val state: StateFlow<CalculatorState> = _state.asStateFlow()

    fun onOperatorClicked(button: String) {
        print("Button is $button")
        when(button) {
            "AC" -> {
                _state.update { CalculatorState() }
            }
            "+/-" -> {
                unaryMinus()
            }
            "+","-","/","%", "*" -> {
                _state.update {
                    it.copy(
                        firstOperand = it.currentOperand,
                        operator = button,
                        currentOperand = "0"
                    )
                }
            }
            "."-> {
                addDecimal()
            }
            "="-> {
                calculateResult()
            }
            else -> {
                _state.update {
                    print("ELSE ${it.currentOperand.trimStart('0')}$button")
                    it.copy(
                        currentOperand = "${it.currentOperand.trimStart('0')}$button"
                    )
                }
            }
        }
    }

    private fun calculateResult() {
        val first = _state.value.firstOperand.toDouble()
        val second = _state.value.currentOperand.toDouble()

        _state.update {
            when (it.operator) {
                "/" -> CalculatorState(
                    currentOperand = if (second == 0.0) "0" else (first/second).toString())
                "*" -> CalculatorState(
                    currentOperand = (first * second).toString())
                "+" -> CalculatorState( currentOperand = (first+second).toString())
                "-" -> CalculatorState( currentOperand = (first-second).toString())
                "%" -> CalculatorState( currentOperand = (first%second).toString())
                else -> it
            }
        }
    }

    private fun addDecimal() {
        _state.update {
            it.copy(
                currentOperand = "${it.currentOperand.trimEnd('.')}."
            )
        }
    }

    private fun unaryMinus() {
        val value = state.value.currentOperand.toDoubleOrNull()?:0.0
        if (value != 0.0) {
            _state.update {
                it.copy(currentOperand = value.unaryMinus().toString())
            }
        }
    }

}
