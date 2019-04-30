package com.example.commandpatterndemo

/**
 * This is Command Interface of the Command design pattern
 *
 */
interface OrderCommand {
    fun execute(): String
}