package com.nameisjayant.composebootcampyt.bootcamp

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalPagerScreen() {

    val pagerState = rememberPagerState()
    val pageCount = 10
    val scope = rememberCoroutineScope()
    val data = listOf("page 1","page 2","page 3","page 4")

    Box(modifier = Modifier.fillMaxSize()) {

        HorizontalPager(
            pageCount = data.size,
            modifier = Modifier.align(Alignment.Center),
            state = pagerState
        ) {
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Text(text = data[it], fontSize = 30.sp)
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
                scope.launch {
                    pagerState.animateScrollToPage(pagerState.currentPage+1)
                }
            }) {
                Text(text = "Next")
            }
            Row {
                repeat(data.size){
                    CustomIndicators(selected = pagerState.currentPage == it)
                }
            }
        }
    }

}

@Composable
fun CustomIndicators(
    selected: Boolean
) {
    Box(
        modifier = Modifier
            .padding(2.dp)
            .background(color = if (selected) Color.Red else Color.Gray, shape = CircleShape)
            .size(10.dp)
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VerticalPagerScreen() {

   VerticalPager(pageCount = 5) {
       Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
           Text(text = "Page $it")
       }
   }

}