package com.example.commandpatterndemo

import android.util.Log

class PaymentReceiver(val id: Long) : Receiver {
    override fun logOrder() {
        Log.d("TAG", "Payment made for id:$id")
    }

    fun makePayment() = "Payment made for Order id:$id".also { logOrder() }

}