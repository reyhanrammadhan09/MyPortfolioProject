package pro.reyhanramadhan9928.portfolio

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.Font
import reyhanramadhan.composeapp.generated.resources.Poppins_Medium
import reyhanramadhan.composeapp.generated.resources.Poppins_Regular
import reyhanramadhan.composeapp.generated.resources.Res

@Composable
fun PoppinsRegularFont() = FontFamily(
    Font(Res.font.Poppins_Regular)
)
@Composable
fun PoppinsMediumFont() = FontFamily(
    Font(Res.font.Poppins_Medium)
)