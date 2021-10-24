package mx.programming4food.superApp.screens

import android.text.SpannedString
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.text.buildSpannedString
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import mx.programming4food.superApp.R
import mx.programming4food.superApp.Routes
import mx.programming4food.superApp.ui.theme.*

@Composable
fun Onboarding1(navController: NavHostController) {
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.isStatusBarVisible = true
        systemUiController.isSystemBarsVisible = true
        systemUiController.isNavigationBarVisible = true
        systemUiController.setStatusBarColor(
            BBVA_NAVY
        )
        systemUiController.setNavigationBarColor(
            BBVA_NAVY
        )
        systemUiController.setNavigationBarColor(
            BBVA_NAVY
        )
    }
    Scaffold(
        backgroundColor = BBVA_NAVY
    )
    {
        Box(
            modifier = Modifier.fillMaxSize()
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 48.dp,
                    bottom = 48.dp
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxHeight(0.1f)
                    .align(Alignment.TopCenter)
                ,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = null,
                )
            }
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
            ) {
                Text(
                    stringResource(R.string.onboarding_1_1),
                    style = font1
                )
                Text(
                    "• Puedes consultar tu saldos y movimientos",
                    style = font2
                )
                Text(
                    "• Hacer y recibir transferencias desde cualquier parte del mundo",
                    style = font2
                )
                Text(
                    "• Retiros de efectivo sin tarjeta",
                    style = font2
                )
                Text(
                    "• Pagar cualquier tipo de servicio",
                    style = font2
                )
                Text(
                    "• Programa auto-ahorros",
                    style = font2
                )
                Text(
                    "• Conecta tu proyecto de emprendimiento y hazlo crecer",
                    style = font2
                )
            }
            TextButton(
                onClick = {
                          navController.navigate(Routes.ONBOARDING_2)
                },
                modifier = Modifier.fillMaxWidth()
                    .height(48.dp)
                    .align(Alignment.BottomCenter)
                ,
                colors = ButtonDefaults.buttonColors(
                    BBVA_MEDIUM_BLUE
                )
            ){
                Text(
                    stringResource(R.string.login),
                    color = Color.White
                )
            }
        }
    }
}

@Composable
@Preview
fun previewOnboarding1(){
    val navController = rememberNavController()
    superAppTheme {
        Onboarding1(navController)
    }
}