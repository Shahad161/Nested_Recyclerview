package com.example.monstarchalleng.ui

import android.view.LayoutInflater
import com.example.monstarchalleng.data.DataSource
import com.example.monstarchalleng.data.domain.HomeItem
import com.example.monstarchalleng.databinding.ActivityHomeBinding
import com.example.monstarchalleng.util.toHomeItem
import com.ibareq.nestedrecyclerviewsample.data.domain.Post
import com.ibareq.nestedrecyclerviewsample.data.domain.Category
import com.mig35.carousellayoutmanager.CarouselLayoutManager
import com.mig35.carousellayoutmanager.CarouselZoomPostLayoutListener
import com.mig35.carousellayoutmanager.CenterScrollListener


class HomeActivity : BaseActivity<ActivityHomeBinding>(), HomeActionsListener {
    lateinit var adapter: MealAdabter
    override val Log_tag: String = "MainActivity"
    override val bindingInflater: (LayoutInflater) -> ActivityHomeBinding = ActivityHomeBinding::inflate

    override fun setup() {
        val itemsList: MutableList<HomeItem<Any>> = mutableListOf()
        itemsList.addAll(
            DataSource.getPosts().map { it.toHomeItem() }
        )
        adapter = MealAdabter(itemsList, this)
        binding!!.recycler.adapter = adapter

        val layoutManager = CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL)
        val recyclerView = binding!!.recycler
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        layoutManager.setPostLayoutListener(CarouselZoomPostLayoutListener())

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
