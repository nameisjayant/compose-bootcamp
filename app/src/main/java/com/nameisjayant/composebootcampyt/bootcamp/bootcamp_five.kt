package com.nameisjayant.composebootcampyt.bootcamp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nameisjayant.composebootcampyt.R

@Composable
fun ImageLayoutScreen() {
  //  ImageLayout()
    IconLayout()
}

@Composable
fun ImageLayout() {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            imageVector = Icons.Default.Home, contentDescription = "image",
            modifier = Modifier.size(200.dp),
          //  alignment = Alignment.BottomCenter
        contentScale = ContentScale.FillWidth,
            alpha = 0.5f,
          //  colorFilter = ColorFilter.tint(color = Color.Red)
        )
    }
}

@Composable
fun IconLayout() {

   IconButton(onClick = {

   }) {
       Icon(imageVector = Icons.Outlined.Home, contentDescription = "home",
           modifier = Modifier.size(50.dp),
           // tint = Color.Red
       )
   }

}