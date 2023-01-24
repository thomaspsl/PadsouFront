package com.example.padsou.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.CaptionInterMedium15
import com.example.padsou.ui.theme.PadsouLightGrey
import com.example.padsou.ui.theme.PadsouTransparent
import com.example.padsou.ui.theme.PadsouWhite

@Composable
fun ShortTextFieldPassword(placeholder: String, value: String){
    // Variables
    var password by remember { mutableStateOf(value) }
    var passwordVisible by remember { mutableStateOf(false) }

    // Content
    TextField(
        value = password,
        onValueChange = { newText -> password = newText },
        singleLine = true,
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        shape = RoundedCornerShape(15.dp),
        placeholder = {
            Text(
                text = placeholder,
                color = PadsouLightGrey,
                style = CaptionInterMedium15
            )
        },
        trailingIcon = {
            if (password.isNotEmpty()) {
                Icon(
                    if (passwordVisible) Icons.Rounded.Done else Icons.Rounded.Lock,
                    tint = PadsouLightGrey,
                    contentDescription = "",
                    modifier = Modifier
                        .clickable { passwordVisible = !passwordVisible }
                )
            }
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