package com.example.padsou

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainAddPlan(/*navComposable: NavController*/) {
    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()

    var title by remember {
        mutableStateOf("")
    }
    var desc by remember {
        mutableStateOf("")
    }
    var link by remember {
        mutableStateOf("")
    }
    var stat by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .background(PadsouPurple)
    ){
        Column(
            modifier = Modifier
                .padding(start = 35.dp, top = 60.dp, end = 35.dp)
        ) {
            Row() {
                Column() {
                    Text(
                        text = "Ajouter",
                        color = Color.White,
                        style = TitleIntegralBold27,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Text(
                        text = "Un bon plan pour en faire profiter les autres",
                        color = Color.White,
                        style = CaptionInterMedium15,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 40.dp, end = 80.dp)
                    )
                }
            }
        }
        Column() {
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
                    .background(PadsouWhite)
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 26.dp, top = 25.dp, end = 26.dp, bottom = 80.dp)
                ) {
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
                                .fillMaxHeight()
                                .fillMaxWidth()
                        ) {
                            when (page) {
                                0 -> {
                                    Text(
                                        text = "Titre",
                                        color = PadsouDark,
                                        style = LabelIntegralExtraBold14,
                                        modifier = Modifier
                                            .padding(top = 30.dp)
                                            .fillMaxWidth()
                                    )
                                    TextField(
                                        value = title,
                                        onValueChange = { newText -> title = newText },
                                        singleLine = true,
                                        placeholder = {
                                            Text(
                                                "Abonnement 1 an Basic-Fit",
                                                color = PadsouLightGrey,
                                                style = CaptionInterMedium15
                                            )
                                        },
                                        colors = TextFieldDefaults.textFieldColors(
                                            backgroundColor = Color.White,
                                            focusedIndicatorColor = Color.Transparent,
                                            unfocusedIndicatorColor = Color.Transparent
                                        ),
                                        shape = RoundedCornerShape(15.dp),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    )
                                    Text(
                                        text = "Description",
                                        color = PadsouDark,
                                        style = LabelIntegralExtraBold14,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    )
                                    TextField(
                                        value = desc,
                                        onValueChange = { newText -> desc = newText },
                                        placeholder = {
                                            Text(
                                                "Ne soit pas trop bavard, on s’en fou, va à l’essentiel",
                                                color = PadsouLightGrey,
                                                style = CaptionInterMedium15,
                                            )
                                        },
                                        colors = TextFieldDefaults.textFieldColors(
                                            backgroundColor = Color.White,
                                            focusedIndicatorColor = Color.Transparent,
                                            unfocusedIndicatorColor = Color.Transparent
                                        ),
                                        shape = RoundedCornerShape(15.dp),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(100.dp)
                                    )
                                    Text(
                                        text = "Lien",
                                        color = PadsouDark,
                                        style = LabelIntegralExtraBold14,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    )
                                    TextField(
                                        value = link,
                                        onValueChange = { newText -> link = newText },
                                        singleLine = true,
                                        placeholder = {
                                            Text(
                                                "www.lienverstonbonplan.com",
                                                color = PadsouLightGrey,
                                                style = CaptionInterMedium15
                                            )
                                        },
                                        colors = TextFieldDefaults.textFieldColors(
                                            backgroundColor = Color.White,
                                            focusedIndicatorColor = Color.Transparent,
                                            unfocusedIndicatorColor = Color.Transparent
                                        ),
                                        shape = RoundedCornerShape(15.dp),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(bottom = 15.dp)
                                    )
                                    Button(
                                        onClick = {
                                            coroutineScope.launch { pagerState.animateScrollToPage(page = pagerState.currentPage + 1) }},
                                        colors = ButtonDefaults.buttonColors(backgroundColor = PadsouPurple),
                                        shape = RoundedCornerShape(15.dp),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Text(
                                            "Suivant",
                                            color = Color.White,
                                            style = ButtonIntegralBold15,
                                            modifier = Modifier
                                                .padding(top = 6.dp, bottom = 6.dp)
                                        )
                                    }
                                }
                                1 -> {
                                    Text(
                                        text = "Photo du bon plan",
                                        color = PadsouDark,
                                        style = LabelIntegralExtraBold14,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier
                                            .padding(top = 30.dp)
                                            .fillMaxWidth()
                                    )
                                    Box(
                                        contentAlignment = Alignment.Center,
                                        modifier = Modifier
                                            .width(175.dp)
                                            .height(160.dp)
                                            .clip(shape = RoundedCornerShape(8.dp))
                                            .background(PadsouPurple)
                                    ){
                                        Icon(
                                            Icons.Rounded.Add,
                                            tint = Color.White,
                                            contentDescription = "add",
                                            modifier = Modifier
                                                .size(55.dp)
                                        )
                                    }
                                    Button(
                                        onClick = { },
                                        colors = ButtonDefaults.buttonColors(backgroundColor = PadsouPurple),
                                        shape = RoundedCornerShape(15.dp),
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(top = 15.dp)
                                    ) {
                                        Text(
                                            "Ajouter ce bon plan",
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
                }
            }
        }
    }
}