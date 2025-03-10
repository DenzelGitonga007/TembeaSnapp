package com.denzel.tembeasnapp.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val TembeaSnappColorScheme = lightColorScheme(
    primary = EarthyBrown,
    secondary = SavannahGold,
    background = DesertSand,
    onPrimary = CharcoalBlack, // Text color on primary background
    onBackground = CharcoalBlack
)

@Composable
fun TembeaSnappTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = TembeaSnappColorScheme,
        typography = Typography,
        content = content
    )
}
