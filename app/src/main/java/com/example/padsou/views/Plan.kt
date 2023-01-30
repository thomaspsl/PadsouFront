package com.example.padsou.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.padsou.layouts.plan.LastPlan
import com.example.padsou.ui.theme.*
import com.google.accompanist.systemuicontroller.SystemUiController

@Composable
fun MainPlan(systemController: SystemUiController, NavComposable: NavController) {
    // Variables

    // Content
    Column(
        modifier = Modifier
            .background(PadsouWheat)
            .fillMaxSize()
    ){

        Row(
            modifier = Modifier
                .padding(start = 26.dp, top = 25.dp, end = 26.dp, bottom = 35.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(275.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(35.dp))
                    .background(Color.White)
            ){

            }
            Text(
                text = "testÉe PAR 32 GALÉRIENS",
                color = PadsouDark,
                style = LabelIntegralExtraBold14,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            )
        }
        LastPlan()
    }
}