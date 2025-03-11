package com.denzel.tembeasnapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.denzel.tembeasnapp.ui.screens.common.BaseLayout
import com.denzel.tembeasnapp.ui.theme.*

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun HomeScreen(navController: NavController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    // Navigate to add travel screen
                    navController.navigate("add_travel")
                }
            ) {
                Text("+") // Placeholder for a camera icon
            }
        }
    ) { paddingValues ->
        BaseLayout(title = "TembeaSnapp") {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(DesertSand)
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Capture your most fascinating destinations",
                    color = EarthyBrown
                )

                Spacer(modifier = Modifier.height(8.dp))


            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    TembeaSnappTheme {
        HomeScreen(navController = rememberNavController())
    }
}
