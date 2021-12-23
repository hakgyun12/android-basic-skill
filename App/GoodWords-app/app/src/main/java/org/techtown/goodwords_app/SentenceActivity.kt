package org.techtown.goodwords_app

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import org.techtown.goodwords_app.databinding.ActivityMainBinding

class SentenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("검정화면면에 대충 흰글 쓰면 명언같다")
        sentenceList.add("사람에게 하나의 입과 두 개의 귀가 있는 것은 말하기보다 듣기를 두 배로 하라는 뜻이다")
        sentenceList.add("대학살에도 생존자는 늘 있기 마련이다. 다른 곳에 없다면 승자 중에 있다. 대학살의 대상은 다 죽는다")
        sentenceList.add("친구를 용서하는 것보다 적을 용서하는 것이 더 쉽다.")
        sentenceList.add("사랑은 눈 먼 것이 아니다. 더 적게 보는 게 아니라 더 많이 본다. 다만 더 많이 보이기 때문에, 더 적게 보려고 하는 것이다.")
        sentenceList.add("아이들은 부모를 사랑함으로써 출발하고 나이가 들면서 부모를 평가하며 때때로 부모를 용서하기도 한다.")
        sentenceList.add("설탕이 없다는 설탕 과자를 먹어야 하는 세상에선 살고 싶지 않아.")

        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter
    }
}