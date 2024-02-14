package com.example.week4

import android.os.Bundle
import com.example.week4.ui.theme.Week4Theme
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(9.dp)
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "My title",
            style = MaterialTheme.typography.headlineMedium,
            modifier = appModifier
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = appModifier
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = appModifier
//            shape = MaterialTheme.shapes.extraSmall
        ) {
            Text(text = "Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Week4Theme {
        MyApp()
    }
}