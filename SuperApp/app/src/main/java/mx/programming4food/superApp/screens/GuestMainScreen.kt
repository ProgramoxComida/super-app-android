package mx.programming4food.superApp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import mx.programming4food.superApp.R
import mx.programming4food.superApp.ui.theme.*


@Composable
fun GuestMainScreen(navController: NavHostController){
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
                modifier = Modifier.height(64.dp).fillMaxWidth()
                    .padding(
                        start = 16.dp,
                        end = 16.dp,
                    )
            ) {
                Text(
                    stringResource(R.string.welcome),
                    modifier = Modifier.align(Alignment.Center)
                )
                Icon(
                    Icons.Default.Menu, null,
                    modifier = Modifier.align(Alignment.CenterEnd),
                    tint = Color.White
                )
            }
        },
        bottomBar = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                //TODO Change tint on selected
                Icon(
                    painter = painterResource(R.drawable.home),
                    null,
                    modifier = Modifier,
                    tint = BBVA_CORE_BLUE
                )
                Icon(
                    painter = painterResource(R.drawable.add),
                    null,
                    modifier = Modifier,
                    tint = Black4
                )
                Icon(
                    painter = painterResource(R.drawable.user),
                    null,
                    modifier = Modifier,
                    tint = Black4
                )
            }
        }
    ){
        ConstraintLayout (
            modifier = Modifier.fillMaxSize()
        ) {
            val (polygon, actions, cards, bottomBar) = createRefs()
            PolygonCustom()
            RowOptions(navController,modifier = Modifier)
            AddCardCard(navController,modifier = Modifier)
        }
    }
}

@Composable
private fun AddCardCard(navController: NavHostController, modifier: Modifier) {
    Card(

    ) {
        Text(
            stringResource(
                R.string.add_card
            )
        )
    }
}

@Composable
fun RowOptions(navController: NavHostController, modifier: Modifier) {
    Row(
        modifier = modifier.padding(
            top = 40.dp
        )
    ) {
        Column {
            Box(
                modifier = Modifier.background(
                    BBVA_MEDIUM_BLUE_LIGHT,
                    shape = CircleShape
                ).size(
                    80.dp
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.tag),null,
                    tint = Color.White,
                    modifier = Modifier.size(32.dp).align(Alignment.Center)
                )
            }
            Text(
                stringResource(R.string.pay_services),
                modifier = Modifier.width(80.dp).padding(top = 12.dp),
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
        Spacer(
            modifier = Modifier.width(36.dp)
        )
        Column {
            Box(
                modifier = Modifier.background(
                    ORANGE,
                    shape = CircleShape
                ).size(
                    80.dp
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.more_cell),null,
                    tint = Color.White,
                    modifier = Modifier.size(32.dp).align(Alignment.Center)
                )
            }
            Text(
                stringResource(R.string.more_services),
                modifier = Modifier.width(80.dp).padding(top = 12.dp),
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
private fun PolygonCustom() {
    Spacer(
        Modifier
            .fillMaxSize()
            .background(
                Color.White,
                shape = GenericShape{ size, _ ->
                    moveTo(0f,size.height)
                    lineTo(
                        size.width, size.height
                    )
                    lineTo(
                        size.width, (size.height / 2.3).toFloat()
                    )
                    lineTo(
                        0f, (size.height / 2)
                    )
                }
            )
    )
}

@Composable
@Preview
fun previewGuestMainScreen(){
    val navController = rememberNavController()
    superAppTheme {
        GuestMainScreen(navController)
    }
}