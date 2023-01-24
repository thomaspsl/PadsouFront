package com.example.padsou.layouts.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.ui.theme.*

@Composable
fun LastHome(navComposable: NavController){
    Row() {
        Column() {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp, bottom = 20.dp)
            ) {
                Text(
                    text = LastHomeTitle,
                    color = PadsouDark,
                    style = LabelIntegralExtraBold14
                )
                Text(
                    text = LastHomeSubTitle,
                    color = PadsouSalmon,
                    style = LabelIntegralBold14,
                    modifier = Modifier
                        .clickable { navComposable.navigate("addPlan") }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxHeight()
            ) {

            }
        }
    }
}