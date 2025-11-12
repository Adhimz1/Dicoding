package com.pab.dicoding

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.pab.dicoding.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_PLAYER = "extra_player"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val player = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra(EXTRA_PLAYER, Player::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(EXTRA_PLAYER)
        }

        if (player != null) {
            binding.collapsingToolbar.title = player.name

            Glide.with(this)
                .load(player.photo)
                .into(binding.imgPlayerPhoto)

            // Baris kode untuk mengisi nama pemain sudah dihapus
            binding.tvPlayerDescription.text = player.description

            binding.fabShare.setOnClickListener {
                // Mengubah teks share ke Bahasa Indonesia
                val shareText = "Lihat profil pemain Chelsea: ${player.name}\n\n${player.overview}"

                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText)

                startActivity(Intent.createChooser(shareIntent, "Bagikan via"))
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}