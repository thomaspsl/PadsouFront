package com.example.padsou.layouts.addPlan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.*

@Composable
fun FirstAddPlan(){
    // Variables

    // Content
    Row(
        modifier = Modifier
            .padding(horizontal = 35.dp)
            .padding(top = 60.dp)
    ) {
        Column() {
            Text(
                text = FirstAddPlanTitle,
                color = PadsouWhite,
                style = TitleIntegralBold27,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = FirstAddPlanSubTitle,
                color = PadsouWhite,
                style = CaptionInterMedium15,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 40.dp, end = 80.dp)
            )
        }
    }
}
