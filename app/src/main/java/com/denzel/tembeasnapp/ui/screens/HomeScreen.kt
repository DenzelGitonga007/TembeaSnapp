package com.denzel.tembeasnapp.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.denzel.tembeasnapp.ui.screens.common.BaseLayout
import com.denzel.tembeasnapp.ui.theme.TembeaSnappTheme

@Composable
fun HomeScreen() {
    BaseLayout(title = "Home") {
        Text("Welcome to the home page")
    }
}


@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    TembeaSnappTheme {
        HomeScreen()
    }
}

