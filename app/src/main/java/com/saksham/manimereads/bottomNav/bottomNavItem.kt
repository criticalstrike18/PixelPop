package com.saksham.manimereads.bottomNav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ReadMore
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Newspaper
import androidx.compose.material.icons.filled.SelfImprovement
import androidx.compose.material.icons.filled.SportsMartialArts
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
)

val bottomNavItems = listOf(
    BottomNavItem(
        name = "Anime",
        route = "anime",
        selectedIcon = Icons.Filled.SportsMartialArts,
        unselectedIcon = Icons.Filled.SelfImprovement
    ),
    BottomNavItem(
        name = "Manga",
        route = "manga",
        selectedIcon = Icons.AutoMirrored.Filled.ReadMore,
        unselectedIcon = Icons.Filled.Newspaper
    ),
    BottomNavItem(
        name = "Fav",
        route = "fav",
        selectedIcon = Icons.Filled.Favorite,
        unselectedIcon = Icons.Outlined.FavoriteBorder
    )
)