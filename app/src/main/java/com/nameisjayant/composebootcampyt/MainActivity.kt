package com.nameisjayant.composebootcampyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.nameisjayant.composebootcampyt.bootcamp.PagerScreen
import com.nameisjayant.composebootcampyt.bootcamp.RecyclerViewLayout
import com.nameisjayant.composebootcampyt.bootcamp.SpannableTextLayout
import com.nameisjayant.composebootcampyt.bootcamp.TextFieldLayout
import com.nameisjayant.composebootcampyt.ui.theme.ComposeBootcampYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBootcampYTTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PagerScreen()
                }
            }
        }
    }
}

