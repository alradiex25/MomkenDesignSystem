package com.momken.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = MomkenColors.Brand,
    onPrimary = MomkenColors.OnBrand,
    secondary = MomkenColors.BrandDark,
    background = MomkenColors.LightBackground,
    surface = MomkenColors.LightSurface,
    onSurface = MomkenColors.LightOnSurface,
    error = MomkenColors.Error
)

private val DarkColors = darkColorScheme(
    primary = MomkenColors.Brand,
    onPrimary = MomkenColors.OnBrand,
    secondary = ColorTokens.DarkSecondary,
    background = MomkenColors.DarkBackground,
    surface = MomkenColors.DarkSurface,
    onSurface = MomkenColors.DarkOnSurface,
    error = MomkenColors.Error
)

private object ColorTokens {
    val DarkSecondary = MomkenColors.Brand
}

@Composable
fun MomkenTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = MomkenTypography,
        content = content
    )
}
