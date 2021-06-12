package com.example.monstarchalleng.ui

import com.ibareq.nestedrecyclerviewsample.data.domain.Category
import com.ibareq.nestedrecyclerviewsample.data.domain.Post

interface HomeActionsListener {
    fun onFavouritePost(post: Post)
    fun onPublishText(text: String)
    fun onSharePost(post: Post)
    fun onClickStory(category: Category)
    fun addNewStory()
}