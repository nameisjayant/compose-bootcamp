package com.nameisjayant.composebootcampyt.bootcamp

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MarqueeTextLayout() {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "This is marquee text and this text can animate from left to right",
                modifier = Modifier
                    .padding(horizontal = 5.dp)
                    .basicMarquee(
                        iterations = 5,
                        delayMillis = 500,
                        velocity = 500.dp
                    ),
                fontSize = 22.sp
            )
        }
    }

}