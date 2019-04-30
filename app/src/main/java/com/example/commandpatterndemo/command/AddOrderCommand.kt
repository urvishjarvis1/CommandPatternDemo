package com.example.commandpatterndemo.command

import com.example.commandpatterndemo.receiver.OrderReceiver

/**
 * This is Receiver Class for the Command design pattern
 */
class AddOrderCommand(val orderReceiver: OrderReceiver) : OrderCommand {
    override fun execute() = orderReceiver.makeOrder()

}