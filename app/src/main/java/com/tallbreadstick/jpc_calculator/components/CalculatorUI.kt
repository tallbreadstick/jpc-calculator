package com.tallbreadstick.jpc_calculator.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tallbreadstick.jpc_calculator.ui.theme.DarkGray

@Composable
fun CalculatorUI(
    expression: String,
    onExpressionChange: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkGray)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ExpressionPanel(expression)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CalculatorButton(
                label = "7",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "8",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "9",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "C",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "AC",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CalculatorButton(
                label = "4",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "5",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "6",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "+",
                modifier = Modifier.weight(1f),
                textSize = 28.sp,
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "-",
                modifier = Modifier.weight(1f),
                textSize = 28.sp,
                expression = expression,
                onExpressionChange = onExpressionChange
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CalculatorButton(
                label = "1",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "2",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "3",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "×",
                modifier = Modifier.weight(1f),
                textSize = 28.sp,
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "÷",
                modifier = Modifier.weight(1f),
                textSize = 28.sp,
                expression = expression,
                onExpressionChange = onExpressionChange
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CalculatorButton(
                label = "(",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "0",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = ")",
                modifier = Modifier.weight(1f),
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = ".",
                modifier = Modifier.weight(1f),
                textSize = 28.sp,
                expression = expression,
                onExpressionChange = onExpressionChange
            )
            CalculatorButton(
                label = "=",
                modifier = Modifier.weight(1f),
                textSize = 28.sp,
                expression = expression,
                onExpressionChange = onExpressionChange
            )
        }
    }
}