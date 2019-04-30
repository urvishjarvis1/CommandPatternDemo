package com.example.commandpatterndemo.receiver

import android.util.Log

class OrderReceiver(val id: Long) : Receiver {
    override fun logOrder() {
        Log.d("TAG", "Order made for id:$id")
    }

    fun makeOrder() = "Order added for $id".also { logOrder() }

}