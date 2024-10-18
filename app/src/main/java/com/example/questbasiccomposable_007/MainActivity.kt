package com.example.pam3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_007.R
import com.example.questbasiccomposable_007.ui.theme.QuestBasicComposable_007Theme
import androidx.compose.material3.Scaffold as Scaffold1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_007Theme {
                Scaffold1(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicComposable(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicComposable(modifier: Modifier = Modifier) {
    Column (verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "indonesia",
            modifier = Modifier,
            fontSize = 100.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Versus",
            style = TextStyle(
                fontSize = 60.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Green
            )
        )
        Image(painter = painterResource(id = R.drawable.fifa),
            contentDescription = null,
            modifier = Modifier
                .size(190.dp)
        )
        Text(text = "nama",
            modifier = Modifier,
            fontSize = 35.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )




    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_007Theme  {
        Greeting("Android")
    }
}