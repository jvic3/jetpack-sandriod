package com.example.juliana

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.juliana.ui.theme.JulianaTheme

class LayoutActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){

     Column (modifier = Modifier.fillMaxSize()) {

         val mContext = LocalContext.current




         //TopAppBar
         TopAppBar(
             title = { Text(text = "Home", color = Color.White)},
             colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
             navigationIcon = {
                 IconButton(onClick = {
                     mContext.startActivity(Intent(mContext,MainActivity::class.java))

                 }) {
                     Icon(imageVector = Icons.Default.ArrowBack,
                         contentDescription = "arrowback",
                         tint = Color.White)
                 }
             },
             actions ={
                 IconButton(onClick = { /*TODO*/ }) {
                     Icon(imageVector = Icons.Default.Share,
                         contentDescription = "share",
                         tint = Color.White)
                 }

                 IconButton(onClick = { /*TODO*/ }) {
                     Icon(imageVector = Icons.Default.Settings,
                         contentDescription = "settings",
                         tint = Color.White)
                 }
             }
             )
         //end of TopAppbar
         Spacer(modifier = Modifier.height(5.dp))
         Text(
             text = "Rottweiler",
             fontSize = 20.sp,
             fontWeight = FontWeight.Bold,
             modifier = Modifier.fillMaxWidth(),
             textAlign = TextAlign.Center
         )
           //row
         Row {

             androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.rottweiler),
                 contentDescription = "",
                 modifier = Modifier.size(width = 200.dp, height = 200.dp)
             )
             Spacer(modifier = Modifier.width(5.dp))
             Column {
                 Text(text = "History")
                 Text(text = "The Rottweiler we know today descends from mastiffs that lived in the Roman Empire more than 2,000 years ago. These rugged dogs accompanied Roman legions north through the Alps, since these soldiers were on their way to invade what's now Switzerland.")
             }
         }

         //end of row
         Spacer(modifier = Modifier.height(5.dp))
         Row {

             androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.aww),
                 contentDescription = "",
                 modifier = Modifier.size(width = 200.dp, height = 200.dp)
             )
             Spacer(modifier = Modifier.width(5.dp))
             Column {
                 Text(text = "Strength")
                 Text(text = "The Rottweiler we know today descends from mastiffs that lived in the Roman Empire more than 2,000 years ago. These rugged dogs accompanied Roman legions north through the Alps, since these soldiers were on their way to invade what's now Switzerland.")
             }
         }
         Spacer(modifier = Modifier.width(5.dp))
         Row {

             androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.dogrot),
                 contentDescription = "",
                 modifier = Modifier.size(width = 200.dp, height = 200.dp)
             )
             Spacer(modifier = Modifier.width(5.dp))
             Column {
                 Text(text = "How big")
                 Text(text = "The Rottweiler we know today descends from mastiffs that lived in the Roman Empire more than 2,000 years ago. These rugged dogs accompanied Roman legions north through the Alps, since these soldiers were on their way to invade what's now Switzerland.")
             }
         }

         Button(onClick = { /*TODO*/

         },
             shape = RoundedCornerShape(5.dp),
             colors = ButtonDefaults.buttonColors(Color.Red),
             modifier = Modifier
                 .fillMaxWidth()
                 .padding(start = 30.dp, end = 30.dp)
         ) {
             Text(text = "next")
         }
     }


}
@Preview(showBackground = true)
@Composable
fun LayoutPreview(){

   Layout()

}