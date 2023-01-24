package com.example.padsou.layouts.addPlan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.PadsouWheat

@Composable
fun ItemAddPlan(lastAddPlan: @Composable() () -> Unit){
    Column() {
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
                .background(PadsouWheat)
                .fillMaxHeight()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 25.dp)
                    .padding(top = 25.dp, bottom = 80.dp)
            ) {
                lastAddPlan()
            }
        }
    }
}