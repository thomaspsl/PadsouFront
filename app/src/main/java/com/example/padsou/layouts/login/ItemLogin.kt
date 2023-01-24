package com.example.padsou.layouts.login

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.padsou.models.AuthViewModel
import com.example.padsou.ui.components.ShortButton
import com.example.padsou.ui.components.ShortTextField
import com.example.padsou.ui.components.ShortTextFieldPassword
import com.example.padsou.ui.theme.*

@Composable
fun ItemLogin(navComposable: NavController){
    // Variables
    var mail by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val authViewModel = viewModel<AuthViewModel>()

    // Content
    Row() {
        Column(
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            FirstLogin()
            ShortTextField(
                placeholder = ItemLoginPlaceholderMail,
                onValueChanged  = { it ->
                    mail = it
                }
            )
            ShortTextFieldPassword(
                placeholder = ItemLoginPlaceholderPassword,
                onValueChanged  = { it ->
                    password = it
                }
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
                routeDirection = {
                    Log.d("mail",mail)
                    authViewModel.login(mail, password, navComposable)
                }
            )
        }
    }
}