package com.nameisjayant.composebootcampyt.bootcamp

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagerScreen() {

    val pagerState = rememberPagerState()
    val pageCount = 10
    val scope = rememberCoroutineScope()

    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            pageCount = pageCount, state = pagerState, modifier = Modifier
                .align(
                    Alignment.Center
                )
        ) {
            Text(text = "page : $it", modifier = Modifier.align(Alignment.Center))
        }
        Column(
            modifier = Modifier
                .align(
                    Alignment.BottomCenter
                )
                .padding(bottom = 20.dp)
        ) {
            Button(onClick = {
                scope.launch {
                    pagerState.animateScrollToPage(pagerState.currentPage + 1)
                }
            }, modifier = Modifier.align(CenterHorizontally)) {
                Text("Next")
            }
            Row {
                repeat(pageCount) {
                    CustomIndicators(
                        selected = pagerState.currentPage == it
                    )
                }
            }
        }

    }


}

@Composable
fun CustomIndicators(
    selected: Boolean,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .padding(horizontal = 2.dp)
            .background(
                color = if (selected) Color.Red else Color.Gray,
                shape = CircleShape
            )
            .size(10.dp)
    )
}
