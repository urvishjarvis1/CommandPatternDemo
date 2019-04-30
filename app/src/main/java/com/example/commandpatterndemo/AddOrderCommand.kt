package com.example.commandpatterndemo

/**
 * This is Receiver Class for the Command design pattern
 */
class AddOrderCommand(val orderReceiver: OrderReceiver) : OrderCommand {
    override fun execute() = orderReceiver.makeOrder()

}