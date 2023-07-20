package com.example.taskcompleted

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
fun TaskCompletedScreen() {
    val header = stringResource(id = R.string.all_task_completed)
    val content = stringResource(id = R.string.nice_work)
    val image = painterResource(id = R.drawable.ic_task_completed)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        MainImage(painter = image)
        ContentText(header, content)
    }
}

@Composable
fun MainImage(painter: Painter) {
    Image(painter = painter, contentDescription = null)
}

@Composable
fun ContentText(header: String, content: String) {
    Text(
        text = header,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(
            top = 24.dp,
            bottom = 8.dp,
        ),
    )

    Text(
        text = content,
        fontSize = 16.sp,
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    TaskCompletedScreen()
}
