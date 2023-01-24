package com.example.padsou

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.*

@Composable
@Preview
fun MainPlan() {
    Column(
        modifier = Modifier
            .background(PadsouWhite)
            .fillMaxHeight()
            .fillMaxWidth()
    ){
        Column() {
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
        Column(
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

        // Bottom
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 26.dp, top = 25.dp, end = 26.dp, bottom = 35.dp)
        ) {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = PadsouPurple),
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)
            ) {
                Text(
                    "Profiter de l'offre",
                    color = Color.White,
                    style = ButtonIntegralBold15,
                    modifier = Modifier
                        .padding(top = 6.dp, bottom = 6.dp)
                )
            }
        }
    }
}