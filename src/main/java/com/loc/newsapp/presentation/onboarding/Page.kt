package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Discover Breaking News",
        description = "Explore real-time updates on the latest events, from global headlines to local stories. Your go-to source for staying in the know.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Stay Informed Anywhere, Anytime",
        description = "Access news on the go. Whether you are commuting, travelling, or relaxing at home, we keep you updated wherever you are.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Bookmark and Save Articles",
        description = "Save articles for later, creating your own library of important or interesting reads. Your bookmarks, your curated knowledge.",
        image = R.drawable.onboarding3
    )
)

