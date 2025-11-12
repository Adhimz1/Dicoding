package com.pab.dicoding

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Player(
    val name: String,
    val description: String,
    val photo: Int, // Kita gunakan Int untuk ID dari drawable
    val overview: String // Deskripsi singkat untuk halaman utama
) : Parcelable