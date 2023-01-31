package com.example.padsou.layouts.plan

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.components.ShortButton
import com.example.padsou.ui.theme.LastPlanButton
import com.example.padsou.ui.theme.PadsouPurple

@Composable
fun LastPlan(lien: String){
    // Variables
    val uriHandler = LocalUriHandler.current

    // Content
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 25.dp)
            .padding(top = 25.dp, bottom = 35.dp)
    ) {
        ShortButton(
            textButton = LastPlanButton,
            color = PadsouPurple,
            routeDirection = {
                    uriHandler.openUri(lien)
            }
        )
    }
}