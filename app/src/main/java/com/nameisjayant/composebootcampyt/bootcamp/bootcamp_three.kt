package com.nameisjayant.composebootcampyt.bootcamp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun BootcampThree() {
    BoxLayout()
}

@Composable
fun BoxLayout() {

    Box(
    ) {
        Text(text = "One Text ", modifier = Modifier.align(Alignment.TopStart))
        Text(text = "Two Text ", modifier = Modifier.align(Alignment.Center))
        Text(text = "Three Text ",modifier = Modifier.align(Alignment.BottomStart))
    }

}

@Composable
fun RowLayout() {

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.run {
            background(Color.Red)
        }
    ) {
        Text(text = "One Text ")
        Text(text = "Two Text ")
        Text(text = "Three Text ")
    }

}

@Composable
fun ColumnLayout() {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.End
    ) {
        Text(text = "One Text ")
        Text(text = "Two Text ")
        Text(text = "Three Text ")
    }
}