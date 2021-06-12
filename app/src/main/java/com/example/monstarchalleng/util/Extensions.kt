package com.example.monstarchalleng.util

import com.example.monstarchalleng.data.domain.HomeItem
import com.ibareq.nestedrecyclerviewsample.data.domain.Post
import com.ibareq.nestedrecyclerviewsample.data.domain.enums.HomeItemType

fun Post.toHomeItem() : HomeItem<Any> {
    return HomeItem(this, HomeItemType.TYPE_POST)
}