package com.example.splash30.ui.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.splash30.ui.theme.Black500
import com.example.splash30.ui.theme.Primary

@Composable
fun SignUp(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 23.dp, vertical = 44.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        var username by remember {
            mutableStateOf(
                TextFieldValue("")
            )
        }
        var phoneNumber by remember {
            mutableStateOf(TextFieldValue(""))
        }
        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }
        var description by remember {
            mutableStateOf(TextFieldValue(""))
        }
        Card(
            modifier = Modifier
                .padding(top = 10.dp, end = 18.dp)
                .align(Alignment.End)
        ) {Image(painter = painterResource(id = com.example.splash30.R.drawable.stocka),
            contentDescription = "stock logo",
            modifier = Modifier.size(48.dp))
        }
        Column(
            modifier = Modifier
                .padding(top = 63.dp)
                .fillMaxSize()
        ) {
            Text(text = "Let`s get you started", fontStyle = FontStyle.Normal,
            modifier = Modifier,
                style = TextStyle(
                    fontSize = 24.sp,
                    color = Black500))
            Text(text = "Create An Account", fontStyle = FontStyle.Normal,
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.Gray))
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 55.dp)) {
                TextField(value = username, onValueChange = {
                    username= it
                },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Primary,
                    ),
                    placeholder = {
                        Text(text = "Username", color = Color.Gray)
                    },
                    modifier = Modifier
                        .border(1.dp, Gray, RoundedCornerShape(10.dp))
                        .fillMaxWidth(),
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp)
            ) {
                TextField(
                    value = phoneNumber,
                    onValueChange = {
                        phoneNumber = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Primary,
                    ),
                    placeholder = {
                        Text(text = "Phone number", color = Color.Gray)
                    },
                    modifier = Modifier
                        .border(1.dp, Gray, RoundedCornerShape(10.dp))
                        .fillMaxWidth(),

                    )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp)
            ) {
                TextField(
                    value = email,
                    onValueChange = {
                        email = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Primary,
                    ),
                    placeholder = {
                        Text(text = "Email Address", color = Color.Gray)
                    },
                    modifier = Modifier
                        .border(1.dp, Gray, RoundedCornerShape(10.dp))
                        .fillMaxWidth(),

                    )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp)
            ) {
                TextField(
                    value = description,
                    onValueChange = {
                        description = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Primary,
                    ),
                    placeholder = {
                        Text(text = "What industry does your business operate in?", color = Color.Gray)
                    },
                    modifier = Modifier
                        .border(1.dp, Gray, RoundedCornerShape(10.dp))
                        .fillMaxWidth(),

                    )
            }

        }
        }
    }

