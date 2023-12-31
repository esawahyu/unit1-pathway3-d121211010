package com.example.unit1_pathway3_d121211010

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unit1_pathway3_d121211010.ui.theme.unit1_pathway3d121211010

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            unit1_pathway3d121211010{
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyCard()
                }
            }
        }
    }

    private fun setContent(function: () -> Unit) {

    }
}
//membuat box untuk membungkus seluruh content dan mengubah warna background
@Composable
fun MyCard() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFACE1AF)) //hijau celadon
    )
    {
        ImageContent()
        CardContent()
        CardContent2()
    }
}

//untuk menampilkan gambar
@Composable
fun ImageContent() {
    val painter: Painter = painterResource(id = R.drawable.android_logo)
    Image(
        painter = painter,
        contentDescription = "My Photo",
        modifier = Modifier.padding(
            start = 120.dp,
            top = 180.dp,
            end = 120.dp,
            bottom = 300.dp
        )
    )
}

//untuk menampilkan nama dan job title
@Composable
fun CardContent() {
    Column(
        modifier = Modifier.padding(
            start = 60.dp,
            top = 340.dp,
            end = 50.dp,
            bottom = 120.dp
        ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text= "Muh.Esa Wahyu",
            color = Color.Black,
            fontSize = 30.sp,
            lineHeight = 100.sp
        )

        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = "D121211010 - Teknik Informatika 2021",
            color = Color(0xFF006400),
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
        )
    }
}


//untuk menampilkan info kontak
@Composable
fun CardContent2( ) {
    val hexColor = "#008000" // hexa hijau gelap
    val color = Color(android.graphics.Color.parseColor(hexColor))

    Column(
        modifier = Modifier.padding(
            start = 60.dp,
            top = 600.dp,
            end = 16.dp,
            bottom = 50.dp
        )
    ) {
        Row(
            modifier = Modifier.padding(
                start = 30.dp,
                end = 30.dp
            ),
            horizontalArrangement = Arrangement.Center
        ) {

            Icon(
                modifier = Modifier.padding(end = 30.dp),
                tint = color,
                imageVector = Icons.Default.Phone,
                contentDescription = "Ikon Phone")

            Text(
                text = "0824689767",
                fontSize = 15.sp)

        }

        Spacer(modifier = Modifier.height(6.dp))

        Row(
            modifier = Modifier.padding(
                start = 30.dp,
                end = 30.dp
            ),
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier.padding(end = 30.dp),
                imageVector = Icons.Default.Share,
                contentDescription = "Ikon Share",
                tint = color
            )
            Text(
                text = "esawahyu",
                fontSize = 15.sp
            )
        }
        Spacer(modifier = Modifier.height(6.dp))

        Row(
            modifier = Modifier.padding(
                start = 30.dp,
                end = 30.dp
            ),
            horizontalArrangement = Arrangement.Center
        ) {

            Icon(
                modifier = Modifier.padding(end = 30.dp),
                imageVector = Icons.Default.Email,
                contentDescription = "Ikon Email",
                tint = color
            )
            Text(
                text = "esawahyu861l@gmail.com",
                fontSize = 15.sp
            )
        }
    }
}