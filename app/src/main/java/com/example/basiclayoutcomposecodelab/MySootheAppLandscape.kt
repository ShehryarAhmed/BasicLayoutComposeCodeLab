package com.example.basiclayoutcomposecodelab

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import com.example.basiclayoutcomposecodelab.ui.theme.BasicLayoutComposeCodeLabTheme

@Composable
fun MySootheAppLandscape() {
    BasicLayoutComposeCodeLabTheme {
        Row {
            SootheNavigationRail()
            HomeScreen()
        }
    }
}