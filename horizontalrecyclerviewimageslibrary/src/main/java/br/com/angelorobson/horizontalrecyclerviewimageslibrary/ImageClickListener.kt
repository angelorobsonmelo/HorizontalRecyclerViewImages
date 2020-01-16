package br.com.angelorobson.horizontalrecyclerviewimageslibrary

import br.com.angelorobson.horizontalrecyclerviewimageslibrary.model.ItemImage

interface ImageClickListener {
    fun onclick(
        image: ItemImage,
        position: Int
    )

    fun onLongClick(image: ItemImage, position: Int)
}