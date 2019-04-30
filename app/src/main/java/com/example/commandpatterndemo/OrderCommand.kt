package com.example.commandpatterndemo

interface OrderCommand {
    fun execute(): String;
}