package com.example.githublab

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Profile"
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }
    ){ innerPadding ->
        modifier.padding(innerPadding)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){
            Button(
                onClick = {
                    navController.navigate(Screens.Home.route)
                },
                modifier = Modifier.fillMaxWidth().align(Alignment.BottomCenter)
            ) {
                Text("Go Back")
            }
        }
    }
}

@Preview
@Composable
fun ProfileScreenPrev (){
    ProfileScreen(
        navController = androidx.navigation.compose.rememberNavController(),
        modifier = Modifier
    )
}