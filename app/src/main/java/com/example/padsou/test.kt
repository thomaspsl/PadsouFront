package com.example.padsou.ui.theme

import android.content.Intent
import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.padsou.models.HomeViewModel
import com.example.padsou.data.Tips
import java.io.File


@Composable
fun Test(id:String ="",navController:NavController) {
    Row(
        modifier = Modifier.background(Color.Blue)
    ) {
        val viewModel = viewModel<HomeViewModel>()
        val category: State<List<Tips>> = viewModel.tips.collectAsState()
        //viewModel.addTips("ou on tire sur des gens","tire.png","shoot.fr","shoot",navController)

        Column() {
            Text(text = id)
        }


    }
}


