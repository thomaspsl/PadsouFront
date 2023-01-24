package com.example.padsou.layouts.register

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.padsou.ui.theme.*

@Composable
fun LastRegister(navComposable: NavController){
    // Variables

    // Content
    Row() {
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = LastRegisterFirstSentence,
                color = PadsouGrey,
                style = CaptionIntegralBold12,
            )
            Text(
                text = LastRegisterSecondSentence,
                color = PadsouPurple,
                style = CaptionIntegralBold12,
                modifier = Modifier
                    .clickable { navComposable.navigate("login") }
            )
        }
    }
}