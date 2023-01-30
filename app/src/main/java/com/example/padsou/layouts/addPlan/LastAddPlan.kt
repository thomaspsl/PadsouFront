package com.example.padsou.layouts.addPlan

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.padsou.layouts.addPlan.template.DescriptionAddPlan
import com.example.padsou.layouts.addPlan.template.PictureAddPlan
import com.example.padsou.ui.theme.PadsouLightGrey
import com.example.padsou.ui.theme.PadsouPurple
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun LastAddPlan(){
    // Variables
    val pagerState = rememberPagerState()
    var stat by remember { mutableStateOf(false) }

    // Content
    HorizontalPagerIndicator(
        pagerState = pagerState,
        activeColor = PadsouPurple,
        inactiveColor = PadsouLightGrey,
        indicatorWidth = 50.dp,
        indicatorHeight = 8.dp,
        spacing = 10.dp,
        modifier = Modifier
            .padding(top = 5.dp),
    )
    HorizontalPager(
        itemSpacing = 25.dp,
        count = 2,
        state = pagerState,
        userScrollEnabled = stat
    ) { page ->
        stat = currentPage != 0
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            when (page) {
                0 -> { DescriptionAddPlan(pagerState) }
                1 -> { PictureAddPlan() }
            }
        }
    }
}