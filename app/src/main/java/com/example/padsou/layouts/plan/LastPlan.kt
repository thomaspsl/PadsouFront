package com.example.padsou.layouts.plan

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.components.ShortButton
import com.example.padsou.ui.theme.PadsouPurple

@Composable
fun LastPlan(){
    // Variables

    // Content
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 25.dp)
            .padding(top = 25.dp, bottom = 35.dp)
    ) {
        ShortButton(
            textButton = "Profiter de l'offre",
            color = PadsouPurple,
            routeDirection = { }
        )
    }
}