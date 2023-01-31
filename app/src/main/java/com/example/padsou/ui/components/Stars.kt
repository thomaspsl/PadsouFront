package com.example.padsou.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.PadsouWheat
import com.example.padsou.ui.theme.PadsouYellow

@Composable
fun ShortStars(number: Int){
    // Variables

    // Content
    Row() {
        for (i in 1..5) {
            if(i <= number){
                Icon(
                    Icons.Rounded.Star,
                    tint = PadsouYellow,
                    contentDescription = "",
                    modifier = Modifier
                        .size(22.dp)
                )
            } else{
                Icon(
                    Icons.Rounded.Star,
                    tint = PadsouWheat,
                    contentDescription = "",
                    modifier = Modifier
                        .size(22.dp)
                )
            }
        }
    }
}