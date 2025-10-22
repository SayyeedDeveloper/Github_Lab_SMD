package com.example.githublab.presentation.components

import android.app.Activity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.core.view.WindowInsetsControllerCompat

private val Nothing?.isInEditMode: Boolean
    get() = false

private val Nothing?.context: Activity?
    get() = null


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LabTopBar(
    modifier: Modifier = Modifier,
    title: String,
    content: @Composable () -> Unit
) {
    SideEffect {
        val view = null
        val window = (view.context as? Activity)?.window
        if (!view.isInEditMode && window != null) {
            WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars =
                true
        }
    }
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        title
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }
    ){ innerPadding ->
        Box(
            modifier = modifier.padding(innerPadding)
        ){
            content
        }
    }
}