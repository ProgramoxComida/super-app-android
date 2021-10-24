package mx.programming4food.superApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.programming4food.superApp.Routes.GUEST_MAIN
import mx.programming4food.superApp.Routes.ONBOARDING_1
import mx.programming4food.superApp.Routes.ONBOARDING_2
import mx.programming4food.superApp.screens.*
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
    val navController = rememberNavController()
    NavHost(navController = navController,Routes.SPLASH){
        composable(Routes.SPLASH){
            SplashScreen(navController)
        }
        composable(ONBOARDING_1){
            Onboarding1(navController)
        }
        composable(ONBOARDING_2){
            Onboarding2(navController)
        }
        composable(GUEST_MAIN){
            GuestMainScreen(navController)
        }
        /*
        composable(Routes.CREATE_ACCOUNT){
            CreateAccountScreen(navController)
        }
        composable(Routes.NEW_CLIENT){
            NewClientScreen(navController)
        }

         */
    }
}

@Preview(showBackground = true)
@Composable
fun defaultPreview() {
    superAppTheme {
        router()
    }
}