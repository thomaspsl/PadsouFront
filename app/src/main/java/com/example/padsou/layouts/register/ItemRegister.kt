package com.example.padsou.layouts.register

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.ui.components.ShortButton
import com.example.padsou.ui.components.ShortTextField
import com.example.padsou.ui.components.ShortTextFieldPassword
import com.example.padsou.ui.theme.*

@Composable
fun ItemRegister(navComposable: NavController){
    // Variables
    val mail by remember { mutableStateOf("") }
    val password by remember { mutableStateOf("") }
    val passwordConfirmed by remember { mutableStateOf("") }

    // Content
    Row() {
        Column(
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            FirstRegister()
            ShortTextField(
                placeholder = ItemRegisterPlaceholderMail,
                value = mail,
            )
            ShortTextFieldPassword(
                placeholder = ItemRegisterPlaceholderPassword,
                value = password
            )
            ShortTextFieldPassword(
                placeholder = ItemRegisterPlaceholderPasswordC,
                value = passwordConfirmed
            )
            Text(
                text = ItemRegisterCaption,
                color = PadsouGrey,
                style = CaptionIntegralBold12,
                modifier = Modifier
                    .padding(top = 35.dp, bottom = 15.dp)
            )
            ShortButton(
                textButton = ItemRegisterButton,
                color = PadsouPurple,
                routeDirection = { navComposable.navigate("home") }
            )
        }
    }
}