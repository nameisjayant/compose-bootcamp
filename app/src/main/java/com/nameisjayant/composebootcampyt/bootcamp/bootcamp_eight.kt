package com.nameisjayant.composebootcampyt.bootcamp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RecyclerViewLayout() {
    GridViewLayout()
}

@Composable
fun VerticalRecyclerView() {

    var lists = listOf("hjkhdk", "njkkf", "nkfkf", "hhkkdd", "kkjdkjd")

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(20.dp),
        //  reverseLayout = true,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        item {
//            (1..40).forEach {
//                Text(text = "Hello $it", modifier = Modifier.padding(20.dp))
//            }
//        }

//        items(lists){
//            Text(text = it, modifier = Modifier.padding(vertical = 20.dp))
//        }
//
//        itemsIndexed(lists){index, item ->
//            Text(text = item, modifier = Modifier.padding(vertical = 20.dp))
//        }
        items(items, key = {
            it.id
        }) {
            Text(text = it.item, modifier = Modifier.padding(vertical = 20.dp))
        }
    }

}

@Composable
fun HorizontalRecyclerView() {

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        state = rememberLazyListState(
            7
        )
    ) {
        showContent()
    }

}

fun LazyListScope.showContent(){
    items(items,
        key = {
            it.id
        }) {
        Text(text = "${it.item} ${it.id} ", modifier = Modifier.padding(horizontal = 20.dp))

    }
}

@Composable
fun GridViewLayout() {

//    LazyVerticalGrid(
//      //  columns = GridCells.Fixed(3)
//    columns = GridCells.Adaptive(75.dp)
//    ){
//        items(items,
//            key = {
//                it.id
//            }) {
//            Text(text = "${it.item} ${it.id} ", modifier = Modifier.padding(horizontal = 20.dp))
//
//        }
//    }

    LazyHorizontalGrid(rows = GridCells.Fixed(4)){
        items(items,
            key = {
                it.id
            }) {
            Text(text = "${it.item} ${it.id} ", modifier = Modifier.padding(horizontal = 20.dp))

        }
    }

}

data class Item(
    val id: Int,
    val item: String
)

val items = listOf(
    Item(
        1,
        "nlkdd"
    ),
    Item(
        2,
        "jkofkd"
    ),
    Item(
        3,
        "jkofkd"
    ),
    Item(
        4,
        "jkofkd"
    ),
    Item(
        5,
        "jkofkd"
    ),
    Item(
        6,
        "jkofkd"
    ),
    Item(
        7,
        "jkofkd"
    )
)