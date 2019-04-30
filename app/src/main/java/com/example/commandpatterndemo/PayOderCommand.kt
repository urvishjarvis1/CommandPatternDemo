package com.example.commandpatterndemo

/**
 * This is Receiver Class for the Command design pattern
 */
class PayOderCommand(val paymentReceiver: PaymentReceiver) : OrderCommand {
    override fun execute() = paymentReceiver.makePayment()

}