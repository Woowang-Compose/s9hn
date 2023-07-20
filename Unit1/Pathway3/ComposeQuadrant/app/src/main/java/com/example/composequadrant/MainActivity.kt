package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { }
    }
}

@Composable
fun ComposeQuadrantApp() {
    val firstTitle = stringResource(id = R.string.first_title)
    val firstDescription = stringResource(id = R.string.first_description)
    val secondTitle = stringResource(id = R.string.second_title)
    val secondDescription = stringResource(id = R.string.second_description)
    val thirdTitle = stringResource(id = R.string.third_title)
    val thirdDescription = stringResource(id = R.string.third_description)
    val fourthTitle = stringResource(id = R.string.fourth_title)
    val fourthDescription = stringResource(id = R.string.fourth_description)

    val firstColor = Color.Green
    val secondColor = Color.Yellow
    val thirdColor = Color.Cyan
    val fourthColor = Color.LightGray

    Column(Modifier.fillMaxWidth(1f)) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                firstTitle,
                firstDescription,
                firstColor,
                Modifier.weight(1f),
            )
            ComposableInfoCard(
                secondTitle,
                secondDescription,
                secondColor,
                Modifier.weight(1f),
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                thirdTitle,
                thirdDescription,
                thirdColor,
                Modifier.weight(1f),
            )
            ComposableInfoCard(
                fourthTitle,
                fourthDescription,
                fourthColor,
                Modifier.weight(1f),
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(backgroundColor).padding(16.dp).fillMaxSize(),
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                bottom = 16.dp,
            ),
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantApp()
}
