package com.denzel.tembeasnapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.denzel.tembeasnapp.ui.screens.common.BaseLayout
import com.denzel.tembeasnapp.ui.theme.CharcoalBlack
import com.denzel.tembeasnapp.ui.theme.DesertSand
import com.denzel.tembeasnapp.ui.theme.EarthyBrown
import com.denzel.tembeasnapp.ui.theme.SavannahGold
import com.denzel.tembeasnapp.ui.theme.TembeaSnappTheme

@Composable
fun HomeScreen() {
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

//            Card

            Card(
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = SavannahGold),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Document Amazing Places", color = CharcoalBlack)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Start exploring now", color = CharcoalBlack)
                }
            }


        }
    }
}


@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    TembeaSnappTheme {
        HomeScreen()
    }
}

