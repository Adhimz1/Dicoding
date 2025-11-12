package com.pab.dicoding

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PLAYER = "extra_player"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        if (player != null) {
            val imgPlayerPhoto: ImageView = findViewById(R.id.img_player_photo)
            val tvPlayerName: TextView = findViewById(R.id.tv_player_name)
            val tvPlayerDescription: TextView = findViewById(R.id.tv_player_description)

            Glide.with(this)
                .load(player.photo)
                .into(imgPlayerPhoto)

            tvPlayerName.text = player.name
            tvPlayerDescription.text = player.description
            supportActionBar?.title = player.name
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}