package com.example.commandpatterndemo

class AddOrderCommand(val id:Long) : OrderCommand{
    override fun execute()="Order added for $id"

}