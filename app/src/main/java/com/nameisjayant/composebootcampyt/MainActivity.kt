package com.nameisjayant.composebootcampyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nameisjayant.composebootcampyt.bootcamp.CheckBoxScreen
import com.nameisjayant.composebootcampyt.bootcamp.MarqueeTextLayout
import com.nameisjayant.composebootcampyt.bootcamp.RadioButtonScreen
import com.nameisjayant.composebootcampyt.ui.theme.ComposeBootcampYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBootcampYTTheme {
                CustomRow()
            }
        }
    }
}

@Composable
fun CustomRow(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Card(
            modifier = modifier
                .fillMaxWidth(),

            elevation = 5.dp,
            backgroundColor = Color.White
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier.weight(1f)
                ) {
                    AppIconButton(
                        icon = Icons.Default.ArrowBack,
                        tint = Color.Black,
                        modifier = Modifier.size(24.dp)
                    ) {}
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(
                        modifier = Modifier.align(CenterVertically)
                    ) {
                        Text(
                            text = "Booked by you Report", style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp
                            )
                        )
                        Text(
                            text = "12 feb 2023 to 12 sep 2023 | KA1244", style = TextStyle(
                                color = Color.Gray
                            )
                        )
                    }
                }
                AppIconButton(icon = Icons.Default.Notifications, tint = Color.Cyan) {}

            }
        }
    }
}

@Composable
fun AppIconButton(
    icon: ImageVector,
    tint: Color = Color.Unspecified,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    IconButton(onClick = onClick, modifier = modifier) {
        Icon(imageVector = icon, contentDescription = "", tint = tint)
    }
}