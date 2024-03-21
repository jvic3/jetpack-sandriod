package com.example.juliana

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.juliana.ui.theme.JulianaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
              Demo()
        }
    }
}
var text = "Continue"
@Composable
fun Demo(){

  Column (modifier = Modifier.fillMaxSize()){
      Spacer(modifier = Modifier.height(10.dp))

      val mContext = LocalContext.current

      Text(

          text = "Welcome to June's android",
          color = Color.Blue,
          fontSize = 30.sp,
          fontStyle = FontStyle.Italic,
          fontWeight = FontWeight.Bold,
      )
      Text(text = "Android is an open source and Linux-based operating system for mobile devices such as smartphones and tablet computers. Android was developed by the Open Handset Alliance, led by Google, and other companies. ")

           Spacer(modifier = Modifier.height(20.dp))
      
      Column(
          modifier = Modifier.fillMaxWidth(),
          verticalArrangement = Arrangement.Center,
          horizontalAlignment = Alignment.CenterHorizontally,

      ) {
          Button(onClick = {})
          { Text("See more") }
      }


      Spacer(modifier = Modifier.height(20.dp))
      Text(text = "Types of cars",
           fontSize = 25.sp,

          modifier = Modifier
              .fillMaxWidth()
              .background(Color.Gray)
              .height(40.dp),

          textAlign = TextAlign.Center,
          textDecoration = TextDecoration.Underline
          )
      Text(text = "1.Porche 911")
      Text(text = "2.Audi 865")
      Text(text = "3.Lambo")
      Text(text = "4.Benz C-200")

      
      Text(text = "About Porche 911",
          fontSize = 25.sp,
          fontWeight = FontWeight.Bold,
          textDecoration = TextDecoration.Underline,
          modifier = Modifier
              .fillMaxWidth(),


          textAlign = TextAlign.Center,)


      Text(text = "The original 911 had an air-cooled flat-six engine instead of the four-cylinder boxer engine of the 356. It developed 130PS, could accelerate from 0-100km/h in 9.1 seconds and had a top speed of 210km/h. These were hugely impressive figures for a production sportscar at the time.")


      Spacer(modifier = Modifier.height(10.dp))
      Text(text = "Originality",
         fontSize = 25.sp,
          color = Color.Blue,
          textDecoration = TextDecoration.Underline
          )
      Text(text = "The Porsche 911 was first unveiled to the public on 12 September 1963 when it was launched at the Frankfurt International Motor Show. Full production of the car began a year later in September 1964 at the Porsche factory in Zuffenhausen.")
           Spacer(modifier = Modifier.height(10.dp))

           Divider()
      Spacer(modifier = Modifier.height(10.dp))
      Box(modifier = Modifier.fillMaxWidth(),
          contentAlignment = Alignment.Center) {
          Image(
              painter = painterResource(id = R.drawable.porche),
              contentDescription = "911",
              modifier = Modifier.
              size(200.dp).
              clip(shape = CircleShape),
              contentScale = ContentScale.Crop

          )

      }
      Spacer(modifier = Modifier.height(10.dp))
    Button(onClick = {
                     mContext.startActivity(Intent(mContext,LayoutActivity2::class.java))

                     },
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.LightGray),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp)
    ) {
        Text(text = text)
    }
      }



  }





@Preview(showBackground = true)
@Composable
fun DemoPreview(){
  Demo()

}