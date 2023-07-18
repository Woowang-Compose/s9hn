package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { }
    }
}

@Composable
fun ComposeArticleApp() {
    val painter = painterResource(id = R.drawable.bg_compose_background)
    val title = stringResource(id = R.string.title_jetpack_compose_tutorial)
    val shortDescription = stringResource(R.string.compose_short_desc)
    val longDescription = stringResource(R.string.compose_long_desc)
    ArticleCard(title, shortDescription, longDescription, painter)
}

@Composable
private fun ArticleCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column {
        Banner(imagePainter)
        Content(title, shortDescription, longDescription)
    }
}

@Composable
private fun Banner(image: Painter) {
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.fillMaxWidth(
            1f,
        ),
    )
}

@Composable
private fun Content(head: String, introduce: String, body: String) {
    Text(
        text = head,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp),
    )
    Text(
        text = introduce,
        fontSize = 16.sp,
        modifier = Modifier.padding(
            horizontal = 16.dp,
        ),
        textAlign = TextAlign.Justify,
    )
    Text(
        text = body,
        fontSize = 16.sp,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify,
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ComposeArticleApp()
}
