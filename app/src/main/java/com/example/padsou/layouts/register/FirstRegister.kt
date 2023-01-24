package com.example.padsou.layouts.register

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.*

@Composable
fun FirstRegister(){
    // Variables

    // Content
    Text(
        text = FirstRegisterTitle,
        textAlign = TextAlign.Center,
        color = PadsouDarkPurple,
        style = TitleIntegralBold27,
        modifier = Modifier
            .fillMaxWidth()
    )
    Text(
        text = FirstRegisterSubTitle,
        textAlign = TextAlign.Center,
        color = PadsouDarkPurple,
        style = TitleInterRegular20,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 55.dp)
    )
}