package com.denzel.tembeasnapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.denzel.tembeasnapp.navigation.NavGraph
import com.denzel.tembeasnapp.ui.screens.HomeScreen
import com.denzel.tembeasnapp.ui.theme.TembeaSnappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TembeaSnappTheme {
//                HomeScreen()
                NavGraph() // use NavGraph to manage screens
            }
        }
    }
    
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TembeaSnappTheme {
        Greeting("Android")
    }
}