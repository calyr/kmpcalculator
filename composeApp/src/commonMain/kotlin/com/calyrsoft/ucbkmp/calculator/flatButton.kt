package com.calyrsoft.ucbkmp.calculator

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun extraButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: (String) -> Unit
) {
    flatButton(
        modifier = modifier,
        text = text,
        backgroundColor = MaterialTheme.colors.primaryVariant,
        onClick = onClick
    )

}

@Composable
fun digitButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: (String) -> Unit
) {
    flatButton(
        modifier = modifier,
        text = text,
        backgroundColor = MaterialTheme.colors.primary,
        onClick = onClick
    )

}


@Composable
fun operatorButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: (String) -> Unit
) {
    flatButton(
        modifier = modifier,
        text = text,
        backgroundColor = MaterialTheme.colors.secondary,
        onClick = onClick
    )
}

@Composable
fun flatButton(
    modifier: Modifier = Modifier,
    text: String,
    backgroundColor: Color,
    contentColor: Color = Color.White,
    onClick: (String) -> Unit
){
    Button(
        modifier = modifier
            .heightIn( min = 80.dp)
            .padding(1.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        onClick = {
            onClick(text)
        }
    ){
        Text(
            text = text,
            style = TextStyle(fontSize = 20.sp)
        )
    }

}