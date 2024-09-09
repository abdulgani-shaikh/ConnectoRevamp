package com.neosofttech.connectorevamp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.neosofttech.connectorevamp.ui.theme.ConnectoRevampTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConnectoRevampTheme {

            }
        }
    }
}