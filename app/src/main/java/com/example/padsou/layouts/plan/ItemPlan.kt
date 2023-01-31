package com.example.padsou.layouts.plan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.components.ShortStars
import com.example.padsou.ui.theme.*

@Composable
fun ItemPlan() {
    // Variables

    // Content
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 26.dp, top = 25.dp, end = 26.dp, bottom = 35.dp)
    ) {
        Box(
            modifier = Modifier
                .height(175.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(15.dp))
                .background(PadsouWhite)
        ){
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {
                    Column() {
                        Icon(
                            Icons.Rounded.AccountCircle,
                            tint = PadsouPurple,
                            contentDescription = "",
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 15.dp, end = 20.dp)
                    ) {
                        Row() {
                            Text(
                                text = ItemPlanLabelPropose,
                                color = PadsouLightGrey,
                                style = LabelInterMedium10
                            )
                        }
                        Row() {
                            Text(
                                text = "Killian74",
                                color = PadsouDark,
                                style = LabelInterMedium10
                            )
                        }
                    }
                    Column() {
                        ShortStars(number = 3)
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = ItemPlanContentCom,
                        color = PadsouDark,
                        style = ComInterMedium14,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
        }

        Text(
            text = "testÉe PAR x GALÉRIENS",
            color = PadsouDark,
            style = LabelIntegralExtraBold14,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        )
    }
}