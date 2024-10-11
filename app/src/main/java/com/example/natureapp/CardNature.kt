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
        CardNature(imageUrl = "https://cdn.pixabay.com/photo/2024/09/05/08/24/mountain-9024209_1280.jpg",
            "Muncho Lake Canada",
            "Este pintoresco lago se extiende aproximadamente 12 kilómetros (alrededor de 7.5 millas) y es conocido por su notable color verde jade, que se debe a la oxidación de cobre que se filtra de la roca circundante."
        )
    }
}