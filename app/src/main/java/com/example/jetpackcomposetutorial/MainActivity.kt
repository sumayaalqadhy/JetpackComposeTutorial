package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.Paragraph
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    TutorialImage(
                        heading = stringResource(R.string.jetpack_compose_tutorial),
                        firstParagraph = stringResource(R.string.first_paragraph),
                        secondParagraph = stringResource(R.string.second_paragraph),
                    )

                }
                }
            }
        }
    }


@Composable
fun TutorialText(heading: String, firstParagraph: String, secondParagraph: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier) {
        Text(
            text = heading,
            fontSize = 24.sp,
            modifier = modifier
        )
        Text(
            text = firstParagraph,
            fontSize = 14.sp,
            modifier = modifier
                .padding(16.dp)
        )
        Text(
            text = secondParagraph,
            fontSize = 14.sp,
            modifier = modifier
        )
    }
}

@Composable
fun TutorialImage(heading: String, firstParagraph: String, secondParagraph: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)

    Box(modifier = modifier
        .fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,



            )
        TutorialText(
            heading = heading,
            firstParagraph = firstParagraph,
            secondParagraph = secondParagraph,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TutorialText() {
    JetpackComposeTutorialTheme {
        TutorialImage(
            heading = stringResource(R.string.jetpack_compose_tutorial),
            firstParagraph = stringResource(R.string.first_paragraph),
            secondParagraph = stringResource(R.string.second_paragraph))
    }
}