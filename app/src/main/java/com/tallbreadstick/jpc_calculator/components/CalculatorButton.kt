package com.tallbreadstick.jpc_calculator.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    text: String,
    modifier: Modifier = Modifier,
    textSize: TextUnit = 24.sp
) {
    Button(
        onClick = { /*TODO*/ },
        modifier = modifier,
        contentPadding = PaddingValues(0.dp)
    ) {
        Text(
            text = text,
            fontSize = textSize
        )
    }
}