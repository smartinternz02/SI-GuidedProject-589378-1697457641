package com.example.newsapplication



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun screen3(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        Image(painter = painterResource(id = R.drawable.politics),
            contentDescription = "bh",
            contentScale = ContentScale.FillWidth
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {



            Spacer(modifier = Modifier.height(430.dp))

            Text(
                text = "BE NOTIFIED ABOUT POLITICS",
                style = TextStyle(fontSize = 30.sp), fontFamily = FontFamily.Serif
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Be aware of what is happening around you daily",
                style = TextStyle(fontSize = 20.sp), fontWeight = FontWeight.Light,
                fontFamily = FontFamily.SansSerif
            )

            Spacer(modifier = Modifier.height(25.dp))
            Row (modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
                horizontalArrangement = Arrangement.End
            ){

                Button(modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(Color(0xFFcd5c5c)),
                    onClick = { navController.navigate("screen4") }) {
                    Text(text = "Next")
                }

            }




        }

    }
}


