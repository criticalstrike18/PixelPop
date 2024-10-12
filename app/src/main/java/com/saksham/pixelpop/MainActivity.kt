package com.saksham.pixelpop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.saksham.pixelpop.bottomNav.BottomNavBar
import com.saksham.pixelpop.tab1_anime.AnimeScreen
import com.saksham.pixelpop.tab2_manga.MangaScreen
import com.saksham.pixelpop.tab3_fav.FavScreen
import com.saksham.pixelpop.ui.theme.ManimeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ManimeTheme {
                val navController = rememberNavController()

                Scaffold(
                    bottomBar = { BottomNavBar(navController = navController) }
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "anime",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("anime") { AnimeScreen() }
                        composable("manga") { MangaScreen() }
                        composable("fav") { FavScreen() }
                    }
                }

            }
        }
    }
}
