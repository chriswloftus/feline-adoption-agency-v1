package uk.ac.aber.dcs.cs31620.faa.ui.home

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import uk.ac.aber.dcs.cs31620.faa.ui.components.MainPageTopAppBar
import uk.ac.aber.dcs.cs31620.faa.ui.theme.FAATheme

/**
 * Represents the home screen. For this version we only have a
 * top app bar and empty content.
 * @author Chris Loftus
 */
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(){
    Scaffold(
        topBar = {
            MainPageTopAppBar()
        },
        content = { }
    )
}

@Preview
@Composable
private fun HomeScreenPreview(){
    FAATheme(dynamicColor = false) {
        HomeScreen()
    }
}