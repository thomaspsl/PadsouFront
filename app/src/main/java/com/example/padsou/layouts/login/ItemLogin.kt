package com.example.padsou.layouts.login

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.ui.components.ShortButton
import com.example.padsou.ui.components.ShortTextField
import com.example.padsou.ui.components.ShortTextFieldPassword
import com.example.padsou.ui.theme.*

@Composable
fun ItemLogin(navComposable: NavController){
    // Variables
    val mail by remember { mutableStateOf("") }
    val password by remember { mutableStateOf("") }

    // Content
    Row() {
        Column(
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            FirstLogin()
            ShortTextField(
                placeholder = ItemLoginPlaceholderMail,
                value = mail
            )
            ShortTextFieldPassword(
                placeholder = ItemLoginPlaceholderPassword,
                value = password
            )
            Text(
                text = ItemLoginPasswordForgot,
                color = PadsouGrey,
                textAlign = TextAlign.End,
                style = CaptionIntegralBold12,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 35.dp)
            )
            ShortButton(
                textButton = ItemLoginButton,
                color = PadsouPurple,
                routeDirection = { navComposable.navigate("home") }
            )
        }
    }
}