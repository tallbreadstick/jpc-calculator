package com.tallbreadstick.jpc_calculator.components

import android.util.Log
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tallbreadstick.jpc_calculator.data.derivePostfix
import com.tallbreadstick.jpc_calculator.data.evaluatePostfix
import com.tallbreadstick.jpc_calculator.data.tokenizeExpression
import java.text.DecimalFormat

@Composable
fun CalculatorButton(
    label: String,
    modifier: Modifier = Modifier,
    textSize: TextUnit = 24.sp,
    expression: String,
    onExpressionChange: (String) -> Unit
) {
    Button(
        onClick = {
            Log.d("JPC-CALCULATOR", "Clicked $label")
            if (expression == "Syntax Error") {
                onExpressionChange("")
                return@Button
            }
            when (label) {
                "C" -> if (expression.isNotEmpty()) onExpressionChange(expression.substring(0, expression.length - 1))
                "AC" -> onExpressionChange("")
                "=" -> {
                    val postfix = derivePostfix(tokenizeExpression(expression))
                    try {
                        val result = evaluatePostfix(postfix)
                        val format = DecimalFormat("0.#")
                        onExpressionChange(format.format(result))
                    } catch (err: Exception) {
                        // Display logcat error
                        onExpressionChange("Syntax Error")
                        Log.d("JPC-CALCULATOR", err.toString())
                    }
                }
                else -> onExpressionChange(expression + label)
            }
        },
        modifier = modifier,
        contentPadding = PaddingValues(0.dp)
    ) {
        Text(
            text = label,
            fontSize = textSize
        )
    }
}