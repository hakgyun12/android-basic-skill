package org.techtown.mango_contents_app

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import org.w3c.dom.Text

class ViewActivity : AppCompatActivity() {

    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        auth = Firebase.auth

        val webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl(intent.getStringExtra("url").toString())

        val database = Firebase.database
        val myBookmarkRef = database.getReference("bookmark_ref")

        val url = intent.getStringExtra("url").toString()
        val title = intent.getStringExtra("title").toString()
        val imageUrl = intent.getStringExtra("imageUrl").toString()

        val saveText = findViewById<TextView>(R.id.saveText)
        saveText.setOnClickListener {
            myBookmarkRef
                .child(auth.currentUser!!.uid)
                .push()
                .setValue(ContentsModel(url, imageUrl, title))
        }
    }
}