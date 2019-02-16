package com.anwesh.uiprojects.linkedlineopentocloseview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.lineopentocloseview.LineOpenToCloseView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view : LineOpenToCloseView = LineOpenToCloseView(this)
    }
}
