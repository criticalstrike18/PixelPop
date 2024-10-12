package com.saksham.manimereads.tab2_manga

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saksham.manimereads.R
import com.saksham.manimereads.common.article.data.Article
import com.saksham.manimereads.common.article.presentation.ArticleList

@Composable
fun MangaScreen(){
    val articles = listOf(
        Article(
            id = 1,
            title = "Naruto: The Story of a Ninja",
            imageRes = R.drawable.naruto, // Replace with actual drawable resource
            description = "Follow Naruto on his journey to become Hokage."
        ),
        Article(
            id = 2,
            title = "One Piece: The Pirate King",
            imageRes = R.drawable.one_piece, // Replace with actual drawable resource
            description = "Luffy sets out on an adventure to find the One Piece."
        ),
        Article(
            id = 3,
            title = "Attack on Titan: Humanity’s Last Hope",
            imageRes = R.drawable.attack_on_titan, // Replace with actual drawable resource
            description = "Eren and his friends fight against Titans for humanity."
        ),
        Article(
            id = 4,
            title = "Naruto: The Story of a Ninja",
            imageRes = R.drawable.naruto, // Replace with actual drawable resource
            description = "Follow Naruto on his journey to become Hokage."
        ),
        Article(
            id = 5,
            title = "One Piece: The Pirate King",
            imageRes = R.drawable.one_piece, // Replace with actual drawable resource
            description = "Luffy sets out on an adventure to find the One Piece."
        ),
        Article(
            id = 6,
            title = "Attack on Titan: Humanity’s Last Hope",
            imageRes = R.drawable.attack_on_titan, // Replace with actual drawable resource
            description = "Eren and his friends fight against Titans for humanity."
        ),
        Article(
            id = 7,
            title = "Naruto: The Story of a Ninja",
            imageRes = R.drawable.naruto, // Replace with actual drawable resource
            description = "Follow Naruto on his journey to become Hokage."
        ),
        Article(
            id = 8,
            title = "One Piece: The Pirate King",
            imageRes = R.drawable.one_piece, // Replace with actual drawable resource
            description = "Luffy sets out on an adventure to find the One Piece."
        ),

        )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Top text (Anime)
        Text(
            text = "Manga",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Article list
        ArticleList(articles = articles, onArticleClick = {})
    }
}