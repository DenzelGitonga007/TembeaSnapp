package com.denzel.tembeasnapp.ui.screens.common

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.denzel.tembeasnapp.ui.theme.*
import com.denzel.tembeasnapp.ui.theme.CharcoalBlack
import com.denzel.tembeasnapp.ui.theme.EarthyBrown

@Composable
fun BaseLayout(
    title: String,
    content: @Composable () -> Unit
) {
    Scaffold(
        topBar = { AppBar(title) },
        bottomBar = { BottomNavBar() }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            content()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(title: String) {
    TopAppBar(
        title = { Text(text = title, color = CharcoalBlack) },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = EarthyBrown)
    )
}

@Composable
fun BottomNavBar() {
    NavigationBar(containerColor = EarthyBrown) {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home", color = CharcoalBlack) },
            selected = true, // Change this dynamically later
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
            label = { Text("Favorites", color = CharcoalBlack) },
            selected = false, // Change this dynamically later
            onClick = {}
        )
    }
}


@Preview()
@Composable
fun PreviewMainLayout() {
    TembeaSnappTheme {
        BaseLayout(title = "TembeaSnapp") {
            Text(text = "This is a sample screeeen!", color = CharcoalBlack)
        }
    }
}
