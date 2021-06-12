package com.example.monstarchalleng.ui.categories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.monstarchalleng.R
import com.example.monstarchalleng.databinding.ItemCategoryBinding
import com.example.monstarchalleng.ui.HomeActionsListener
import com.ibareq.nestedrecyclerviewsample.data.domain.Category
import java.lang.Exception

class CategoriesAdapter(private val items: List<Category>, listener: HomeActionsListener) : RecyclerView.Adapter<CategoriesAdapter.BaseCategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseCategoryViewHolder {
        return when(viewType){
            VIEW_TYPE_CATEGORY -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
                CategoryViewHolder(view)
            }
            else -> throw Exception("UNKNOWN VIEW TYPE")
        }
    }

    override fun onBindViewHolder(holder: BaseCategoryViewHolder, position: Int) {
        when(holder){
            is CategoryViewHolder -> bindStory(holder, position)
        }
    }

    private fun bindStory(holder: CategoryViewHolder, position: Int){
        val currentCategory = items[position]
        holder.binding.apply{
            Glide.with(this.root.context).load(currentCategory.ImgUrl).into(icon)
            title.text = currentCategory.description
        }
    }

    override fun getItemViewType(position: Int): Int {
        return VIEW_TYPE_CATEGORY
    }

    override fun getItemCount() = items.size

    abstract class BaseCategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    class CategoryViewHolder(itemView: View) : BaseCategoryViewHolder(itemView){
        val binding = ItemCategoryBinding.bind(itemView)
    }

    companion object{
        private const val VIEW_TYPE_CATEGORY = 1
    }
}