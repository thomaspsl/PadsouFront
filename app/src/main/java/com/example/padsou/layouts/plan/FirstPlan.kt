package com.example.padsou.layouts.plan

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.padsou.R
import com.example.padsou.ui.theme.CaptionInterMedium15
import com.example.padsou.ui.theme.TitleIntegralBold27

@Composable
fun FirstPlan(){
    Row() {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(bottomStart = 35.dp, bottomEnd = 35.dp))
                .height(250.dp)
                .fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.tacos),
                contentDescription = "tacos",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .drawWithCache {
                        val gradient = Brush.horizontalGradient(
                            colors = listOf(Color.Transparent, Color.DarkGray),
                            startX = size.width,
                            endX = 0.0F,
                        )
                        onDrawWithContent {
                            drawContent()
                            drawRect(
                                gradient,
                                blendMode = BlendMode.Multiply
                            )
                        }
                    }
            )
            Column(
                modifier = Modifier
                    .padding(start = 50.dp, end = 50.dp)
            ) {
                Text(
                    text = "Abonnement 1 an",
                    color = Color.White,
                    style = TitleIntegralBold27,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    text = "2 mois offerts",
                    color = Color.White,
                    style = CaptionInterMedium15,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }
    }
}