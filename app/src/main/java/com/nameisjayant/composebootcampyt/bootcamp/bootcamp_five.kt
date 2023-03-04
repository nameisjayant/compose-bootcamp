package com.nameisjayant.composebootcampyt.bootcamp

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ManageStateScreen() {
   // CounterLayout()
    TodoScreen()
}

@Composable
fun CounterLayout() {

   // val counter = rememberSaveable { mutableStateOf(0) }
   // var counter by remember { mutableStateOf(0) }
    val (counter,setCounter) = remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "$counter", fontSize = 25.sp)
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {
            setCounter(counter+1)
        }) {
            Text(text = "Counter")
        }
    }

}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TodoScreen() {

    val todoList = remember {mutableStateListOf("jayant","Nitin","Mayank")}
    val scrollState = rememberScrollState()
    val mapData = remember{ mutableStateMapOf("1" to "Jayant",2 to "Mayank") }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                todoList.add("New User")
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
            }
        }
    ) {
        Column(
            modifier = Modifier.verticalScroll(scrollState)
        ) {
            todoList.forEach {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 10.dp),
                    horizontalArrangement = SpaceBetween
                ) {
                    Text(text = it)
                    IconButton(onClick = {
                        todoList.remove(it)
                    }) {
                        Icon(imageVector = Icons.Default.Delete, contentDescription = "" )
                    }
                }
            }
        }
    }

}