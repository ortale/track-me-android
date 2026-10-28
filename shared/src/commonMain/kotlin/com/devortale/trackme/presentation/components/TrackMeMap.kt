package com.devortale.trackme.presentation.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devortale.trackme.config.MapConfig
import org.maplibre.compose.map.MaplibreMap
import org.maplibre.compose.map.rememberMapState
import org.maplibre.compose.style.BaseStyle

@Composable
fun TrackMeMap(
    modifier: Modifier = Modifier,
    apiKey: String,
) {
    val mapStyleUrl =
        "${MapConfig.MAP_STYLE_URL}?key=$apiKey"

    val mapState = rememberMapState(
        baseStyle = BaseStyle.Uri(mapStyleUrl)
    )

    MaplibreMap(
        state = mapState,
        modifier = modifier
    )
}