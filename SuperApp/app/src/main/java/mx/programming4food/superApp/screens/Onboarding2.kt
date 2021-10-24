package mx.programming4food.superApp.screens

import android.graphics.drawable.BitmapDrawable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import mx.programming4food.superApp.R
import mx.programming4food.superApp.Routes.GUEST_MAIN
import mx.programming4food.superApp.ui.theme.*

@Composable
fun Onboarding2(navController: NavHostController) {
    val systemUiController = rememberSystemUiController()
    SideEffect {
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
        backgroundColor = BBVA_NAVY,
        topBar = {
            Box(
                modifier = Modifier.fillMaxWidth().height(
                    64.dp
                ).padding(8.dp)
            ) {
                Text(
                    stringResource(R.string.no_client),
                    modifier = Modifier.align(
                        Alignment.Center
                    ),
                    style = font3
                )
                Icon(
                    Icons.Default.Close, null,
                    modifier = Modifier.align(
                        Alignment.CenterEnd
                    ),
                    tint = Color.White
                )
            }

        }
    )
    {
        Column(
            modifier = Modifier.fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                stringResource(
                    R.string.create_account_in_minutes
                ),
                style = font4,
                textAlign = TextAlign.Center
            )

            Text(
                stringResource(
                    R.string.no_cost
                ),
                style = font5
            )

            //TODO Line
            PrivacyTerms(navController)

            LibretonCard(navController)
            PymeCard(navController)
            GuestCard(navController)
        }
    }
}

@Composable
private fun LibretonCard(navController: NavHostController) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(
            24.dp
        )
    ) {
        Icon(
            painter = painterResource(R.drawable.badge),null,
            tint = Color.White,
            modifier = Modifier.size(56.dp)
        )
        Column(
            modifier = Modifier.weight(1f)
                .padding(
                    start = 16.dp
                )
        ) {
            Text(
                stringResource(R.string.libreton_basic_account),
                style = MaterialTheme.typography.body2
            )
            Text(
                stringResource(
                    R.string.libreton_basic_account_text
                ),
                style = font2
            )
            ClickableText(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Blue,
                        fontWeight = FontWeight.Bold)
                    ) {
                        append(stringResource(R.string.know_more))
                    }
                },
                modifier = Modifier.padding(
                    top = 8.dp,
                    bottom = 8.dp,
                )
            ){

            }

            TextButton(
                onClick = {
                    // TODO Accion
                },
                colors = ButtonDefaults.buttonColors(
                    BBVA_MEDIUM_BLUE
                ),
                shape = Shapes.large
            ){
                Text(
                    stringResource(R.string.open_account),
                    modifier = Modifier.padding(
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 8.dp,
                        top = 8.dp,
                    )
                )
            }
        }
    }
}

@Composable
private fun PymeCard(navController: NavHostController) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .background(BBVA_CORE_BLUE)
            .padding(
                24.dp
            ),
    ) {
        Icon(
            painter = painterResource(R.drawable.shop),null,
            tint = Color.White,
            modifier = Modifier.size(56.dp)
        )
        Column(
            modifier = Modifier.weight(1f)
                .padding(
                    start = 16.dp
                )
        ) {
            Text(
                stringResource(R.string.libreton_pyme_account),
                style = MaterialTheme.typography.body2
            )
            Text(
                stringResource(
                    R.string.libreton_pyme_account_text
                ),
                style = font2
            )
            ClickableText(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Blue,
                        fontWeight = FontWeight.Bold)
                    ) {
                        append(stringResource(R.string.know_more))
                    }
                },
                modifier = Modifier.padding(
                    top = 8.dp,
                    bottom = 8.dp,
                )
            ){

            }

            TextButton(
                onClick = {
                    // TODO Accion
                },
                colors = ButtonDefaults.buttonColors(
                    BBVA_MEDIUM_BLUE
                ),
                shape = Shapes.large
            ){
                Text(
                    stringResource(R.string.open_account),
                    modifier = Modifier.padding(
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 8.dp,
                        top = 8.dp,
                    )
                )
            }
        }
    }
}

@Composable
private fun GuestCard(navController: NavHostController) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(
            24.dp
        )
    ) {
        Icon(
            painter = painterResource(R.drawable.user),null,
            tint = Color.White,
            modifier = Modifier.size(56.dp)
        )
        Column(
            modifier = Modifier.weight(1f)
                .padding(
                    start = 16.dp
                )
        ) {
            Text(
                stringResource(R.string.continue_as_guest),
                style = MaterialTheme.typography.body2
            )
            Text(
                stringResource(
                    R.string.guest_text
                ),
                style = font2
            )
            ClickableText(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Blue,
                        fontWeight = FontWeight.Bold)
                    ) {
                        append(stringResource(R.string.know_more))
                    }
                },
                modifier = Modifier.padding(
                    top = 8.dp,
                    bottom = 8.dp,
                )
            ){

            }

            TextButton(
                onClick = {
                    navController.navigate(GUEST_MAIN)
                },
                colors = ButtonDefaults.buttonColors(
                    BBVA_MEDIUM_BLUE
                ),
                shape = Shapes.large
            ){
                Text(
                    stringResource(R.string.go_on),
                    modifier = Modifier.padding(
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 8.dp,
                        top = 8.dp,
                    )
                )
            }
        }
    }
}

@Composable
private fun PrivacyTerms(navController: NavHostController) {
    val annotatedText = buildAnnotatedString  {
        withStyle(style = SpanStyle(color = Color.White) ){
            append("Consulta el ")
        }
        pushStringAnnotation("aviso", annotation = "aviso")
        withStyle(style = SpanStyle(color = Color.Blue,
            fontWeight = FontWeight.Bold)
        ) {
            append("Aviso de Privacidad")
        }
        pop()
    }
    ClickableText(
        annotatedText,
    ){offset->
        annotatedText.getStringAnnotations(tag = "aviso", start = offset,
            end = offset)
            .firstOrNull()?.let { annotation ->
                //TODO accion
                // navController
            }
    }
}

@Composable
@Preview
fun previewOnboarding2(){
    val navController = rememberNavController()
    superAppTheme {
        Onboarding2(navController)
    }
}
