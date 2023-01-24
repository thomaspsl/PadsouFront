package com.example.padsou.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.ButtonIntegralBold15
import com.example.padsou.ui.theme.PadsouPink

@Composable
fun button(textButton: String, routeDirection: Unit){
    Button(
        onClick = { routeDirection },
        colors = ButtonDefaults.buttonColors(backgroundColor = PadsouPink),
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = textButton,
            color = Color.White,
            style = ButtonIntegralBold15,
            modifier = Modifier
                .padding(top = 6.dp, bottom = 6.dp)
        )
    }
}