package mx.programming4food.superApp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.programming4food.superApp.ui.theme.superAppTheme

@Composable
fun CreateAccountScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(
            start = 16.dp,
            top = 16.dp,
            bottom = 16.dp,
            end = 16.dp
        )
        .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            stringResource(R.string.bbva),
            style = MaterialTheme.typography.h1
        )
        textColumn()
        buttonsColumn()
    }
}

@Composable
fun textColumn() {
    Column(
        modifier = Modifier.fillMaxHeight(0.5f)
            .padding(
                start = 24.dp,
                end = 24.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){

        Text(
            stringResource(R.string.welcome1),
            style = MaterialTheme.typography.body2,
            textAlign = TextAlign.Center
        )
        Text(
            stringResource(R.string.welcome2),
            style = MaterialTheme.typography.body1
        )
        Text(
            stringResource(R.string.welcome3),
            style = MaterialTheme.typography.body1
        )
        Text(stringResource(
            R.string.welcome4),
            style = MaterialTheme.typography.body1
        )
        Text(stringResource(
            R.string.welcome5),
            style = MaterialTheme.typography.body1
        )
        Text(
            stringResource(R.string.welcome6),
            style = MaterialTheme.typography.body1
        )
        Text(
            stringResource(R.string.welcome7),
            style = MaterialTheme.typography.body1
        )
    }
}

@Composable
fun buttonsColumn(){
    Column {
        TextButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(

            )
        ){
            Text(stringResource(R.string.login))
        }
        Spacer(Modifier.height(8.dp))
        OutlinedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
                .height(48.dp),
            colors = ButtonDefaults.outlinedButtonColors(

            ),
            border = BorderStroke(1.dp, MaterialTheme.colors.primary)
        ){
            Text(stringResource(R.string.wanna_join))
        }
    }
}



@Composable
@Preview
private fun preview(){
    superAppTheme {
        Scaffold {
            CreateAccountScreen()
        }
    }
}