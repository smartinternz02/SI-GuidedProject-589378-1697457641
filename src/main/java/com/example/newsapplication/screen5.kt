package com.example.newsapplication
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun screen5(navController: NavController) {
    var searchQuery by remember { mutableStateOf("") }



    Box(modifier = Modifier.fillMaxSize()){


    Image(
        painter = painterResource(id = R.drawable.background),
        contentDescription = "background",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.matchParentSize()
    )


    LazyColumn {
        items(1) { index ->

            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                value = searchQuery,
                onValueChange = { newValue ->
                    searchQuery = newValue
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                placeholder = { Text(text = "Search...") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(
                    onDone = {
                    }
                )
            )

            Card(modifier = Modifier
                .fillMaxWidth()
                .size(135.dp),
                onClick = { navController.navigate("screen6") }
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.news1),
                        contentDescription = "news1"
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(modifier = Modifier,) {
                        Text(
                            text = "Will friendly fire damage Congress in MP", modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp), fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "The Congress won 9 of these constituencies by a narrow margin last time while losing six in a close contest.",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 12.sp),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .size(135.dp),
                onClick = { navController.navigate("screen7") }
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.news2),
                        contentDescription = "news2"
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(modifier = Modifier,) {
                        Text(
                            text = "Citizens Have No Fundamental Right of Source of Political Funding",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "R. Venkataramani also said that the Supreme Court ... ",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 12.sp),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .size(135.dp),
                onClick = { navController.navigate("screen8") }
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier, ) {
                    Image(
                        painter = painterResource(id = R.drawable.news3),
                        contentDescription = "news3"
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(modifier = Modifier,) {
                        Text(
                            text = " Chidambaram slams BJP on fund raising",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "With the Supreme Court set to commence hearing on a ... ",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 12.sp),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(modifier = Modifier
                .fillMaxSize()
                .size(135.dp),
                onClick = { navController.navigate("screen9") }
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.news4),
                        contentDescription = "news4"
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(modifier = Modifier,) {
                        Text(
                            text = "Xi Jinping's advise to China's women on family",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "Xi Jinping said that the role of women had been part of... ",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 12.sp),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(modifier = Modifier
                .fillMaxSize()
                .size(135.dp),
                onClick = { navController.navigate("screen10") }
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.news5),
                        contentDescription = "news4"
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(modifier = Modifier,) {
                        Text(
                            text = "Fall of Petronet LNG shares continue",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "Petronet LNG's shares nosedived on Monday, sliding 8.5 per cent... ",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 12.sp),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(modifier = Modifier
                .fillMaxSize()
                .size(135.dp),
                onClick = { navController.navigate("screen11") }
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.news6),
                        contentDescription = "news4"
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(modifier = Modifier,) {
                        Text(
                            text = "Stock of this exchange and data platform firm has zoomed 114%",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "Shares of the Bombay Stock Exchange (BSE) rose 2.5 per cent on the NSE to hit a ...",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 12.sp),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(modifier = Modifier
                .fillMaxSize()
                .size(135.dp),
                onClick = { navController.navigate("screen12") }
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.news7),
                        contentDescription = "news4"
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(modifier = Modifier,) {
                        Text(
                            text = "Afghanistan Surpass Pakistan And Sri Lanka",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "Afghanistan's stupendous run at the Cricket World Cup continued on Monday as they got the better Sri Lanka...",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 12.sp),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(modifier = Modifier
                .fillMaxSize()
                .size(135.dp),
                onClick = { navController.navigate("screen13") }
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.news8),
                        contentDescription = "news4"
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(modifier = Modifier,) {
                        Text(
                            text = "‘Hosting Olympics is not about just two weeks.it’s about achievement’",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "IOC Athletes Commission member Abhinav Bindra on what hosting the Olympics could mean for India...",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 12.sp),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(modifier = Modifier
                .fillMaxSize()
                .size(135.dp),
                onClick = { navController.navigate("screen14") }
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.news9),
                        contentDescription = "news4"
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(modifier = Modifier,) {
                        Text(
                            text = "UK confirms plans to regulate crypto industry ",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "The U.K. government published its response to a consultation paper issued earlier this year...",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 12.sp),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(modifier = Modifier
                .fillMaxSize()
                .size(135.dp),
                onClick = { navController.navigate("screen15") }
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.news10),
                        contentDescription = "news4"
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(modifier = Modifier,) {
                        Text(
                            text = "Crypto thief steals $4.4M in a day as toll rises ",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "Estimates in September revealed that at least $35 million in crypto has been stolen from victims...",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 12.sp),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(modifier = Modifier
                .fillMaxSize()
                .size(135.dp),
                onClick = { navController.navigate("screen16") }
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.news11),
                        contentDescription = "news4"
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(modifier = Modifier,) {
                        Text(
                            text = "Iga Swiatek now 7-0 against lefties in 2023 ",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "The Pole erased a double break deficit in the opening set before turning the tide in Cancun Monday...",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 12.sp),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Card(modifier = Modifier
                .fillMaxSize()
                .size(135.dp),
                onClick = { navController.navigate("screen17") }
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.news12),
                        contentDescription = "news4"
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(modifier = Modifier,) {
                        Text(
                            text = "If Liverpool have solved their midfield, look out",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.width(16.dp))

                        Text(
                            text = "the final weekend of matches for the month happening all across Europe. As always, there is drama...",
                            modifier = Modifier,
                            style = TextStyle(fontSize = 12.sp),
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }


        }
        }
    }
}
