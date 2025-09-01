package pro.reyhanramadhan9928.portfolio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.browser.window
import org.jetbrains.compose.resources.painterResource
import reyhanramadhan.composeapp.generated.resources.Res
import reyhanramadhan.composeapp.generated.resources.compose_multiplatform

fun openUrl(url: String?) {
    if(!url.isNullOrBlank()) {
        window.open(url, "_blank")
    }
}

@Composable
fun CardButton(text: String, descText: String) {
    Column(
        modifier = Modifier
            .width(290.dp)
            .height(165.dp)
            .background(
                color = Color(surfaceColor),
                shape = RoundedCornerShape(15.dp),
            )
            .padding(horizontal = 15.dp, vertical = 10.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = text,
            fontSize = 20.sp,
            fontFamily = PoppinsRegularFont(),
            color = Color(color = onSurfaceColor)
        )
        Spacer(Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .width(260.dp)
                .height(100.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Image",
                modifier = Modifier
                    .width(100.dp)
                    .height(90.dp)
                    .background(Color.White)
            )
            Column(
                modifier = Modifier
                    .width(135.dp)
                    .height(100.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.Start
            ){
                Text(
                    text = descText,
                    fontSize = 15.5.sp,
                    fontFamily = PoppinsRegularFont(),
                    color = Color(color = onSurfaceColor)
                )
                Text(
                    text = "Click to view more",
                    fontSize = 14.sp,
                    fontFamily = PoppinsRegularFont(),
                    color = Color(color = informationTextColor)
                )
            }
        }
    }
}


@Composable
fun IconButton(imgIcRes: Painter, urlBrowser: String?, borderEnable: Boolean){
    var colorE = Color.Transparent
    var shapeE = RoundedCornerShape(0.dp)

    if (borderEnable) {
        colorE = Color(surfaceColor)
        shapeE = RoundedCornerShape(7.dp)
    }

    Box(
        modifier = Modifier
            .clickable {
                openUrl(url = urlBrowser)
            }
            .size(40.dp)
            .background(
                color = colorE,
                shape = shapeE
            ),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = imgIcRes,
            contentDescription = "Icon",
            modifier = Modifier
                .size(24.dp)
        )
    }
}