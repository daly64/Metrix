package com.example.metrix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.metrix.ui.navigation.Navigation
import com.example.metrix.ui.theme.MetrixTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MetrixTheme {
//                Home()
//                RequestedValue()
//                Formes()

                Navigation()


            }
        }
    }
}
