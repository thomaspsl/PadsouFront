package com.example.padsou.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.example.padsou.data.Category
import com.example.padsou.data.Tips
import com.example.padsou.layouts.plan.LastPlan
import com.example.padsou.models.HomeViewModel
import com.example.padsou.ui.components.ShortThematicCard
import com.example.padsou.ui.theme.*
import com.google.accompanist.systemuicontroller.SystemUiController

@Composable
fun MainPlan(idPlan:String="",systemController: SystemUiController, NavComposable: NavController) {
    // Variables
    val viewModel = viewModel<HomeViewModel>()
    val tips: State<List<Tips>> = viewModel.tips.collectAsState()
    var uriLo by remember {
        mutableStateOf("")
    }
    // Content
    Column(
        modifier = Modifier
            .background(PadsouWheat)
            .fillMaxSize()
    ){
        Row(
            modifier = Modifier
                .padding(start = 26.dp, top = 25.dp, end = 26.dp, bottom = 35.dp)
        ) {


            for(t in tips.value){
                if(idPlan == t.id){
                    Text(text = t.titre)
                }

            }
            /*Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(275.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(35.dp))
                    .background(Color.White)

            ){

            }*/


            viewModel.getPicturesOfTipsWithNames("tacos.jpeg") { uri ->
                uriLo = uri
            }
            Text(
                text = "testÉe PAR 32 GALÉRIENS",
                color = PadsouDark,
                style = LabelIntegralExtraBold14,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            )
        }
        LastPlan()
    }
}