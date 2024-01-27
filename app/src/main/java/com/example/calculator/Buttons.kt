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
val colourautoclear = Color(0xFFFF3030)
val colouroperator = Color(0xFF493971)
val colourrandombutton = Color(0xFFBA1A1A)

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

@Composable
fun AutoClearButton(onClickDo: () -> Unit){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(143.dp, 138.dp)
            .clip(RoundedCornerShape(34.dp))
            .background(colourautoclear)
            .clickable(onClick = { onClickDo() })
    ){
        BasicText(
            text = "C/AC",
            style = TextStyle(
                color = Color.White,
                fontSize = 45.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Medium,
            ),
        )
    }
}

@Composable
fun OperatorButton(operator: String, onClickDo:()->Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(90.dp, 90.dp)
            .clip(RoundedCornerShape(34.dp))
            .background(colouroperator)
            .clickable(onClick = { onClickDo() })
    )
    {
        BasicText(
            text = operator.toString(),
            style = TextStyle(
                color = Color.White,
                fontSize = 65.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Medium,
            ),
        )
    }
}

@Composable
fun OperatorButtonPlus(onClickDo:()->Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(90.dp, 196.dp)
            .clip(RoundedCornerShape(34.dp))
            .background(colouroperator)
            .clickable(onClick = { onClickDo() })
    )
    {
        BasicText(
            text = "+",
            style = TextStyle(
                color = Color.White,
                fontSize = 65.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Medium,
            ),
        )
    }
}

@Composable
fun CurrentlyRandomButton(onClickDo: () -> Unit){
    Box(
        modifier = Modifier
            .size(90.dp, 29.dp)
            .clip(RoundedCornerShape(34.dp))
            .background(colourrandombutton)
            .clickable(onClick = { onClickDo() })
    )
}



@Preview
@Composable
fun NumberButtonPreview(){
    NumberButton(number = "7", onClickDo = {})
}
