package com.example.padsou.layouts.home

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.padsou.data.Category
import com.example.padsou.models.HomeViewModel
import com.example.padsou.ui.components.ShortThematicCard
import com.example.padsou.ui.theme.*

@SuppressLint("Range")
@Composable
@Preview
fun ItemHome(/*navController: NavController*/){
    // Variables
    val scrollState = rememberScrollState()
    val viewModel = viewModel<HomeViewModel>()
    val category: State<List<Category>> = viewModel.category.collectAsState()

    // Content
    Column(
        modifier = Modifier
            .fillMaxWidth()
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
                    .padding(top = 35.dp, bottom = 58.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    for(c in category.value){
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            ShortThematicCard(
                                color = Color(android.graphics.Color.parseColor(c.color)),
                                icon = Icons.Rounded.ShoppingCart,
                                text = c.thematic
                            )
                        }
                    }
                }
                LastHome(/*navController*/)
            }
        }
    }
}