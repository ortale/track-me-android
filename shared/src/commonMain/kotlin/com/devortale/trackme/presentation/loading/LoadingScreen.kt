package com.devortale.trackme.presentation.loading

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val SplashBackground = Color(0xFF00111D)
private val PrimaryBlue = Color(0xFF1685FF)
private val PrimaryText = Color(0xFFF5F7FA)
private val SecondaryText = Color(0xFF9CAFC0)

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(SplashBackground)
            .padding(horizontal = 24.dp),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.weight(1.15f))

            // Placeholder for the Track Me logo.
            // Add the logo here later without changing the layout.
            Spacer(modifier = Modifier.height(100.dp))

            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = PrimaryText,
                            fontWeight = FontWeight.Bold,
                        )
                    ) {
                        append("Track ")
                    }

                    withStyle(
                        style = SpanStyle(
                            color = PrimaryBlue,
                            fontWeight = FontWeight.Bold,
                        )
                    ) {
                        append("Me")
                    }
                },
                fontSize = 28.sp,
                lineHeight = 34.sp,
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Your journey. Your story.",
                fontSize = 12.sp,
                color = SecondaryText,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.weight(0.85f))

            CircularProgressIndicator(
                modifier = Modifier.size(24.dp),
                color = PrimaryBlue,
                strokeWidth = 2.5.dp,
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Checking permissions...",
                fontSize = 12.sp,
                color = PrimaryText,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.weight(0.9f))
        }
    }
}

@Preview
@Composable
private fun SplashScreenPreview() {
    MaterialTheme {
        SplashScreen()
    }
}
