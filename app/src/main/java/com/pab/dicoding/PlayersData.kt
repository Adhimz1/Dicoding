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
        "Midfielder - Argentina",
        "Right-Back - England",
        "Winger - Brazil",
        "Midfielder - England",
        "Centre-Back - France",
        "Winger - Portugal",
        "Defensive Midfielder - Ecuador",
        "Centre-Back - France",
        "Forward - Brazil",
        "Winger - England"
    )

    private val playerDescriptions = arrayOf(
        "Enzo Jeremías Fernández is an Argentine professional footballer who plays as a central midfielder for Premier League club Chelsea and the Argentina national team. A World Cup winner known for his passing range and work rate.",
        "Reece James is an English professional footballer who plays as a right-back for Premier League club Chelsea, for which he is captain, and the England national team. He is known for his excellent crossing ability and physical strength.",
        "Cole Jermaine Palmer is an English professional footballer who plays as an attacking midfielder or winger for Premier League club Chelsea and the England national team. He is a creative player with a keen eye for goal.",
        "Estevão Willian Almeida de Oliveira Gonçalves is a Brazilian professional footballer who plays as a winger for Premier League club Chelsea and the Brazil national team. He is a highly skilled young talent known for his flair, agility, and creativity on the ball.",
        "Wesley Tidjan Fofana is a French professional footballer who plays as a centre-back for Premier League club Chelsea and the France national team. He is known for his pace, strength, and excellent defensive positioning.",
        "Pedro Lomba Neto is a Portuguese professional footballer who plays as a winger for Premier League club Chelsea and the Portugal national team. He is known for his quick acceleration, dribbling, and ability to create scoring chances.",
        "Moisés Isaac Caicedo Corozo is an Ecuadorian professional footballer who plays as a defensive midfielder for Premier League club Chelsea and the Ecuador national team. He is a robust midfielder with great tackling and interception skills.",
        "Benoît Ntambue Badiashile Mukinayi is a French professional footballer who plays as a centre-back for Premier League club Chelsea and the France national team. A tall and composed defender, good with the ball at his feet.",
        "João Pedro Junqueira de Jesus is a Brazilian professional footballer who plays as a forward for Premier League club Chelsea and the Brazil national team. He is a dynamic attacker with great movement, technique, and finishing ability.",
        "Jamie Jermaine Bynoe-Gittens is an English professional footballer who plays as a winger for Premier League club Chelsea and the England national team. He is an exciting young player known for his pace, creativity, and one-on-one dribbling skills."
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