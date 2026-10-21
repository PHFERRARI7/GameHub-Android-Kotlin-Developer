package br.com.pedroferrari.gamehub.ui.components

import android.R
import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.pedroferrari.gamehub.model.Game
import br.com.pedroferrari.gamehub.model.Platform
import br.com.pedroferrari.gamehub.ui.theme.GameHubTheme
import coil3.compose.AsyncImage
import java.util.Locale

@Composable
fun GameListItem (game: Game) {

    Card(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = game.imagemUrl,
                contentDescription = "Capa de ${game.title}",
                modifier = Modifier
                    .size(width = 116.dp, height = 82.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = game.title,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    text = "Plataformas: ${game.platforms.joinToString { it.label }}",
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.bodySmall
                )

                Text(
                    text = "Gênero: ${game.genero}",
                    style = MaterialTheme.typography.bodySmall
                )

                Row(verticalAlignment = Alignment.CenterVertically) {

                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Nota",
                        tint = Color(0xFFFFc107),
                        modifier = Modifier.size(18.dp)
                    )

                    Spacer(Modifier.width(4.dp))
                    Text(String.format(Locale.US,"%.1f", game.nota))

                }



            }

        }
    }


}


@Preview
@Composable
private fun GameListItemPreview() {
    GameHubTheme() {
        GameListItem(
            Game(
            title = "Cyberpunk 2077",
            platforms = listOf(Platform.PC, Platform.PLAYSTATION, Platform.XBOX),
            genero = "RPG",
            nota = 4.7,
            imagemUrl = "https://cdn.akamai.steamstatic.com/steam/apps/1091500/header.jpg",
            featured = true
        )
        )
    }
}