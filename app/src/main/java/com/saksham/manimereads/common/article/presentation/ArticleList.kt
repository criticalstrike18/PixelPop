package com.saksham.manimereads.common.article.presentation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.saksham.manimereads.common.article.data.Article

@Composable
fun ArticleList(articles: List<Article>, onArticleClick: (Article) -> Unit) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(articles.size) { article ->
            ArticleItem(articles[article], onArticleClick)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}