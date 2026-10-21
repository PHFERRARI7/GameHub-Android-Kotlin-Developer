package br.com.pedroferrari.gamehub.data

import br.com.pedroferrari.gamehub.model.Game
import br.com.pedroferrari.gamehub.model.Platform

val games = listOf(
    Game(
        title = "Cyberpunk 2077",
        platforms = listOf(Platform.PC, Platform.PLAYSTATION, Platform.XBOX),
        genero = "RPG",
        nota = 4.7,
        imagemUrl = "https://cdn.akamai.steamstatic.com/steam/apps/1091500/header.jpg",
        featured = true
    ),
    Game(
        title = "Hollow Knight",
        platforms = listOf(Platform.PC, Platform.NINTENDO, Platform.PLAYSTATION, Platform.XBOX),
        genero = "Metroidvania",
        nota = 4.9,
        imagemUrl = "https://cdn.akamai.steamstatic.com/steam/apps/367520/header.jpg",
        featured = true
    ),
    Game(
        title = "Stardew Valley",
        platforms = listOf(Platform.PC, Platform.NINTENDO, Platform.PLAYSTATION, Platform.XBOX),
        genero = "Simulação",
        nota = 4.8,
        imagemUrl = "https://cdn.akamai.steamstatic.com/steam/apps/413150/header.jpg"
    ),
    Game(
        title = "Baldur's Gate 3",
        platforms = listOf(Platform.PC, Platform.PLAYSTATION, Platform.XBOX),
        genero = "RPG",
        nota = 4.9,
        imagemUrl = "https://cdn.akamai.steamstatic.com/steam/apps/1086940/header.jpg",
        featured = true
    ),
    Game(
        title = "Portal 2",
        platforms = listOf(Platform.PC, Platform.XBOX),
        genero = "Quebra-cabeça",
        nota = 4.9,
        imagemUrl = "https://cdn.akamai.steamstatic.com/steam/apps/620/header.jpg"
    ),
    Game(
        title = "ELDEN RING",
        platforms = listOf(Platform.PC, Platform.PLAYSTATION, Platform.XBOX),
        genero = "RPG de ação",
        nota = 4.8,
        imagemUrl = "https://cdn.akamai.steamstatic.com/steam/apps/1245620/header.jpg",
        featured = true
    )
)