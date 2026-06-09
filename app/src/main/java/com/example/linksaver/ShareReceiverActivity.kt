package com.example.linksaver

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import java.io.File

class ShareReceiverActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val url = intent.getStringExtra(Intent.EXTRA_TEXT)

        if (!url.isNullOrEmpty()) {
            val file = File(getExternalFilesDir(null), "links.txt")
            file.appendText(url + "\n")
        }

        finish()
    }
}
