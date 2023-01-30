package com.example.padsou.layouts.profile

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.*

@Preview
@Composable
fun FirstProfile(){
    // Variables

    // Content
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 35.dp)
            .padding(top = 60.dp, bottom = 40.dp)
    ) {
        Row() {
            Column() {
                Text(
                    text = FirstProfileTitle,
                    color = PadsouWhite,
                    style = TitleIntegralBold27,
                )
                Text(
                    text = FirstProfileSubTitle,
                    color = PadsouWhite,
                    style = CaptionInterMedium15,
                    modifier = Modifier
                        .width(260.dp)
                )
            }
        }
        Row() {
            Icon(
                Icons.Rounded.AddCircle,
                tint = PadsouWhite,
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
                )
        }
    }
}
