package com.example.commandpatterndemo.command

/**
 * This is Command Interface of the Command design pattern
 *
 */
interface OrderCommand {
    fun execute(): String
}