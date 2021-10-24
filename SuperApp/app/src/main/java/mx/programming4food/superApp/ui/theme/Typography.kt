package mx.programming4food.superApp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import mx.programming4food.superApp.R

val openSans = FontFamily(
    Font(R.font.opensans_bold, FontWeight.Bold),
    Font(R.font.opensans_bolditalic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.opensans_extrabold, FontWeight.ExtraBold),
    Font(R.font.opensans_extrabolditalic, FontWeight.ExtraBold, FontStyle.Italic),
    Font(R.font.opensans_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.opensans_light, FontWeight.Light),
    Font(R.font.opensans_lightitalic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.opensans_medium, FontWeight.Medium),
    Font(R.font.opensans_mediumitalic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.opensans_regular, FontWeight.Normal),
    Font(R.font.opensans_semibold, FontWeight.SemiBold),
    Font(R.font.opensans_semibold, FontWeight.SemiBold, FontStyle.Italic),
)

val superAppTypography = Typography(
    h1 = TextStyle(
        fontFamily = openSans,
        fontWeight = FontWeight.Normal,
        fontSize = 40.sp,
        color = White
    ),
    body1 = TextStyle(
        fontFamily = openSans,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        color = White
    ),
    body2 = TextStyle(
        fontFamily = openSans,
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        color = White
    )
)

val font1 = TextStyle(
    fontFamily = openSans,
    fontWeight = FontWeight.SemiBold,
    fontSize = 16.sp,
    lineHeight = 28.sp,
    color = Color.White
)

val font2 = TextStyle(
    fontFamily = openSans,
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    color = Color.White
)

val font3 = TextStyle(
    fontFamily = openSans,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    lineHeight = 20.sp,
    color = Color.White
)

val font4 = TextStyle(
    fontFamily = openSans,
    fontWeight = FontWeight.Bold,
    fontSize = 18.sp,
    lineHeight = 20.sp,
    color = Color.White
)

val font5 = TextStyle(
    fontFamily = openSans,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    color = Color.White
)