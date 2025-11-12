package com.pab.dicoding

object PlayersData {
    private val playerNames = arrayOf(
        "Enzo Fernández",
        "Reece James",
        "Cole Palmer",
        "Estevao Willian",
        "Wesley Fofana",
        "Pedro Neto",
        "Moisés Caicedo",
        "Benoît Badiashile",
        "Joao Pedro",
        "Jamie Gittens"
    )

    // --- PERUBAHAN DI SINI ---
    private val playerOverviews = arrayOf(
        "Seorang gelandang tengah Argentina, juara dunia yang dikenal dengan jangkauan umpannya...",
        "Seorang bek kanan Inggris dan kapten Chelsea, dikenal dengan kemampuan crossing-nya...",
        "Seorang gelandang serang atau pemain sayap dari Inggris, pemain kreatif dengan insting mencetak gol...",
        "Seorang pemain sayap bertalenta tinggi dari Brazil, dikenal karena skill, kelincahan, dan kreativitasnya...",
        "Seorang bek tengah dari Perancis yang dikenal dengan kecepatan, kekuatan, dan posisi bertahannya...",
        "Seorang pemain sayap dari Portugal, dikenal karena akselerasi, dribbling, dan kemampuannya menciptakan peluang...",
        "Seorang gelandang bertahan dari Ekuador. Gelandang tangguh dengan tekel dan intersep yang hebat...",
        "Seorang bek tengah dari Perancis. Bek jangkung dan tenang yang pandai menguasai bola...",
        "Seorang penyerang dari Brazil. Penyerang dinamis dengan pergerakan, teknik, dan penyelesaian akhir yang hebat...",
        "Seorang pemain sayap dari Inggris. Pemain muda menarik yang dikenal dengan kecepatan dan kreativitasnya..."
    )

    private val playerDescriptions = arrayOf(
        "Seorang gelandang tengah Argentina, juara dunia yang dikenal dengan jangkauan umpannya...",
        "Seorang bek kanan Inggris dan kapten Chelsea, dikenal dengan kemampuan crossing-nya...",
        "Seorang gelandang serang atau pemain sayap dari Inggris, pemain kreatif dengan insting mencetak gol...",
        "Seorang pemain sayap bertalenta tinggi dari Brazil, dikenal karena skill, kelincahan, dan kreativitasnya...",
        "Seorang bek tengah dari Perancis yang dikenal dengan kecepatan, kekuatan, dan posisi bertahannya...",
        "Seorang pemain sayap dari Portugal, dikenal karena akselerasi, dribbling, dan kemampuannya menciptakan peluang...",
        "Seorang gelandang bertahan dari Ekuador. Gelandang tangguh dengan tekel dan intersep yang hebat...",
        "Seorang bek tengah dari Perancis. Bek jangkung dan tenang yang pandai menguasai bola...",
        "Seorang penyerang dari Brazil. Penyerang dinamis dengan pergerakan, teknik, dan penyelesaian akhir yang hebat...",
        "Seorang pemain sayap dari Inggris. Pemain muda menarik yang dikenal dengan kecepatan dan kreativitasnya..."
    )

    private val playerPhotos = intArrayOf(
        R.drawable.enzo_fernandez,
        R.drawable.reece_james,
        R.drawable.cole_palmer,
        R.drawable.estevao_willian,
        R.drawable.wesley_fofana,
        R.drawable.pedro_neto,
        R.drawable.moises_caicedo,
        R.drawable.benoit_badiashile,
        R.drawable.joao_pedro,
        R.drawable.jamie_gittens
    )

    val listData: ArrayList<Player>
        get() {
            val list = arrayListOf<Player>()
            for (position in playerNames.indices) {
                val player = Player(
                    playerNames[position],
                    playerDescriptions[position],
                    playerPhotos[position],
                    playerOverviews[position]
                )
                list.add(player)
            }
            return list
        }
}