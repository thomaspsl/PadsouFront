package com.example.padsou

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.ui.theme.*

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PadsouTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {

                }
            }
        }
    }
}


@Composable
fun MainLogin(navController: NavController) {

    var mail by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .background(PadsouWhite)
    ){
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 26.dp, top = 75.dp, end = 26.dp, bottom = 55.dp)) {
            Row() {
                Column() {
                    Text(
                        text = "Te revoilà ! \uD83D\uDD25",
                        textAlign = TextAlign.Center,
                        color = PadsouDarkGrey,
                        style = TitleIntegralBold27,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Text(
                        text = "Reviens vite pour profiter des bons plans",
                        textAlign = TextAlign.Center,
                        color = PadsouDarkGrey,
                        style = TitleInterRegular20,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
            Row() {
                Column() {
                    TextField(
                        value = mail,
                        onValueChange = { newText -> mail = newText },
                        placeholder = {
                            Text(
                                "Ton adresse e-mail",
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
                    TextField(
                        value = password,
                        onValueChange = { newText -> password = newText },
                        placeholder = {
                            Text(
                                "Ton mot de passe",
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
                            .padding(top = 15.dp)
                    )
                }
            }
            Row() {
                Column() {
                    Text(
                        text = "Mot de passe oublié ?",
                        color = PadsouGrey,
                        textAlign = TextAlign.End,
                        style = captionIntegralBold12,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(backgroundColor = PadsouPurple),
                        shape = RoundedCornerShape(15.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 15.dp)
                    ) {
                        Text(
                            "SE CONNECTER",
                            color = Color.White,
                            style = ButtonIntegralBold15,
                            modifier = Modifier
                                .padding(top = 6.dp, bottom = 6.dp)
                        )
                    }
                }
            }
            Row() {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Pas encore inscrit ? ",
                        color = PadsouGrey,
                        style = captionIntegralBold12,
                    )
                    Text(
                        text = "Allez viens !",
                        color = PadsouPurple,
                        style = captionIntegralBold12,
                    )
                }
            }
        }
    }
}