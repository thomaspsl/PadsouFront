package com.example.padsou.layouts.addPlan.template

import android.util.Log
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.padsou.models.HomeViewModel
import com.example.padsou.ui.components.ShortButton
import com.example.padsou.ui.theme.*

@Composable
fun PictureAddPlan(title :String = "",desc : String ="",link:String ="",navController: NavController){
    // Variables
    val viewModel = viewModel<HomeViewModel>()
    // Content
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = LastAddPlanLabelPicture,
            color = PadsouDark,
            style = LabelIntegralExtraBold14,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 30.dp, bottom = 30.dp)
                .fillMaxWidth()
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .width(157.dp)
                .height(150.dp)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(PadsouPurple)
        ){
            Icon(
                Icons.Rounded.Add,
                tint = PadsouWhite,
                contentDescription = "",
                modifier = Modifier
                    .size(70.dp)
                    .padding(bottom = 15.dp)
            )
        }
    }
    ShortButton(
        textButton = LastAddPlanSecondButton,
        color = PadsouPurple,
        routeDirection = {
            Log.e("tips",title)
            viewModel.addTips(desc,"img.jpeg",link,title,navController)

        }

    )
}