package com.nameisjayant.composebootcampyt.bootcamp

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp


@Composable
fun ButtonLayout() {
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
           Column() {
               Button(onClick = {
                   Toast.makeText(context,"Simple button",Toast.LENGTH_SHORT).show()
               },
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(15.dp),
                   elevation = ButtonDefaults.elevation(
                       defaultElevation = 0.dp
                   ),
                   shape = CircleShape,
                   border = BorderStroke(5.dp, Color.Red),
                   colors = ButtonDefaults.buttonColors(
                       backgroundColor = Color.Black,
                       contentColor = Color.White
                   ),
                   contentPadding = PaddingValues(
                       vertical = 15.dp
                   )
               ) {
                   Text(text = "Simple button")
               }

               OutlinedButton(onClick = {}) {
                   Text(text = "Outlined Button")
               }
               TextButton(onClick = { /*TODO*/ }) {
                   Text(text = "Text Button")
               }
           }
    }

}