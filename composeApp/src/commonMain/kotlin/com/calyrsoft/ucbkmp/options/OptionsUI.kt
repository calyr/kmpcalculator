package com.calyrsoft.ucbkmp.options

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.calyrsoft.ucbkmp.vectors.Language
import com.calyrsoft.ucbkmp.vectors.Vectors

@Composable
fun OptionsUI() {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Vectors.Language,
                contentDescription = ""
            )
            Text("Language")
        }
        Divider()
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Vectors.Language,
                contentDescription = ""
            )
            Text("Language")
        }
        Divider()
    }
}