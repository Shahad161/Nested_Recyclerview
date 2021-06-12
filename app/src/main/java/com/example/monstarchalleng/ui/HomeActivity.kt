package com.example.monstarchalleng.ui

import android.view.LayoutInflater
import com.example.monstarchalleng.R
import com.example.monstarchalleng.data.DataSource
import com.example.monstarchalleng.data.domain.HomeItem
import com.example.monstarchalleng.databinding.ActivityHomeBinding
import com.example.monstarchalleng.util.toHomeItem
import com.ibareq.nestedrecyclerviewsample.data.domain.Post
import com.ibareq.nestedrecyclerviewsample.data.domain.Category
import com.ibareq.nestedrecyclerviewsample.data.domain.enums.HomeItemType


class HomeActivity : BaseActivity<ActivityHomeBinding>(), HomeActionsListener {
    lateinit var adapter: MealAdabter
    override val Log_tag: String = "MainActivity"
    override val bindingInflater: (LayoutInflater) -> ActivityHomeBinding = ActivityHomeBinding::inflate

    override fun setup() {
        val itemsList: MutableList<HomeItem<Any>> = mutableListOf()
        itemsList.add(HomeItem("Search....", HomeItemType.TYPE_SEARCH))
        itemsList.add(HomeItem(DataSource.getCategory(), HomeItemType.TYPE_CATEGORY))
        itemsList.addAll(
            DataSource.getPosts().map { it.toHomeItem() }
        )
        adapter = MealAdabter(itemsList, this)
        binding!!.recycler.adapter = adapter
    }

    override fun addCallBack() {
    }

    override fun onFavouritePost(post: Post) {
        TODO("Not yet implemented")
    }

    override fun onPublishText(text: String) {
        TODO("Not yet implemented")
    }

    override fun onSharePost(post: Post) {
        TODO("Not yet implemented")
    }

    override fun onClickStory(category: Category) {
        TODO("Not yet implemented")
    }

    override fun addNewStory() {
        TODO("Not yet implemented")
    }
}
