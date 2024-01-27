package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val colourbutton = Color(0xFFDDE1FF)
val colourtext = Color(0xFF08164B)

@Composable
fun NumberButton(number: String, onClickDo:()->Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(90.dp, 90.dp)
            .clip(RoundedCornerShape(34.dp))
            .background(colourbutton)
            .clickable(onClick = { onClickDo() })
    )
    {
        BasicText(
            text = number.toString(),
            style = TextStyle(
                color = colourtext,
                fontSize = 65.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Medium,
            ),
        )
    }
}

@Composable
fun NumberZeroButton(onClickDo: () -> Unit){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(188.dp, 90.dp)
            .clip(RoundedCornerShape(34.dp))
            .background(colourbutton)
            .clickable(onClick = { onClickDo() })
    ){
        BasicText(
            text = "0",
            style = TextStyle(
                color = colourtext,
                fontSize = 65.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Medium,
            ),
        )
    }
}


@Preview
@Composable
fun NumberButtonPreview(){
    NumberButton(number = "7", onClickDo = {})
}

//Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize())

/*
* Surface(
            modifier = Modifier
                .size(300.dp)
                .clip(RoundedCornerShape(109.dp))
                .background(Color(0xFFDDE1FF)),
            border = BorderStroke(1.dp, Color.Black),
        )*/