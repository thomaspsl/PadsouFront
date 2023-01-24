package com.example.padsou.layouts.AddPlan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.PadsouPink
import com.example.padsou.ui.theme.TitleIntegralBold29

class FirstOnBoarding(){
    Row() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 60.dp, top = 80.dp, end = 60.dp)
        ) {
            Text(
                text = "Pas de sous ?",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TitleIntegralBold29,
            )
            Text(
                text = "Y'a padsou.",
                color = PadsouPink,
                textAlign = TextAlign.Center,
                style = TitleIntegralBold29,
            )
        }
    }
}

