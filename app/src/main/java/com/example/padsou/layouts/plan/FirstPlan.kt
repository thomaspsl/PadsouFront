package com.example.padsou.layouts.plan

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.padsou.R
import com.example.padsou.models.HomeViewModel
import com.example.padsou.ui.theme.*

@Composable
fun FirstPlan(image: String, title: String, subtitle: String, itemPlan: @Composable() () -> Unit){
    // Variables
    val viewModel = viewModel<HomeViewModel>()
    var uriLo by remember { mutableStateOf("") }
    viewModel.getPicturesOfTipsWithNames(image) { uri ->
        uriLo = uri
    }

    // Content
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(275.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(bottomStart = 35.dp, bottomEnd = 35.dp))
                .background(PadsouWhite)
        ){
            Row() {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ){
                    Image(
                        painter = rememberAsyncImagePainter(uriLo),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .drawWithCache {
                                val gradient = Brush.horizontalGradient(
                                    colors = listOf(PadsouTransparent, PadsouGrey),
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
                            text = title,
                            color = PadsouWhite,
                            style = TitleIntegralBold27,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        Text(
                            text = subtitle,
                            color = PadsouWhite,
                            style = CaptionInterMedium15,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                }
            }
        }
        Row() {
            itemPlan()
        }
    }
}