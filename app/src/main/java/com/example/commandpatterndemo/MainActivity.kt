package com.example.commandpatterndemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.commandpatterndemo.command.AddOrderCommand
import com.example.commandpatterndemo.command.PayOderCommand
import com.example.commandpatterndemo.invoker.OrderCommandProcessor
import com.example.commandpatterndemo.receiver.OrderReceiver
import com.example.commandpatterndemo.receiver.PaymentReceiver

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ret = OrderCommandProcessor().addToList(
            AddOrderCommand(
                OrderReceiver(
                    100
                )
            )
        ).addToList(
            AddOrderCommand(
                OrderReceiver(300)
            )
        ).addToList(PayOderCommand(PaymentReceiver(300))).processCommand()
        Toast.makeText(this, ret, Toast.LENGTH_LONG).show()
    }
}
