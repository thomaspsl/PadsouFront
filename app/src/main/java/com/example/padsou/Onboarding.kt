package com.example.padsou

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import com.example.padsou.ui.theme.*

class Onboarding : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PadsouTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    MainOnboarding()
                }
            }
        }
    }
}

@Preview
@Composable
fun MainOnboarding() {
    Column(
        modifier = Modifier
            .background(PadsouPurple)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 60.dp, top = 80.dp, end = 60.dp, bottom = 60.dp)
        ) {
            Row() {
                Column() {
                    Text(
                        text = "PAS DE SOUS ?",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = TitleIntegralBold29,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Text(
                        text = "Y’A PADSOU.",
                        color = PadsouPink,
                        textAlign = TextAlign.Center,
                        style = TitleIntegralBold29,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
            Row() {
                Column() {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(fraction = 1f)
                            .fillMaxHeight(fraction = 0.5f)
                            .clip(shape = RoundedCornerShape(25.dp))
                            .background(Color.White)
                    )
                    Text(
                        text = "Accède aux 500 bons plans qu’on te propose chaque mois",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        style = CaptionInterMedium15,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 22.dp)
                    )
                }
            }
            Row() {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = PadsouPink),
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        "C'EST PARTI !",
                        color = Color.White,
                        style = ButtonIntegralBold15,
                        modifier = Modifier
                            .padding(top = 6.dp, bottom = 6.dp)
                    )
                }
            }
        }
    }
}