package com.example.superheroes

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import data.Hero

class HeroesScreen {
}

@Composable
fun HeroesScreen(hero : Hero) {
    Card(elevation = CardDefaults.cardElevation(2.dp),
        modifier = Modifier
            .padding(8.dp, 15.dp, 8.dp)
    ) {
        Row (
            Modifier
                .padding(16.dp)
                .height(72.dp)
                .fillMaxWidth()
                //.weight(1f)
                ) {//row for text on the left and image on the right
        HeroInfo(hero.nameRes, hero.descriptionRes, Modifier.weight(1f))
        Spacer(Modifier.width(16.dp))
        HeroIcon(hero.imageRes, Modifier.requiredSize(72.dp))
        }
    }
}

@Composable
fun HeroIcon (@DrawableRes heroIcon : Int, modifier: Modifier = Modifier) {
    Image(modifier = Modifier,
        painter = painterResource(heroIcon),
        contentDescription = null,
        alignment = Alignment.CenterEnd,
        //contentScale = ContentScale.FillWidth
    )
}

@Composable
fun HeroInfo(@StringRes name : Int,@StringRes descr : Int, modifier: Modifier = Modifier) {
    Column(modifier = modifier)
    {
        Text(stringResource(id = name),
            style = MaterialTheme.typography.displaySmall
        )
        Text(stringResource(id = descr),
            style = MaterialTheme.typography.bodyLarge,
            softWrap = true
        )
    }
}