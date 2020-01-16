package br.com.angelorobson.horizontalrecyclerviewimageslibrary

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import br.com.angelorobson.horizontalrecyclerviewimageslibrary.model.ItemImage
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item.view.*

class ViewHolder(private val v: View) : RecyclerView.ViewHolder(v) {

    fun bindItem(
        itemImage: ItemImage
    ) {
        val imageView = itemView.imageView
        val name = itemView.title

        name.text = itemImage.title

        Glide.with(v).load(itemImage.imageUrl)
            .apply(RequestOptions.circleCropTransform())
            .into(imageView)


    }
}