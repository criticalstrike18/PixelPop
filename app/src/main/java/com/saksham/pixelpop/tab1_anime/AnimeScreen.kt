package com.saksham.pixelpop.tab1_anime

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
import com.saksham.pixelpop.R
import com.saksham.pixelpop.common.article.data.Article
import com.saksham.pixelpop.common.article.presentation.ArticleList

@Composable
fun AnimeScreen() {
    val articles = listOf(
        Article(
            id = 1,
            title = "Top 10 Anime Of All Times",
            imageRes = R.drawable.top10_anime, // Replace with actual drawable resource
            description = "Follow Naruto on his journey to become Hokage."
        ),
        Article(
            id = 2,
            title = "Top 10 Horror Anime Of All Times",
            imageRes = R.drawable.top10_horror_anime,
            description = "Luffy sets out on an adventure to find the One Piece."
        ),
        Article(
            id = 3,
            title = "Top 10 Romance Anime Of All Times",
            imageRes = R.drawable.top10_romance_anime,
            description = "Eren and his friends fight against Titans for humanity."
        ),
        Article(
            id = 4,
            title = "Top 10 Comedy Anime Of All Times",
            imageRes = R.drawable.top10_comedy_anime,
            description = "Follow Naruto on his journey to become Hokage."
        ),
        Article(
            id = 5,
            title = "Top 10 Isekai Anime Of All Times",
            imageRes = R.drawable.top10_isekai_anime,
            description = "Luffy sets out on an adventure to find the One Piece."
        ),
        Article(
            id = 6,
            title = "Top 10 Op Anime Of All Times",
            imageRes = R.drawable.top10_op_anime,
            description = "Eren and his friends fight against Titans for humanity."
        ),
        Article(
            id = 7,
            title = "Top 10 Romance Anime Of All Times",
            imageRes = R.drawable.top10_romance_anime,
            description = "Follow Naruto on his journey to become Hokage."
        ),
        Article(
            id = 8,
            title = "Top 10 Isekai Anime Of All Times",
            imageRes = R.drawable.top10_isekai_anime,
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
            text = "Anime",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Article list
        ArticleList(articles = articles, onArticleClick = {})
    }
}