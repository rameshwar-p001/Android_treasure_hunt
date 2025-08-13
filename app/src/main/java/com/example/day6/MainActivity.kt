//package com.example.day6
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Button
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.day6.ui.theme.Day6Theme
//import kotlin.random.Random
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            Surface(
//                modifier = Modifier.fillMaxSize(),
//                color = MaterialTheme.colorScheme.background
//            ) {
//                Day6()
//            }
//        }
//
//    }
//    @Composable
//    fun Day6(){
//        val hunt= remember{ mutableStateOf(0)}
//        val direction=remember { mutableStateOf("north") }
//
//        Column {
//            Text(text = "treasuers found ${hunt.value}")
//            Text(text = "direction ${direction.value}")
//            Button(onClick = {
//                direction.value="East"
//                if(Random.nextBoolean()){
//                    hunt.value +=1
//                }
//            }){
//                Text(text = "Sail East")
//            }
////
//            Button(onClick = {
//                direction.value="West"
//                if(Random.nextBoolean()){
//                    hunt.value +=1
//                }
//            }){
//                Text(text = "Sail west")
//            }
//
////
//            Button(onClick = {
//                direction.value="North"
//                if(Random.nextBoolean()){
//                    hunt.value +=1
//                }
//            }){
//                Text(text = "Sail north")
//            }
////
//            Button(onClick = {
//                direction.value="South"
//                if(Random.nextBoolean()){
//                    hunt.value +=1
//                }
//            }){
//                Text(text = "Sail South")
//            }
//
//        }
//    }
//}
//


package com.example.day6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Day6()
            }
        }
    }

    @Composable
    fun Day6() {
        var hunt by remember { mutableStateOf(0) }   //by we can use by replace of "="  and we can't use "variable.value"
        val direction = remember { mutableStateOf("north") }
        val stormOrTreasure = remember { mutableStateOf("") } // ✅ new variable

        Column ( modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Text(text = "Treasures found: ${hunt}")
            Text(text = "Direction: ${direction.value}")
            Text(text = stormOrTreasure.value) // ✅ show feedback

            // East
            Button(onClick = {
                direction.value = "East"
                if (Random.nextBoolean()) {
                    hunt += 1
                    stormOrTreasure.value = "Found a Treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text(text = "Sail East")
            }

            // West
            Button(onClick = {
                direction.value = "West"
                if (Random.nextBoolean()) {
                    hunt += 1
                    stormOrTreasure.value = "Found a Treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text(text = "Sail West")
            }

            // North
            Button(onClick = {
                direction.value = "North"
                if (Random.nextBoolean()) {
                    hunt += 1
                    stormOrTreasure.value = "Found a Treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text(text = "Sail North")
            }

            // South
            Button(onClick = {
                direction.value = "South"
                if (Random.nextBoolean()) {
                    hunt += 1
                    stormOrTreasure.value = "Found a Treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text(text = "Sail South")
            }
        }

    }
}
