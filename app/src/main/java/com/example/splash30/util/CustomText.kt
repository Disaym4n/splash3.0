package com.example.splash30.util

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.splash30.ui.theme.Black
import com.example.splash30.ui.theme.Primary
import com.example.splash30.ui.theme.Teal200


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