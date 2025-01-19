package com.tallbreadstick.jpc_calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tallbreadstick.jpc_calculator.components.CalculatorButton
import com.tallbreadstick.jpc_calculator.components.ExpressionPanel
import com.tallbreadstick.jpc_calculator.ui.theme.DarkGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Preview
@Composable
fun MainContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkGray)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ExpressionPanel()
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CalculatorButton("7", Modifier.weight(1f))
            CalculatorButton("8", Modifier.weight(1f))
            CalculatorButton("9", Modifier.weight(1f))
            CalculatorButton("C", Modifier.weight(1f))
            CalculatorButton("AC", Modifier.weight(1f))
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CalculatorButton("4", Modifier.weight(1f))
            CalculatorButton("5", Modifier.weight(1f))
            CalculatorButton("6", Modifier.weight(1f))
            CalculatorButton("+", Modifier.weight(1f), 28.sp)
            CalculatorButton("-", Modifier.weight(1f), 28.sp)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CalculatorButton("1", Modifier.weight(1f))
            CalculatorButton("2", Modifier.weight(1f))
            CalculatorButton("3", Modifier.weight(1f))
            CalculatorButton("×", Modifier.weight(1f), 28.sp)
            CalculatorButton("÷", Modifier.weight(1f), 28.sp)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CalculatorButton("(", Modifier.weight(1f))
            CalculatorButton("0", Modifier.weight(1f))
            CalculatorButton(")", Modifier.weight(1f))
            CalculatorButton(".", Modifier.weight(1f), 28.sp)
            CalculatorButton("=", Modifier.weight(1f), 28.sp)
        }
    }
}