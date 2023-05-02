package com.example.superheroes

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import data.Hero

class HeroesScreen {
}

@Composable
fun HeroesScreen(hero : Hero) {
    Card(elevation = CardDefaults.cardElevation(2.dp),
        modifier = Modifier.clip(RoundedCornerShape(16.dp))
        ) {
        Row {//row for text on the left and image on the right
        HeroInfo(hero.nameRes, hero.descriptionRes)
        Spacer(Modifier.size(16.dp))
        HeroIcon(hero.imageRes)
        }
    }
}

@Composable
fun HeroIcon (@DrawableRes heroIcon : Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(heroIcon),
        contentDescription = null,
        Modifier
            .size(72.dp)
            .clip(RoundedCornerShape(8.dp))
            .padding(8.dp)

    )
}

@Composable
fun HeroInfo(@StringRes name : Int,@StringRes descr : Int, modifier: Modifier = Modifier) {
    Column() {
        Text(text = name.toString())
        Text(text = descr.toString())
    }
}