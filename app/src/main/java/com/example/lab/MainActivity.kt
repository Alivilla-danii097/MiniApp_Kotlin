package com.example.lab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.example.lab.ui.theme.PlantillaTheme
import com.example.lab.user.UserScreen
import com.example.lab.user.UserViewModel

class MainActivity : ComponentActivity() {

    private val vm: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PlantillaTheme(dynamicColor = false) {
                Surface(modifier = Modifier.fillMaxSize()) {
                    val state = vm.state.collectAsState().value
                    UserScreen(state)
                }
            }
        }
    }
}