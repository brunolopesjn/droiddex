package br.unifor.droiddex.ui.features

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Composable
fun Home() {

    val buttonModifier = Modifier.width(200.dp)

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Button(
                onClick = {},
                modifier = buttonModifier
            ) {
                Text("Screen A")
            }

            Button(
                onClick = {},
                modifier = buttonModifier
            ) {
                Text("Screen B")
            }
        }
    }
}

@Serializable
object Home : NavKey