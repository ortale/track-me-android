package com.devortale.trackme.presentation.dashboard

import com.devortale.trackme.domain.model.Location
import kotlin.time.Duration

data class DashboardState(
    val isTracking: Boolean = false,
    val currentLocation: Location? = null,
    val route: List<Location> = emptyList(),
    val elapsedTime: Duration = Duration.ZERO
)
