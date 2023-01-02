package com.example.splash30.ui.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.splash30.R
import com.example.splash30.ui.theme.Black
import com.example.splash30.ui.theme.Primary
import com.example.splash30.ui.theme.Teal200
import com.example.splash30.util.CustomText

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


        Box(
            Modifier
                .fillMaxWidth()
                .padding(vertical = 33.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Primary),
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                , shape = RoundedCornerShape(10.dp)
            ) {
                Text(text = "Log In", style = TextStyle(color = Color.Black,
                    fontStyle = FontStyle.Normal,))
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Primary),
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .border(1.dp, Color.Gray, RoundedCornerShape(10.dp))
            ) {
                Text(text = "Sign Up", style = TextStyle(color = Color.Black,
                    fontStyle = FontStyle.Normal,))
            }
        }
        }

}
