package com.example.padsou.layouts.home

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.padsou.data.Category
import com.example.padsou.data.Tips
import com.example.padsou.extensions.HexToJetpackColor
import com.example.padsou.models.HomeViewModel
import com.example.padsou.ui.components.ShortThematicCard
import com.example.padsou.ui.theme.*

@Composable
fun ItemHome(navController: NavController){
    // Variables
    val scrollState = rememberScrollState()
    val viewModel = viewModel<HomeViewModel>()
    val category: State<List<Category>> = viewModel.category.collectAsState()
    
    // Content
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(top = 35.dp)
    ) {
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
                .fillMaxHeight()
                .background(PadsouWheat)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 25.dp)
                    .padding(top = 35.dp, bottom = 90.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(scrollState)
                ) {
                    for(c in category.value){
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(end = 15.dp)
                        ) {
                            ShortThematicCard(
                                color = HexToJetpackColor.getColor(c.color),
                                icon = Icons.Rounded.ShoppingCart,
                                text = c.thematic
                            )
                        }
                    }
                    // Loop
                    /*Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(end = 15.dp)
                    ) {
                        ShortThematicCard(
                            color = PadsouPurple,
                            icon = Icons.Rounded.ShoppingCart,
                            text = "Courses"
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(end = 15.dp)
                    ) {
                        ShortThematicCard(
                            color = PadsouSalmon,
                            icon = Icons.Rounded.Person,
                            text = "Sports"
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(end = 15.dp)
                    ) {
                        ShortThematicCard(
                            color = PadsouBlue,
                            icon = Icons.Rounded.Notifications,
                            text = "Trains"
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(end = 15.dp)
                    ) {
                        ShortThematicCard(
                            color = PadsouBlue,
                            icon = Icons.Rounded.Notifications,
                            text = "Trains"
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        ShortThematicCard(
                            color = PadsouLightPurple,
                            icon = Icons.Rounded.Star,
                            text = "Soirées"
                        )
                    } */
                }
                LastHome(navController)
            }
        }
    }
}