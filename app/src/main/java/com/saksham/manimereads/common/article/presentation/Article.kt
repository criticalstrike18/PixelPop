package com.saksham.manimereads.common.article.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saksham.manimereads.common.article.data.Article

@Composable
fun ArticleItem(article: Article, onArticleClick: (Article) -> Unit) {
    // Root container
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onArticleClick(article) }
            .padding(vertical = 8.dp, horizontal = 8.dp), // Even padding for breathing space
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Image with rounded corners and shadow for depth
        Image(
            painter = painterResource(id = article.imageRes),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(12.dp)), // Rounded corners for soft look
            contentScale = ContentScale.FillBounds
        )

        Spacer(modifier = Modifier.width(16.dp)) // Space between image and text

        // Text column with vertical alignment
        Column(
            modifier = Modifier.weight(1f), // Fills the remaining space
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Article title with better hierarchy
            Text(
                text = article.title,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface, // Contrast against surface
                maxLines = 3,
                overflow = TextOverflow.Ellipsis // Handle long titles elegantly
            )

            Spacer(modifier = Modifier.height(8.dp))

            HorizontalDivider(modifier = Modifier.height(12.dp))
        }
    }
}

