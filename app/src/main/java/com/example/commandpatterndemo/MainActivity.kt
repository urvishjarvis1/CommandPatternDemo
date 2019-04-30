package com.example.commandpatterndemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ret=OrderCommandProcessor().addToList(AddOrderCommand(100L)).addToList(AddOrderCommand(300L)).addToList(PayOderCommand(300L)).processCommand()
        Toast.makeText(this,ret,Toast.LENGTH_LONG).show()
    }
}
