package com.example.padsou.layouts.addPlan.template

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.components.ShortButton
import com.example.padsou.ui.components.ShortTextField
import com.example.padsou.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun DescriptionAddPlan(pagerState: PagerState){
    // Variables
    val coroutineScope = rememberCoroutineScope()
    var title by remember { mutableStateOf("") }
    var desc by remember { mutableStateOf("") }
    var link by remember { mutableStateOf("") }

    // Content
    Text(
        text = LastAddPlanLabelTitle,
        color = PadsouDark,
        style = LabelIntegralExtraBold14,
        modifier = Modifier
            .padding(top = 30.dp)
            .fillMaxWidth()
    )
    ShortTextField(
        placeholder = LastAddPlanPlaceholderTitle,
        onValueChanged  = { it ->
            title = it
        }
    )
    Text(
        text = LastAddPlanLabelDesc,
        color = PadsouDark,
        style = LabelIntegralExtraBold14,
        modifier = Modifier
            .fillMaxWidth()
    )
    ShortTextField(
        placeholder = LastAddPlanPlaceholderDesc,
        onValueChanged  = { it ->
            desc = it
        },
        singleLine = false
    )
    Text(
        text = LastAddPlanLabelLien,
        color = PadsouDark,
        style = LabelIntegralExtraBold14,
        modifier = Modifier
            .fillMaxWidth()
    )
    ShortTextField(
        placeholder = LastAddPlanPlaceholderLien,
        onValueChanged  = { it ->
            link = it
        }
    )
    ShortButton(
        textButton = LastAddPlanFirstButton,
        color = PadsouPurple,
        routeDirection = { coroutineScope.launch { pagerState.animateScrollToPage(page = pagerState.currentPage + 1) } }
    )
}