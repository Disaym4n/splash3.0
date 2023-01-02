package com.example.splash30

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.splash30.ui.onboarding.SignUp
import com.example.splash30.ui.screens.onboarding.Intro
import com.example.splash30.ui.theme.Black
import com.example.splash30.ui.theme.Primary
import com.example.splash30.ui.theme.Splash30Theme
import com.example.splash30.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Splash30Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   SignUp()
                }
            }
        }
    }
}

@Composable
fun logIn() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 70.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.stocka),
            contentDescription = "stock logo",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = "Welcome to Stocka",
            modifier = Modifier
                .padding(top = 50.dp, end = 30.dp, start = 35.dp)
                .align(Alignment.CenterHorizontally),
            style = TextStyle(fontSize = 36.sp, fontWeight = FontWeight.Bold)
        )
        @Composable
        fun CustomText(modifier: Modifier, text: String) {
            val annotedText = buildAnnotatedString {
                text.split(" ").forEach {
                    if (it == "stocka") {
                        "stocka".forEach { char ->
                            if (char == 'a') {
                                pushStringAnnotation(
                                    tag = "stocka",
                                    annotation = char.toString()
                                )
                                withStyle(
                                    style = SpanStyle(
                                        color = Primary,
                                        fontSize = 22.sp,
                                        fontWeight = FontWeight.SemiBold,

                                        )
                                ) {
                                    append("$char")
                                }
                                pop()
                            } else {
                                pushStringAnnotation(
                                    tag = "stocka",
                                    annotation = char.toString()
                                )
                                withStyle(
                                    style = SpanStyle(
                                        color = Teal200,
                                        fontSize = 22.sp,
                                        fontWeight = FontWeight.SemiBold,

                                        )
                                ) {
                                    append("$char")
                                }
                                pop()
                            }
                        }
                    } else {
                        pushStringAnnotation(
                            tag = "URL",
                            annotation = it
                        )
                        withStyle(
                            style = SpanStyle(
                                color = Black,
                                fontSize = 22.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        ) {
                            append("$it ")
                        }
                        pop()
                    }
                }

            }
            Text(text = annotedText, modifier = modifier, textAlign = TextAlign.Center)
        }
        }
    }





    