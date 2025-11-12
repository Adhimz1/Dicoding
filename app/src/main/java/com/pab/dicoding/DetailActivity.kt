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

        // Langkah 1: Atur Toolbar kustom Anda sebagai ActionBar aplikasi
        setSupportActionBar(binding.toolbarDetail)
        // Aktifkan tombol panah kembali (Up Button)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val player = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra(EXTRA_PLAYER, Player::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(EXTRA_PLAYER)
        }

        if (player != null) {
            // Mengatur judul pada CollapsingToolbarLayout, bukan ActionBar
            binding.collapsingToolbar.title = player.name

            // Memuat gambar ke ImageView di dalam CollapsingToolbarLayout
            Glide.with(this)
                .load(player.photo)
                .into(binding.imgPlayerPhoto)

            // Mengisi konten di bawahnya
            binding.tvPlayerName.text = player.name
            binding.tvPlayerDescription.text = player.description

            // =============================================================
            // LANGKAH 2: MENAMBAHKAN LOGIKA PADA TOMBOL SHARE (FAB)
            // =============================================================
            binding.fabShare.setOnClickListener {
                // Membuat teks yang akan dibagikan
                val shareText = "Lihat profil pemain Chelsea: ${player.name}\n\n${player.overview}"

                // Membuat Intent untuk aksi 'SEND'
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain" // Tipe konten adalah teks biasa
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText)

                // Memulai activity chooser untuk menampilkan pilihan aplikasi
                startActivity(Intent.createChooser(shareIntent, "Bagikan via"))
            }
            // =============================================================
        }
    }

    // Fungsi ini dibutuhkan agar tombol panah kembali berfungsi dengan benar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}