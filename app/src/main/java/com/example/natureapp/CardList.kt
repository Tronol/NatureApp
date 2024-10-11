package com.example.natureapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable


@Composable
fun NatureCardsList(modifier: androidx.compose.ui.Modifier) {
    LazyColumn(

    ) {
        item {
            CardNature(
                imageUrl = "https://cdn.pixabay.com/photo/2014/08/15/11/29/beach-418742_1280.jpg",
                header = "Navagio Beach",
                textstr = "Conocida como la Playa del Naufragio, es famosa por su belleza escénica y aguas turquesas."
            )
        }
        item {
            CardNature(
                imageUrl = "https://cdn.pixabay.com/photo/2024/05/15/12/31/lake-8763490_1280.jpg",
                header = "Lago Thun en Merligen",
                textstr = "Un hermoso lago suizo rodeado de montañas, ideal para actividades al aire libre y paseos en barco."
            )
        }
        item {
            CardNature(
                imageUrl = "https://cdn.pixabay.com/photo/2015/04/23/22/01/mountains-736886_1280.jpg",
                header = "Alpes Suizos",
                textstr = "Famosos por sus impresionantes picos nevados, ofrecen paisajes espectaculares y oportunidades para esquiar."
            )
        }
        item {
            CardNature(
                imageUrl = "https://cdn.pixabay.com/photo/2022/08/15/09/14/koyasan-temple-7387445_1280.jpg",
                header = "Templo de Koyasan",
                textstr = "Un antiguo templo en Japón, conocido por su arquitectura tradicional y su atmósfera tranquila."
            )
        }
    }
}