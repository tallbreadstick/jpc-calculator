package com.tallbreadstick.jpc_calculator.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tallbreadstick.jpc_calculator.ui.theme.White

@Composable
fun ExpressionPanel(
    expression: String
) {
    Text(
        text = expression,
        style = TextStyle(fontSize = 24.sp),
        textAlign = TextAlign.End,
        modifier = Modifier
            .fillMaxWidth()
            .background(White)
            .padding(16.dp)
    )
}