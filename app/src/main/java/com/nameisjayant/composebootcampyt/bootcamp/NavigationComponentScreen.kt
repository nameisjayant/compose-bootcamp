package com.nameisjayant.composebootcampyt.bootcamp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@Composable
fun MainNavigation() {

    val navHostController = rememberNavController()
    val viewModel: MainViewModel = viewModel()

    NavHost(navController = navHostController, startDestination = Screen.First.route) {
        composable(Screen.First.route) {
            FirstScreen(navHostController, viewModel)
        }
        composable(Screen.Second.route) {
            SecondScreen(navHostController, viewModel)
        }
    }

}

sealed class Screen(val route: String) {

    object First : Screen("first")
    object Second : Screen("second")
}


@Composable
fun FirstScreen(navHostController: NavHostController, viewModel: MainViewModel) {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = {
            navHostController.currentBackStackEntry?.savedStateHandle?.set("name", "jayant")
            navHostController.navigate(Screen.Second.route)
            viewModel.setData("Jayant kumar")
        }) {
            Text(text = "Send data to second Screen")
        }
    }

}

@Composable
fun SecondScreen(
    navHostController: NavHostController,
    viewModel: MainViewModel
) {
    val _name by viewModel.data.collectAsState()
    //   navHostController.navigate(Screen.First.route)
    // navHostController.navigateUp()
    val name = navHostController.previousBackStackEntry?.savedStateHandle?.get<String>("name") ?: ""

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "my name is $_name")
    }

}

class MainViewModel : ViewModel() {

    private val _data: MutableStateFlow<String> = MutableStateFlow("")
    var data = _data.asStateFlow()
        private set

    fun setData(name: String) {
        _data.value = name

    }

}