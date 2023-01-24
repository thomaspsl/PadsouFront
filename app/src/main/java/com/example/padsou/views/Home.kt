package com.example.padsou

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.ui.theme.*

@Composable
fun MainHome(/*navComposable: NavController*/) {

    var search by remember {
        mutableStateOf("")
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
                        text = "Coucou toi,",
                        color = Color.White,
                        style = TitleIntegralBold27,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Text(
                        text = "T’es en manque de thunes ?",
                        color = Color.White,
                        style = CaptionInterMedium15,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 40.dp, end = 80.dp)
                    )
                    TextField(
                        value = search,
                        onValueChange = { newText -> search = newText },
                        singleLine = true,
                        placeholder = {
                            Text(
                                "Cherche un bon plan",
                                color = PadsouLightGrey,
                                style = CaptionInterMedium15
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = Color.White,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        leadingIcon = {
                            Icon(
                                Icons.Rounded.Search,
                                tint = PadsouLightGrey,
                                contentDescription = "search",
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            )
                        },
                        shape = RoundedCornerShape(15.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(top = 35.dp)
        ){
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
                    .fillMaxHeight()
                    .background(PadsouWhite)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 26.dp, top = 35.dp, end = 26.dp, bottom = 90.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .width(63.dp)
                                    .height(63.dp)
                                    .clip(shape = RoundedCornerShape(8.dp))
                                    .background(PadsouPurple)
                            ){
                                Icon(
                                    Icons.Rounded.ShoppingCart,
                                    tint = Color.White,
                                    contentDescription = "search"
                                )
                            }
                            Text(
                                text = "Courses",
                                color = PadsouPurple,
                                textAlign = TextAlign.Center,
                                style = LabelIntegralExtraBold11,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .width(63.dp)
                                    .height(63.dp)
                                    .clip(shape = RoundedCornerShape(8.dp))
                                    .background(PadsouSalmon)
                            ){
                                Icon(
                                    Icons.Rounded.Person,
                                    tint = Color.White,
                                    contentDescription = "search"
                                )
                            }
                            Text(
                                text = "Sports",
                                color = PadsouSalmon,
                                textAlign = TextAlign.Center,
                                style = LabelIntegralExtraBold11,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .width(63.dp)
                                    .height(63.dp)
                                    .clip(shape = RoundedCornerShape(8.dp))
                                    .background(PadsouBlue)
                            ){
                                Icon(
                                    Icons.Rounded.Lock,
                                    tint = Color.White,
                                    contentDescription = "search"
                                )
                            }
                            Text(
                                text = "Trains",
                                color = PadsouBlue,
                                textAlign = TextAlign.Center,
                                style = LabelIntegralExtraBold11,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .width(63.dp)
                                    .height(63.dp)
                                    .clip(shape = RoundedCornerShape(8.dp))
                                    .background(PadsouLightPurple)
                            ){
                                Icon(
                                    Icons.Rounded.Star,
                                    tint = Color.White,
                                    contentDescription = "search"
                                )
                            }
                            Text(
                                text = "Soirées",
                                color = PadsouLightPurple,
                                textAlign = TextAlign.Center,
                                style = LabelIntegralExtraBold11,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                            )
                        }
                    }
                    Row() {
                        Column() {
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 40.dp, bottom = 20.dp)
                            ) {
                                Text(
                                    text = "Les plans du moment",
                                    color = PadsouDark,
                                    style = LabelIntegralExtraBold14
                                )
                                Text(
                                    text = "Voir tout",
                                    color = PadsouSalmon,
                                    style = LabelIntegralBold14,
                                    modifier = Modifier
                                        .clickable { /*navComposable.navigate("addPlan")*/ }
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxHeight()
                            ) { }
                        }
                    }
                }
            }
        }
    }
}