package com.example.superheroes

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.superheroes.ui.theme.SuperheroesTheme
import data.Hero
import model.HeroesRepository
import model.HeroesRepository.heroes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HeroesApp()
                }
            }
        }
    }
}



@Composable
fun HeroesApp() {

    LazyColumn {
        items(heroes) {
            HeroesScreen(hero = it)
        }
    }

    LazyColumn {
        items(heroes) {
            multi(2,5)
        }
    }

}

//@Preview(showBackground = true)
//@Composable
//fun HeroesItem() {
//    SuperheroesTheme {
//
//    }
//}

fun multi (param1 : Int, param2 : Int) : Int {
    return param1*param2
}