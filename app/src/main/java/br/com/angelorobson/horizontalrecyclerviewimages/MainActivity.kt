package br.com.angelorobson.horizontalrecyclerviewimages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.angelorobson.horizontalrecyclerviewimageslibrary.ImageClickListener
import br.com.angelorobson.horizontalrecyclerviewimageslibrary.model.ItemImage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        library.setImages(getImages(), object : ImageClickListener {
            override fun onclick(image: ItemImage, position: Int) {

            }

            override fun onLongClick(image: ItemImage, position: Int) {

            }

        })
    }

    private fun getImages(): List<ItemImage> {
        return listOf(
            ItemImage(
                1,
                "HP",
                "https://static.netshoes.com.br/r0.0.390.13/netshoesbr/images/share.png"
            ),
            ItemImage(
                2,
                "Zoom",
                "https://static.netshoes.com.br/r0.0.390.13/netshoesbr/images/share.png"
            ),
            ItemImage(
                3,
                "Netshoes",
                "https://static.netshoes.com.br/r0.0.390.13/netshoesbr/images/share.png"
            ),
            ItemImage(
                4,
                "Adidas",
                "https://static.netshoes.com.br/r0.0.390.13/netshoesbr/images/share.png"
            )
        )

    }
}
