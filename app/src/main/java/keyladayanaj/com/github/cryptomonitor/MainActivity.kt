package keyladayanaj.com.github.cryptomonitor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import keyladayanaj.com.github.cryptomonitor.ui.theme.CryptoMonitorScreen
import keyladayanaj.com.github.cryptomonitor.ui.theme.CryptomonitorTheme
import keyladayanaj.com.github.cryptomonitor.viewmodel.CryptoViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: CryptoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptomonitorTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    CryptoMonitorScreen(viewModel = viewModel)
                }
            }
        }
    }
}
