package com.tallbreadstick.jpc_calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.tallbreadstick.jpc_calculator.components.CalculatorUI

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
    var expression by remember {
        mutableStateOf("")
    }
    CalculatorUI(
        expression = expression,
        onExpressionChange = { newExpression ->
            expression = newExpression
        }
    )
}