package com.example.padsou.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.padsou.data.Tips
import com.example.padsou.layouts.plan.FirstPlan
import com.example.padsou.layouts.plan.ItemPlan
import com.example.padsou.layouts.plan.LastPlan
import com.example.padsou.models.HomeViewModel
import com.example.padsou.ui.theme.*
import com.google.accompanist.systemuicontroller.SystemUiController

@Composable
fun MainPlan(idPlan: String = "", systemController: SystemUiController, NavComposable: NavController) {
    // Variables
    val viewModel = viewModel<HomeViewModel>()
    val tips: State<List<Tips>> = viewModel.tips.collectAsState()

    // Content
    systemController.setStatusBarColor(color = PadsouGrey, darkIcons = false)
    Column(
        modifier = Modifier
            .background(PadsouWheat)
            .fillMaxSize()
    ){
        for(t in tips.value){
            if(idPlan == t.id){
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween,

                ) {
                    FirstPlan(t.image, t.titre, t.description,
                        itemPlan = {
                            ItemPlan()
                        }
                    )
                    LastPlan(t.lien)
                }
            }
        }
    }
}