package com.devortale.trackme.presentation.dashboard

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devortale.trackme.presentation.components.TrackMeMap

@Composable
fun DashboardScreen(
    mapApiKey: String,
) {
    TrackMeMap(
        apiKey = mapApiKey,
        modifier = Modifier.fillMaxSize()
    )
}

@Preview
@Composable
fun DashboardScreenPreview() {
    DashboardScreen(
        mapApiKey = "YOUR_MAP_API_KEY"
    )
}