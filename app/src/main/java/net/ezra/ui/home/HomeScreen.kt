package net.ezra.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import androidx.compose.foundation.Image

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import net.ezra.R



@Composable
fun HomeScreen(navController: NavHostController) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "")


                Text(
                    text = "\uD83D\uDE0E SUPERNAL STUDIOS \uD83D\uDE0E",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive,
                    modifier = Modifier.padding(horizontal = 10.dp)
                )


                Icon(imageVector = Icons.Default.Home, contentDescription = "")
            }

            Column(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier
                        .background(Color.Cyan)
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.app),
                        contentDescription = "",
                        modifier = Modifier.width(200.dp),
                        contentScale = ContentScale.FillWidth
                    )
                    Text(
                        modifier = Modifier
                            .clickable {
                                navController.navigate(ROUTE_HOME) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            },
                        text = "",
                        textAlign = TextAlign.Right,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    }
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}
