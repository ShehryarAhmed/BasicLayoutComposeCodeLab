package com.example.basiclayoutcomposecodelab

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.basiclayoutcomposecodelab.ui.theme.BasicLayoutComposeCodeLabTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MySootheAppPortrait() {
   BasicLayoutComposeCodeLabTheme {
       Scaffold(
           bottomBar = { SootheBottomNavigation() }
       ) { padding ->
           HomeScreen(Modifier.padding(padding))
       }
   }
}
