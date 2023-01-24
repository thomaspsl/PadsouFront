package com.example.padsou.layouts.onBoarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.*

@Composable
fun FirstOnBoarding(padding: Dp){
    // Variables

    // Content
    Row() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = padding)
                .padding(top = 80.dp)
        ) {
            Text(
                text = FirstOnBoardingTitle,
                color = PadsouWhite,
                textAlign = TextAlign.Center,
                style = TitleIntegralBold29
            )
            Text(
                text = FirstOnBoardingSubTitle,
                color = PadsouPink,
                textAlign = TextAlign.Center,
                style = TitleIntegralBold29
            )
        }
    }
}
