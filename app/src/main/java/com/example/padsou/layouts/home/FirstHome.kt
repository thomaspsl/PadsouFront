package com.example.padsou.layouts.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.components.ShortSearch
import com.example.padsou.ui.theme.*

@Composable
fun FirstHome(){
    // Variables
    val search by remember { mutableStateOf("") }

    // Content
    Row() {
        Column(
            modifier = Modifier
                .padding(horizontal = 35.dp)
        ) {
            Text(
                text = FirstHomeTitle,
                color = PadsouWhite,
                style = TitleIntegralBold27,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = FirstHomeSubTitle,
                color = PadsouWhite,
                style = CaptionInterMedium15,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 40.dp, end = 80.dp)
            )
            ShortSearch(
                icon = {
                    Icon(
                        Icons.Rounded.Search,
                        tint = PadsouLightGrey,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                },
                placeholder = FirstHomeButton,
                value = search
            )
        }
    }
}