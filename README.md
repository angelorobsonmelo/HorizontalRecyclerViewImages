# Horizontal Recycler view images

![screenshot-1579193341604](https://user-images.githubusercontent.com/11642459/72545987-bacd6a80-3868-11ea-8657-c84998cbe43d.jpg)

Step 1. Add the JitPack repository to your build file

	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
       implementation 'com.github.angelorobsonmelo:HorizontalRecyclerViewImages:1.0'
}


Step 3. Add custom style in your layout file

	<br.com.angelorobson.horizontalrecyclerviewimageslibrary.HorizontalRecyclerViewImages
        android:id="@+id/horizontalRecyclerViewImages"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
  
Step 4. Inside Kotlin file

   class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        horizontalRecyclerViewImages.setImages(getImages(), object : ImageClickListener {
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
    

