package com.catalin.instagramfeed

data class MockStory(
    val storyId: String,
    val image: Int
)

data class MockPost(
    val postId: String,
    val userImage: Int,
    val userName: String,
    val image: Int,
    val description: String,
    val likes: Int,
    val comments: Int
)