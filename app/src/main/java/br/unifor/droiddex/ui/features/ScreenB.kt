package br.unifor.droiddex.ui.features

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavKey
import br.unifor.droiddex.R
import kotlinx.serialization.Serializable

@Composable
fun ScreenB() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.vaporwave_blue))
    ) {
        Text(
            text = "Screen B",
            fontSize = 50.sp,
            fontWeight = FontWeight.W400,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()

        )
    }
}

@Preview (showBackground = true)
@Composable
fun ScreenBPreview() {
    ScreenB()
}

@Serializable
object ScreenB: NavKey