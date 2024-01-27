package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
val backgroundapp: Color = Color(0xFFFFF4F4)


@Composable
fun CalculatorUI(){
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = isSystemInDarkTheme() // Dark icons for light theme

    systemUiController.setStatusBarColor(
        color = backgroundapp,
        darkIcons = useDarkIcons
    )

    systemUiController.setSystemBarsColor(
        color = backgroundapp,
        darkIcons = useDarkIcons
    )

    systemUiController.setNavigationBarColor(
        color = backgroundapp,
        darkIcons = useDarkIcons
    )


    val spacernum: Int = 10
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundapp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Column(
                modifier = Modifier
                    .weight(1f)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(start = spacernum.dp, bottom = spacernum.dp)
                ){
                    AutoClearButton(onClickDo = {})
                }
                Row {
                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Row (
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(start = spacernum.dp, bottom = spacernum.dp)
                        ){
                            NumberButton(number = "7", onClickDo = {})
                            Spacer(modifier = Modifier.width(spacernum.dp))
                            NumberButton(number = "8", onClickDo = {})
                            Spacer(modifier = Modifier.width(spacernum.dp))
                            NumberButton(number = "9", onClickDo = {})
                        }
                        Row (
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(start = spacernum.dp, bottom = spacernum.dp)
                        ){
                            NumberButton(number = "4", onClickDo = {})
                            Spacer(modifier = Modifier.width(spacernum.dp))
                            NumberButton(number = "5", onClickDo = {})
                            Spacer(modifier = Modifier.width(spacernum.dp))
                            NumberButton(number = "6", onClickDo = {})
                        }
                        Row (
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(start = spacernum.dp, bottom = spacernum.dp)
                        ){
                            NumberButton(number = "1", onClickDo = {})
                            Spacer(modifier = Modifier.width(spacernum.dp))
                            NumberButton(number = "2", onClickDo = {})
                            Spacer(modifier = Modifier.width(spacernum.dp))
                            NumberButton(number = "3", onClickDo = {})
                        }
                        Row (
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(start = spacernum.dp, bottom = spacernum.dp)
                        ){
                            NumberZeroButton(onClickDo = {})
                            Spacer(modifier = Modifier.width(spacernum.dp))
                            NumberButton(number = ".", onClickDo = {})
                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(end = spacernum.dp)
            ) {
                OperatorButton(operator = "x", onClickDo = {})
                Spacer(modifier = Modifier.height(spacernum.dp))
                OperatorButton(operator = "/", onClickDo = {})
                Spacer(modifier = Modifier.height(spacernum.dp))
                OperatorButton(operator = "-", onClickDo = {})
                Spacer(modifier = Modifier.height(spacernum.dp))
                OperatorButtonPlus(onClickDo = {})
                Spacer(modifier = Modifier.height(spacernum.dp))
                CurrentlyRandomButton(onClickDo = {})
            }
        }
    }

}

@Preview
@Composable
fun CalculatorUIPreview(){
    CalculatorUI()
}