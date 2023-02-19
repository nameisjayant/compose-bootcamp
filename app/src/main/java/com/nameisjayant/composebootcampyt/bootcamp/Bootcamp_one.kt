package com.nameisjayant.composebootcampyt.bootcamp

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BootCampOne() {
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Bootcamp")
                },
                contentColor = Color.Black,
                backgroundColor = Color.Yellow,
                elevation = 0.dp,
                navigationIcon = {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                },
                actions = {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "")
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = "")
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
            }
        },
        bottomBar = {
            BottomAppBar() {
                Icon(imageVector = Icons.Default.Person, contentDescription = "")
                Icon(imageVector = Icons.Default.Home, contentDescription = "")
            }
        },
        drawerContent = {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
        }
    ) {
        Icon(imageVector = Icons.Default.Menu, contentDescription = "")
    }
    
}
