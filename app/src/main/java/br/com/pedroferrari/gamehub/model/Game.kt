package br.com.pedroferrari.gamehub.model

data class Game(
    val title: String,
    val platforms: List<Platform>,
    val genero: String,
    val nota: Double,
    val imagemUrl: String,
    val featured: Boolean = false
)