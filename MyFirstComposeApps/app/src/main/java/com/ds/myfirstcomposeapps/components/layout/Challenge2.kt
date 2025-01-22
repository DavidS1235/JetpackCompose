package com.ds.myfirstcomposeapps.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun Challenge2(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        //Define multiple variables to be used as ID
        val (boxCyan, boxBlack, boxDarkGray, boxRed, boxGray, boxGreen, boxMagenta, boxYellow, boxBlue) = createRefs()

        Box(
            Modifier
                .size(175.dp)
                .background(Color.Cyan)
                .constrainAs(boxCyan) {
                    bottom.linkTo(boxMagenta.top)
                    end.linkTo(boxMagenta.end)
                })
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Black)
                .constrainAs(boxBlack) {
                    top.linkTo(boxCyan.top)
                    bottom.linkTo(boxCyan.bottom)
                    start.linkTo(boxCyan.end)
                })
        Box(
            Modifier
                .size(175.dp)
                .background(Color.DarkGray)
                .constrainAs(boxDarkGray) {
                    bottom.linkTo(boxGreen.top)
                    start.linkTo(boxGreen.start)
                })

        Box(
            Modifier
                .size(75.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    bottom.linkTo(boxYellow.top)
                    start.linkTo(boxYellow.end)
                })
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    bottom.linkTo(boxYellow.top)
                    end.linkTo(boxYellow.start)
                })

        Box(
            Modifier
                .size(75.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                })
        Box(
            Modifier
                .size(175.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(boxYellow.bottom)
                })
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Gray)
                .constrainAs(boxRed) {
                    top.linkTo(boxYellow.bottom)
                    end.linkTo(boxYellow.start)
                })
        Box(
            Modifier
                .size(75.dp)
                .background(Color.Red)
                .constrainAs(boxGray) {
                    top.linkTo(boxYellow.bottom)
                    start.linkTo(boxYellow.end)
                })
    }
}