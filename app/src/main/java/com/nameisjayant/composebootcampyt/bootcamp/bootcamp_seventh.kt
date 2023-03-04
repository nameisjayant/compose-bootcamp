package com.nameisjayant.composebootcampyt.bootcamp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpannableTextLayout() {

    val text1 = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = Color.Red,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        ) {
            append("H")
        }
        append("ello")
    }

    val text2 = buildAnnotatedString {
        append("Please Accept the ")
        pushStringAnnotation("terms", "terms")
        pushStyle(
            style = SpanStyle(
                color = Color.Red,
                textDecoration = TextDecoration.Underline
            )
        )
//        pushStyle(
//            ParagraphStyle(
//
//            )
//        )
        append("terms ")
        pop()

        append("and ")

        pushStringAnnotation("privacy", "privacy")
        pushStyle(
            style = SpanStyle(
                color = Color.Red,
                textDecoration = TextDecoration.Underline
            )
        )
        append("Privacy policy")
        pop()
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = text1)
        Spacer(modifier = Modifier.height(20.dp))
        ClickableText(text = text2, onClick = {offset->
            text2.getStringAnnotations("terms",offset,offset).firstOrNull()?.let {
                it.item
            }
            text2.getStringAnnotations("privacy",offset,offset).firstOrNull()?.let {
                it.item
            }
        })
    }

}