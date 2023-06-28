package com.wild.kotlin.machine

fun main() {
    val machine = CoffeeMachine(water = 400, milk = 540, coffeeBeans = 120, disposableCups = 9, money = 550)
    while (true) {
        println("Write action (buy, fill, take, remaining, exit):")
        val input = readln()
        if (input == "exit") {
            break
        }
        machine.processInput(input)
    }
}