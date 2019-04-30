package com.example.commandpatterndemo.invoker

import android.util.Log
import com.example.commandpatterndemo.command.OrderCommand

class OrderCommandProcessor {
    private val listOfCommand= ArrayList<OrderCommand>()

    fun addToList(orderCommand: OrderCommand): OrderCommandProcessor = apply { listOfCommand.add(orderCommand) }
    fun processCommand(): String {
        var retu:String=""
        listOfCommand.forEach {
            val ret:String =it.execute()
            Log.d("TAG",ret)
            retu=retu+ret+"\n"
        }
        listOfCommand.clear()
        Log.d("TAG","retu:"+retu)
        return retu
    }
}