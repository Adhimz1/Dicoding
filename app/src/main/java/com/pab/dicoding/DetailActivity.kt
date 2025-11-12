package com.pab.dicoding

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bumptech.glide.Glide
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PLAYER = "extra_player"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val toolbar: Toolbar = findViewById(R.id.toolbar_detail)
        setSupportActionBar(toolbar)
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

            val fabShare: FloatingActionButton = findViewById(R.id.fab_share)
            fabShare.setOnClickListener {
                val shareIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "Check out this player: ${player.name}\n\n${player.description}")
                    type = "text/plain"
                }
                startActivity(Intent.createChooser(shareIntent, "Share via"))
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}