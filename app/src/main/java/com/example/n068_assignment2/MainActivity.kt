
package com.example.n068_assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.n068_assignment2.ui.TodoScreen
import com.example.n068_assignment2.ui.theme.N068_Assignment2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            N068_Assignment2Theme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    TodoScreen()
                }
            }
        }
    }
}
