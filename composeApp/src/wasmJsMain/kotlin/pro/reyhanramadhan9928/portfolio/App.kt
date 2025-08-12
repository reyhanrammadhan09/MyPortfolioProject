package pro.reyhanramadhan9928.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import reyhanramadhan.composeapp.generated.resources.Res
import reyhanramadhan.composeapp.generated.resources.ic_email
import reyhanramadhan.composeapp.generated.resources.ic_github
import reyhanramadhan.composeapp.generated.resources.ic_instagram
import reyhanramadhan.composeapp.generated.resources.ic_linkind
import reyhanramadhan.composeapp.generated.resources.ic_x_twitter

@Composable
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(start = 50.dp, end = 50.dp, top = 40.dp, bottom = 35.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
    /* NavigationBar */

        Column(
            modifier = Modifier
                .width(1820.dp)
                .height(135.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(80.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "Reyhan's Portfolio",
                    fontSize = 55.sp,
                    fontFamily = PoppinsMediumFont(),
                    color = Color(color = onSurfaceColor)
                )
                Row(
                    modifier = Modifier
                        .width(140.dp)
                        .height(40.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    IconButton(
                        imgIcRes = painterResource(resource = Res.drawable.ic_email)
                    )
                    IconButton(
                        imgIcRes = painterResource(resource = Res.drawable.ic_email)
                    )
                    IconButton(
                        imgIcRes = painterResource(resource = Res.drawable.ic_email)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .width(240.dp)
                    .height(40.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                IconButton(
                    imgIcRes = painterResource(resource = Res.drawable.ic_email)
                )
                IconButton(
                    imgIcRes = painterResource(resource = Res.drawable.ic_linkind)
                )
                IconButton(
                    imgIcRes = painterResource(resource = Res.drawable.ic_github)
                )
                IconButton(
                    imgIcRes = painterResource(resource = Res.drawable.ic_instagram)
                )
                IconButton(
                    imgIcRes = painterResource(resource = Res.drawable.ic_x_twitter)
                )

            }
        }

    /* CardButton-Group */

        Row(
            modifier = Modifier
                .width(1220.dp)
                .height(165.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            CardButton(
                text = "Text Content",
                descText = "Lorem ip sumaco siamet pler la gu cos peler.."
            )
            CardButton(
                text = "Text Content",
                descText = "Lorem ip sumaco siamet pler la gu cos peler.."
            )
            CardButton(
                text = "Text Content",
                descText = "Lorem ip sumaco siamet pler la gu cos peler.."
            )
            CardButton(
                text = "Text Content",
                descText = "Lorem ip sumaco siamet pler la gu cos peler.."
            )
        } // End CardButton-Group
    }
}