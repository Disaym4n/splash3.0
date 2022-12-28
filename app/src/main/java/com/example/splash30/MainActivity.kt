package com.example.splash30

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.splash30.ui.screens.onboarding.Intro
import com.example.splash30.ui.theme.Primary
import com.example.splash30.ui.theme.Splash30Theme

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
                    Intro()
                }
            }
        }
    }
}


@Composable
fun Activity() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 38.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Image(painter = painterResource(id = R.drawable.onbording_image1),
            contentDescription = "onbording",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = "Manage your stock on daily, weekly and monthly basis",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 61.dp),
            style = TextStyle(fontSize = 21.sp, color = com.example.splash30.ui.theme.Black,
                fontWeight = FontWeight(600))
        )
        Image(painter = painterResource(id = R.drawable.group_360),
            contentDescription = "navigate bar",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 94.dp, end = 40.dp, start = 40.dp, )
        )

        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 60.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Primary
            )
        ) {
            Text(text = "Next", style = TextStyle(color = Black))
        }
    }
   }




    