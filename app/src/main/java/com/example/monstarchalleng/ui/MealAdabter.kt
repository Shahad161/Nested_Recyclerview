package com.example.monstarchalleng.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.monstarchalleng.R
import com.example.monstarchalleng.data.domain.HomeItem
import com.example.monstarchalleng.databinding.ItemBinding
import com.example.monstarchalleng.databinding.ItemCategoriesListBinding
import com.example.monstarchalleng.ui.categories.CategoriesAdapter
import com.ibareq.nestedrecyclerviewsample.data.domain.Category
import com.ibareq.nestedrecyclerviewsample.data.domain.Post
import com.ibareq.nestedrecyclerviewsample.data.domain.enums.HomeItemType
import com.mig35.carousellayoutmanager.CarouselLayoutManager
import com.mig35.carousellayoutmanager.CarouselZoomPostLayoutListener
import java.lang.Exception

class MealAdabter(private val items: List<HomeItem<Any>>, private val listener: HomeActionsListener) : RecyclerView.Adapter<MealAdabter.BaseHomeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHomeViewHolder {
        return when(viewType){
            VIEW_TYPE_POST -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
                PostViewHolder(view)
            }
            VIEW_TYPE_CATEGORY -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_categories_list, parent, false)
                CategoryViewHolder(view)
            }

            else -> throw Exception("UNKNOWN VIEW TYPE")
        }
    }

    override fun onBindViewHolder(holder: BaseHomeViewHolder, position: Int) {
        when(holder){
            is CategoryViewHolder -> bindCategories(holder, position)
            is PostViewHolder -> bindPost(holder, position)
        }
    }

    private fun bindCategories(holder: CategoryViewHolder, position: Int){
        val categories = items[position].item as List<Category>
        val adapter = CategoriesAdapter(categories, listener)
        holder.binding.apply {
            recyclerCategories.adapter = adapter
        }
    }
//    private fun bindSearch(holder: SearchViewHolder, position: Int){
//        val hintText = items[position].item as String
//        val url = "https://image.freepik.com/free-vector/cute-shiba-inu-design-with-mask-vaccine_454510-35.jpg"
//        holder.binding.apply {
////            editText.hint = hintText
////            Glide.with(this.root.context).load(url).into(logo)
//        }
//    }


    private fun bindPost(holder: PostViewHolder, position: Int){
        val currentPost = items[position].item as Post
        holder.binding.apply {
//            meal.text = currentPost.name
//            textprice.text = currentPost.price
//            textView.text = currentPost.like
//            numshare.text = currentPost.share
//            description.text = currentPost.time
//            Glide.with(this.root.context).load(currentPost.postImgUrl).into(photo)
            Glide.with(this.root.context).load(currentPost.postImgUrl).into(photo1)
        }
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return when(items[position].type){
            HomeItemType.TYPE_POST -> VIEW_TYPE_POST
            HomeItemType.TYPE_CATEGORY -> TODO()
            HomeItemType.TYPE_SEARCH -> TODO()
        }
    }


    abstract class BaseHomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    class PostViewHolder(itemView: View) : BaseHomeViewHolder(itemView){
        val binding = ItemBinding.bind(itemView)
    }
    class CategoryViewHolder(itemView: View) : BaseHomeViewHolder(itemView){
        val binding = ItemCategoriesListBinding.bind(itemView)
    }


    companion object {

        private const val VIEW_TYPE_POST = 1
        private const val VIEW_TYPE_CATEGORY = 2
        private const val VIEW_TYPE_SEARCH = 2

    }
}