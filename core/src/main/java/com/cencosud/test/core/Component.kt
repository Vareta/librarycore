package com.cencosud.test.core

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TestButton(modifier: Modifier) {
    Text(modifier = modifier, text = CoreSingleton.buttonText, color = Color.Blue)
}

@Preview
@Composable
fun TestButtonPreview() {
    TestButton(modifier = Modifier)
}