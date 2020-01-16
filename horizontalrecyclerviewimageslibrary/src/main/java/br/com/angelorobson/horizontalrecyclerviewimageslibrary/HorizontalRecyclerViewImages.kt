package br.com.angelorobson.horizontalrecyclerviewimageslibrary

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.angelorobson.horizontalrecyclerviewimageslibrary.adapter.Adapter
import br.com.angelorobson.horizontalrecyclerviewimageslibrary.model.ItemImage
import kotlinx.android.synthetic.main.images_recycler_view.view.*

class HorizontalRecyclerViewImages(context: Context, attrs: AttributeSet) :
    LinearLayout(context, attrs) {

    private val mAdapter =
        Adapter(
            mutableListOf()
        )

    init {
        init()
    }

    private fun init() {
        val view = LayoutInflater.from(context).inflate(R.layout.images_recycler_view, null)
        this.addView(view)
        val recyclerView = view.imagesRecyclerView

        recyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = mAdapter
        }
    }

    fun setImages(itemImages: List<ItemImage>, imageClickListener: ImageClickListener) {
        mAdapter.update(itemImages, imageClickListener)
    }

}