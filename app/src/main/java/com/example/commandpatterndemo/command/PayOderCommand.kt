package com.example.commandpatterndemo.command

import com.example.commandpatterndemo.receiver.PaymentReceiver

/**
 * This is Receiver Class for the Command design pattern
 */
class PayOderCommand(val paymentReceiver: PaymentReceiver) : OrderCommand {
    override fun execute() = paymentReceiver.makePayment()

}