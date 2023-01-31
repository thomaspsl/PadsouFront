package com.example.padsou.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.padsou.data.Tips
import com.example.padsou.ui.theme.LabelInterBold12
import com.example.padsou.ui.theme.LabelInterMedium10
import com.example.padsou.ui.theme.PadsouDark
import com.example.padsou.ui.theme.PadsouWhite

@Composable
fun ShortPlanCard(navComposable: NavController, p: Tips, uriLo: String){
    // Variables

    // Content
    Box(
        modifier = Modifier
            .height(165.dp)
            .fillMaxWidth()
            .padding(bottom = 10.dp)
            .clip(shape = RoundedCornerShape(15.dp))
            .background(PadsouWhite)
            .clickable { navComposable.navigate("plan/${p.id}") }
    ){
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                rememberAsyncImagePainter(uriLo),
                contentDescription = "",
                alignment = Alignment.TopCenter,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            )
            Column() {
                Row() {
                    Text(
                        text = p.titre,
                        color = PadsouDark,
                        style = LabelInterBold12,
                        modifier = Modifier
                            .padding(horizontal = 15.dp)
                    )
                }
                Row(){
                    Text(
                        text = p.description,
                        color = PadsouDark,
                        style = LabelInterMedium10,
                        modifier = Modifier
                            .padding(horizontal = 15.dp)
                            .padding(bottom = 15.dp)
                    )
                }
            }
        }
    }
}