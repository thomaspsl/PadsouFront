package com.example.padsou.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.CaptionInterMedium15
import com.example.padsou.ui.theme.PadsouLightGrey
import com.example.padsou.ui.theme.PadsouTransparent
import com.example.padsou.ui.theme.PadsouWhite

@Composable
    fun ShortTextField(placeholder: String, value: String, singleLine: Boolean = true){
    // Variables
    var attribute by remember { mutableStateOf(value) }

    // Content
    TextField(
        value = attribute,
        onValueChange = { newText -> attribute = newText },
        singleLine = singleLine,
        shape = RoundedCornerShape(15.dp),
        placeholder = {
            Text(
                text = placeholder,
                color = PadsouLightGrey,
                style = CaptionInterMedium15
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = PadsouWhite,
            focusedIndicatorColor = PadsouTransparent,
            unfocusedIndicatorColor = PadsouTransparent
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 15.dp)
    )
}