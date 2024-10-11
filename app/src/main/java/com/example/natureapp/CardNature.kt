package com.example.natureapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.example.natureapp.ui.theme.NatureAppTheme


@Composable
fun CardNature(imageUrl: String, header: String, textstr: String) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable {}
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column {
            AsyncImage(
                model = imageUrl,
                contentDescription = "Imagen desde URL",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(top = 10.dp),
                //Escalar imagen al contenedor
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(text = header, fontSize = 30.sp, fontWeight = FontWeight.Bold)
                Text(text = textstr)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardNaturePreview() {
    NatureAppTheme {
        // Ejemplo usando una URL de imagen pública
        CardNature(imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/9f/Amazona_parrots_collage.jpg",
            "Amazonas",
            "La Selva Amazónica es la mayor selva tropical del mundo, conocida por su increíble biodiversidad y su papel crucial en la regulación del clima global."
        )
    }
}