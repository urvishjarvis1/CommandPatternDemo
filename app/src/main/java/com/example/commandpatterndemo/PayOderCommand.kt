package com.example.commandpatterndemo

class PayOderCommand(val id:Long):OrderCommand{
    override fun execute()="Payment made for Order id:$id"

}