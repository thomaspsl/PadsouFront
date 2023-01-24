package com.example.padsou.layouts.onBoarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.padsou.R
import com.example.padsou.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ItemOnBoarding(padding: Dp){
    // Variables
    val pagerState = rememberPagerState()

    // Content
    Row() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            HorizontalPagerIndicator(
                pagerState = pagerState,
                activeColor = PadsouWhite,
                inactiveColor = PadsouLightGrey,
                indicatorWidth = 25.dp,
                indicatorHeight = 5.dp,
                spacing = 10.dp,
                modifier = Modifier
                    .padding(bottom = 22.dp)
            )
            HorizontalPager(
                count = 3,
                state = pagerState
            ) { page ->
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .width(250.dp)
                        .height(250.dp)
                        .clip(shape = RoundedCornerShape(25.dp))
                        .background(PadsouWhite)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.menus),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp)
                    )
                }
            }
            Text(
                text = ItemOnBoardingCaption,
                color = PadsouWhite,
                textAlign = TextAlign.Center,
                style = CaptionInterMedium15,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = padding)
                    .padding(top = 22.dp)
            )
        }
    }
}