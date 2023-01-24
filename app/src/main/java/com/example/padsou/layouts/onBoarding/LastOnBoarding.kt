package com.example.padsou.layouts.onBoarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.ui.components.ShortButton
import com.example.padsou.ui.theme.LastOnBoardingButton
import com.example.padsou.ui.theme.PadsouPink

@Composable
fun LastOnBoarding(padding: Dp, navComposable: NavController){
    // Variables

    // Content
    Row() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(horizontal = padding)
                .padding(bottom = 60.dp)
        ) {
            ShortButton(
                textButton = LastOnBoardingButton,
                color = PadsouPink
            ) { navComposable.navigate("register") }
        }
    }
}