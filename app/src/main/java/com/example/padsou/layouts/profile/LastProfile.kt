package com.example.padsou.layouts.profile

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.components.ShortButton
import com.example.padsou.ui.components.ShortTextField
import com.example.padsou.ui.theme.*

@Composable
fun LastProfile(){
    // Variables
    var pseudo by remember { mutableStateOf("") }
    var mail by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    // Content
    Column() {
        Text(
            text = LastProfileLabelPseudo,
            color = PadsouDark,
            style = LabelIntegralExtraBold14,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, bottom = 7.dp)
        )
        ShortTextField(
            placeholder = "jacky74bonplan",
            onValueChanged  = { it ->
                pseudo = it
            }
        )
        Text(
            text = LastProfileLabelMail,
            color = PadsouDark,
            style = LabelIntegralExtraBold14,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, bottom = 7.dp)
        )
        ShortTextField(
            placeholder = "jacky@gmail.com",
            onValueChanged  = { it ->
                mail = it
            },
        )
        Text(
            text = LastProfileLabelPassword,
            color = PadsouDark,
            style = LabelIntegralExtraBold14,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, bottom = 7.dp)
        )
        ShortTextField(
            placeholder = "*******************",
            onValueChanged  = { it ->
                password = it
            }
        )
    }
    Column() {
        ShortButton(
            textButton = LastProfileButton,
            color = PadsouPurple,
            routeDirection = { }
        )
    }
}