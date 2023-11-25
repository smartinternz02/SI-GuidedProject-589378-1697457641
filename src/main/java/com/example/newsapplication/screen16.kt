package com.example.newsapplication




import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.net.Uri
import android.widget.Toast
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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun screen16(navController: NavController) {

    val context = LocalContext.current
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
        Image(painter = painterResource(id = R.drawable.news11),
            contentDescription = "bh",
            contentScale = ContentScale.FillWidth
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {



            Spacer(modifier = Modifier.height(410.dp))

            Text(
                text = "Iga Swiatek now 7-0 against lefties in 2023 after surging past Marketa Vondrousova at WTA Finals",
                style = TextStyle(fontSize = 20.sp), fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text="The Pole erased a double break deficit in the opening set before turning the tide in Cancun Monday—mirroring their earlier season Cincinnati clash.",
                fontFamily = FontFamily.SansSerif
            )

            Spacer(modifier = Modifier.height(30.dp))
            Row (modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
                horizontalArrangement = Arrangement.End
            ){

                Button(modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(Color(0xFFcd5c5c)),
                    onClick = { navController.navigate("screen5") }) {
                    Text(text = "Back")
                }
                Spacer(modifier = Modifier.width(150.dp))

                Button(modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(Color(0xFFcd5c5c)),
                    onClick = { if (isInternetAvailable(context)) {
                        val url = "https://www.tennis.com/news/articles/iga-swiatek-now-7-0-vs-lefties-2023-surging-past-marketa-vondrousova-wta-finals"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                        context.startActivity(intent)
                    } else {

                        Toast.makeText(context, "No internet connection", Toast.LENGTH_SHORT).show()
                    }}) {
                    Text(text = "Browse")
                }

            }




        }

    }
}



