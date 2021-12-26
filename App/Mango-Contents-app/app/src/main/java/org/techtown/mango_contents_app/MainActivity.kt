package org.techtown.mango_contents_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookmarkButton = findViewById<TextView>(R.id.bookmarkBtn)
        bookmarkButton.setOnClickListener{
            val intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        items.add(
             ContentsModel(
                 "https://www.mangoplate.com/restaurants/0b91aGscz-",
                 "https://mp-seoul-image-production-s3.mangoplate.com/1846447_1637414053492150.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                 "상춘재"
             )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/UIwMHXOYSD",
                "https://mp-seoul-image-production-s3.mangoplate.com/210894/306463_1463237854790_3167?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "엄지네포장마차"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/-g2I6md0eT",
                "https://mp-seoul-image-production-s3.mangoplate.com/699253_1563963954430535.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "양지말화로구이"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/0ZBL14x1k0Re",
                "https://mp-seoul-image-production-s3.mangoplate.com/411159/1013171_1600765976860_19391?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "바위파스타바"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/UifwVuxRDTSo",
                "https://mp-seoul-image-production-s3.mangoplate.com/447614/1656652_1617238835091_24559?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "회현식당"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/AtNqVtENf9",
                "https://mp-seoul-image-production-s3.mangoplate.com/2091186_1639811830113678.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "부촌육회"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/0b91aGscz-",
                "https://mp-seoul-image-production-s3.mangoplate.com/1846447_1637414053492150.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "상춘재"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/UIwMHXOYSD",
                "https://mp-seoul-image-production-s3.mangoplate.com/210894/306463_1463237854790_3167?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "엄지네포장마차"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/-g2I6md0eT",
                "https://mp-seoul-image-production-s3.mangoplate.com/699253_1563963954430535.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "양지말화로구이"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/0ZBL14x1k0Re",
                "https://mp-seoul-image-production-s3.mangoplate.com/411159/1013171_1600765976860_19391?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "바위파스타바"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/UifwVuxRDTSo",
                "https://mp-seoul-image-production-s3.mangoplate.com/447614/1656652_1617238835091_24559?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "회현식당"
            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/AtNqVtENf9",
                "https://mp-seoul-image-production-s3.mangoplate.com/2091186_1639811830113678.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "부촌육회"
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(this, items)
        recyclerview.adapter = rvAdapter

        rvAdapter.itemClick = object: RVAdapter.ItemClick{
            override fun onClick(view: View, position: Int){

                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url", items[position].url)
                intent.putExtra("title", items[position].titleText)
                intent.putExtra("imageUrl", items[position].imageUrl)
                startActivity(intent)
            }

        }
        recyclerview.layoutManager = GridLayoutManager(this, 2)
    }
}