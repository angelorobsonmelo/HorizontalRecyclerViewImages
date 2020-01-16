package br.com.angelorobson.horizontalrecyclerviewimageslibrary.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.angelorobson.horizontalrecyclerviewimageslibrary.ImageClickListener
import br.com.angelorobson.horizontalrecyclerviewimageslibrary.R
import br.com.angelorobson.horizontalrecyclerviewimageslibrary.ViewHolder
import br.com.angelorobson.horizontalrecyclerviewimageslibrary.extensions.inflate
import br.com.angelorobson.horizontalrecyclerviewimageslibrary.model.ItemImage
import kotlinx.android.synthetic.main.item.view.*

class Adapter(
    private var itemImages: List<ItemImage>
) : RecyclerView.Adapter<ViewHolder>() {
    private var imageClickListener: ImageClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedViewHold = parent.inflate(R.layout.item, false)
        return ViewHolder(
            inflatedViewHold
        )
    }

    override fun getItemCount(): Int = itemImages.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(itemImages[position])

        holder.itemView.imageView.setOnClickListener {
            imageClickListener?.apply {
                onclick(itemImages[position], position)
            }
        }

        holder.itemView.imageView.setOnLongClickListener {
            imageClickListener?.apply {
                onLongClick(itemImages[position], position)
            }
            true
        }
    }

    fun update(
        itemImages: List<ItemImage>,
        imageClickListener: ImageClickListener
    ) {
        this.itemImages = itemImages
        this.imageClickListener = imageClickListener
        notifyDataSetChanged()
    }


}