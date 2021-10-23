package mx.programming4food.superApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import mx.programming4food.superApp.ui.theme.superAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            superAppTheme {
                router()
            }
        }
    }
}

@Composable
fun router() {
    val screenState = remember{ mutableStateOf(Routes.CREATE_ACCOUNT)}

    Scaffold {
        when(screenState.value){
            Routes.CREATE_ACCOUNT -> {
                CreateAccountScreen()
            }
            else -> {}
        }
    }
}

@Preview(showBackground = true)
@Composable
fun defaultPreview() {
    superAppTheme {
        router()
    }
}