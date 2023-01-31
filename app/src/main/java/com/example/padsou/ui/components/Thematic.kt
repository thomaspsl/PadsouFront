package com.example.padsou.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImagePainter
import com.example.padsou.ui.theme.LabelIntegralExtraBold11
import com.example.padsou.ui.theme.PadsouWhite

@Composable
fun ShortThematicCard(color: Color, icon: AsyncImagePainter, text: String){
    // Variables

    // Content
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(63.dp)
            .height(63.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color)
    ){
        Image(
            icon,
            contentDescription = "",
            modifier = Modifier.size(24.dp)
        )
    }
    Text(
        text = text,
        color = color,
        textAlign = TextAlign.Center,
        style = LabelIntegralExtraBold11,
        modifier = Modifier
            .padding(top = 5.dp)
    )
}