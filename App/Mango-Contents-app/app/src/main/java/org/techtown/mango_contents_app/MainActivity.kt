package org.techtown.mango_contents_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
             ContentsModel(
                 "https://www.mangoplate.com/restaurants/0b91aGscz-",
                 "https://mp-seoul-image-production-s3.mangoplate.com/1846447_1637414053492150.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                 "상춘재"
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
                "https://www.mangoplate.com/restaurants/0b91aGscz-",
                "https://mp-seoul-image-production-s3.mangoplate.com/1846447_1637414053492150.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "상춘재"
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerview.adapter = rvAdapter
        recyclerview.layoutManager = GridLayoutManager(this, 2)
    }
}