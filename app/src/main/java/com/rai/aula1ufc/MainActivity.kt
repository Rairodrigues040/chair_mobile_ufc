package com.rai.aula1ufc

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rai.aula1ufc.ui.theme.Aula1UFCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("OnCreate", "OnCreate em ação")
    }

    override fun onStart() {
        super.onStart()
        Log.d("OnStart", "OnStart em ação")
    }

    override fun onResume() {
        super.onResume()
        Log.d("OnResume", "OnResume em ação")
    }

    override fun onPause() {
        super.onPause()
        Log.d("OnPause", "OnPause em ação")
    }

    override fun onStop() {
        super.onStop()
        Log.d("OnStop", "OnStop em ação")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("OnDestroy", "OnDestroy em ação")
    }
}

