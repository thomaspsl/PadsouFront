package com.example.padsou.layouts.register

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.padsou.models.AuthViewModel
import com.example.padsou.ui.components.ShortButton
import com.example.padsou.ui.components.ShortTextField
import com.example.padsou.ui.components.ShortTextFieldPassword
import com.example.padsou.ui.theme.*

@Composable
fun ItemRegister(navComposable: NavController){
    // Variables
    var mail by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordConfirmed by remember { mutableStateOf("") }
    val authViewModel = viewModel<AuthViewModel>()

    // Content
    Row() {
        Column(
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            FirstRegister()
            ShortTextField(
                placeholder = ItemRegisterPlaceholderMail,
                onValueChanged  = { it ->
                    mail = it
                }
            )
            ShortTextFieldPassword(
                placeholder = ItemRegisterPlaceholderPassword,
                onValueChanged  = { it ->
                    password = it
                }
            )
            ShortTextFieldPassword(
                placeholder = ItemRegisterPlaceholderPasswordC,
                onValueChanged  = { it ->
                    passwordConfirmed = it
                }
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
                routeDirection = {
                    if(password == passwordConfirmed){
                        authViewModel.register(mail,password, navComposable)
                    }else{
                        navComposable.navigate("register")
                    }}
            )
        }
    }
}