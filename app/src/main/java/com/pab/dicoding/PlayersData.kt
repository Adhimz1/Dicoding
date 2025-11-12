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
        "Enzo Jeremías Fernández adalah seorang pemain sepak bola profesional Argentina yang bermain sebagai gelandang tengah untuk klub Liga Utama Inggris Chelsea dan tim nasional Argentina. Ia dikenal karena jangkauan umpan, visi bermain, dan tingkat kerjanya yang tinggi di lapangan.",
        "Reece James adalah seorang pemain sepak bola profesional Inggris yang bermain sebagai bek kanan untuk klub Liga Utama Inggris Chelsea, di mana ia menjadi kapten, dan tim nasional Inggris. Ia dikenal luas karena kekuatan fisiknya, kemampuan crossing yang luar biasa, dan kontribusi defensif yang solid.",
        "Cole Jermaine Palmer adalah seorang pemain sepak bola profesional Inggris yang bermain sebagai gelandang serang atau pemain sayap untuk klub Liga Utama Inggris Chelsea dan tim nasional Inggris. Ia adalah pemain yang sangat kreatif dengan kemampuan dribbling yang luar biasa dan insting mencetak gol yang tajam.",
        "Estevão Willian Almeida de Oliveira Gonçalves, dikenal sebagai Estevão Willian atau Messinho, adalah seorang pemain sepak bola profesional Brazil yang bermain sebagai pemain sayap untuk Palmeiras. Ia dianggap sebagai salah satu talenta muda paling menjanjikan di dunia sepak bola.",
        "Wesley Tidjan Fofana adalah seorang pemain sepak bola profesional Perancis yang bermain sebagai bek tengah untuk klub Liga Utama Inggris Chelsea. Ia dikenal karena kecepatan, kekuatan, dan kemampuan membaca permainan yang sangat baik untuk seorang bek.",
        "Pedro Lomba Neto adalah seorang pemain sepak bola profesional Portugal yang bermain sebagai pemain sayap untuk klub Liga Utama Inggris Wolverhampton Wanderers dan tim nasional Portugal. Ia dikenal dengan akselerasi cepat, kemampuan menggiring bola melewati lawan, dan menciptakan peluang.",
        "Moisés Isaac Caicedo Corozo adalah seorang pemain sepak bola profesional Ekuador yang bermain sebagai gelandang bertahan untuk klub Liga Utama Inggris Chelsea dan tim nasional Ekuador. Ia adalah gelandang yang tangguh, hebat dalam tekel, dan memiliki stamina yang luar biasa.",
        "Benoît Ntambue Badiashile Mukinayi adalah seorang pemain sepak bola profesional Perancis yang bermain sebagai bek tengah untuk klub Liga Utama Inggris Chelsea dan tim nasional Perancis. Ia adalah seorang bek yang tinggi dan tenang, serta sangat baik dalam membangun serangan dari belakang.",
        "João Pedro Junqueira de Jesus adalah seorang pemain sepak bola profesional Brazil yang bermain sebagai penyerang untuk klub Liga Utama Inggris Brighton & Hove Albion dan tim nasional Brazil. Ia adalah penyerang yang dinamis dengan pergerakan cerdas, teknik tinggi, dan kemampuan penyelesaian akhir yang klinis.",
        "Jamie Jermaine Bynoe-Gittens adalah seorang pemain sepak bola profesional Inggris yang bermain sebagai pemain sayap untuk klub Bundesliga Borussia Dortmund. Ia adalah pemain muda yang sangat menarik, dikenal karena kecepatan, kreativitas, dan kemampuan dribbling satu lawan satu."
    )

    // --- KODE DENGAN URUTAN YANG SUDAH DIPERBAIKI TOTAL ---
    private val playerPhotos = intArrayOf(
        R.drawable.enzo_fernandez,
        R.drawable.reece_james,
        R.drawable.cole_palmer, // <- Diperbaiki
        R.drawable.estevao_willian,
        R.drawable.wesley_fofana,
        R.drawable.pedro_neto,
        R.drawable.moises_caicedo,
        R.drawable.benoit_badiashile,
        R.drawable.joao_pedro,
        R.drawable.jamie_gittens  // <- Diperbaiki
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