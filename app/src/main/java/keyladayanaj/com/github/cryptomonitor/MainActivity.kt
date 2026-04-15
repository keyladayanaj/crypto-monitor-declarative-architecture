package keyladayanaj.com.github.cryptomonitor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
<<<<<<< HEAD
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
=======
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
>>>>>>> d353dfe754fb6fa12fd70ae752fe94b9b85da384
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
<<<<<<< HEAD
import keyladayanaj.com.github.cryptomonitor.ui.theme.CryptoMonitorScreen
import keyladayanaj.com.github.cryptomonitor.ui.theme.CryptomonitorTheme
import keyladayanaj.com.github.cryptomonitor.viewmodel.CryptoViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: CryptoViewModel by viewModels()

=======
import keyladayanaj.com.github.cryptomonitor.ui.theme.CryptomonitorTheme

class MainActivity : ComponentActivity() {
>>>>>>> d353dfe754fb6fa12fd70ae752fe94b9b85da384
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptomonitorTheme {
<<<<<<< HEAD
                Surface(modifier = Modifier.fillMaxSize()) {
                    CryptoMonitorScreen(viewModel = viewModel)
=======
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
>>>>>>> d353dfe754fb6fa12fd70ae752fe94b9b85da384
                }
            }
        }
    }
}
<<<<<<< HEAD
=======

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CryptomonitorTheme {
        Greeting("Android")
    }
}
>>>>>>> d353dfe754fb6fa12fd70ae752fe94b9b85da384
