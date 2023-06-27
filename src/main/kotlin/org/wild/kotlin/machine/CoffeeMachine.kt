package org.wild.kotlin.machine

class CoffeeMachine(
    private var water: Int,
    private var milk: Int,
    private var coffeeBeans: Int,
    private var disposableCups: Int,
    private var money: Int
) {
    fun processInput(input: String) {
        when (input) {
            "buy" -> buyCoffee()
            "fill" -> fillSupplies()
            "take" -> takeMoney()
            "remaining" -> printMachineState()
            "exit" -> return
            else -> println("Invalid action!")
        }
        println()
    }

    private fun buyCoffee() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
        when (readln()) {
            "back" -> return
            "1" -> {
                val waterNeeded = 250
                val coffeeBeansNeeded = 16
                val cost = 4
                if (water < waterNeeded) {
                    println("Sorry, not enough water!")
                    return
                }
                if (coffeeBeans < coffeeBeansNeeded) {
                    println("Sorry, not enough coffee beans!")
                    return
                }
                println("I have enough resources, making you a coffee!")
                water -= waterNeeded
                coffeeBeans -= coffeeBeansNeeded
                money += cost
                disposableCups--
            }
            "2" -> {
                val waterNeeded = 350
                val milkNeeded = 75
                val coffeeBeansNeeded = 20
                val cost = 7
                if (water < waterNeeded) {
                    println("Sorry, not enough water!")
                    return
                }
                if (milk < milkNeeded) {
                    println("Sorry, not enough milk!")
                    return
                }
                if (coffeeBeans < coffeeBeansNeeded) {
                    println("Sorry, not enough coffee beans!")
                    return
                }
                println("I have enough resources, making you a coffee!")
                water -= waterNeeded
                milk -= milkNeeded
                coffeeBeans -= coffeeBeansNeeded
                money += cost
                disposableCups--
            }
            "3" -> {
                val waterNeeded = 200
                val milkNeeded = 100
                val coffeeBeansNeeded = 12
                val cost = 6
                if (water < waterNeeded) {
                    println("Sorry, not enough water!")
                    return
                }
                if (milk < milkNeeded) {
                    println("Sorry, not enough milk!")
                    return
                }
                if (coffeeBeans < coffeeBeansNeeded) {
                    println("Sorry, not enough coffee beans!")
                    return
                }
                println("I have enough resources, making you a coffee!")
                water -= waterNeeded
                milk -= milkNeeded
                coffeeBeans -= coffeeBeansNeeded
                money += cost
                disposableCups--
            }
            else -> println("Invalid coffee type!")
        }
    }

    private fun fillSupplies() {
        println("Write how many ml of water you want to add:")
        val addedWater = readln().toInt()
        println("Write how many ml of milk you want to add:")
        val addedMilk = readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        val addedCoffeeBeans = readln().toInt()
        println("Write how many disposable cups you want to add:")
        val addedCups = readln().toInt()
        water += addedWater
        milk += addedMilk
        coffeeBeans += addedCoffeeBeans
        disposableCups += addedCups
    }

    private fun takeMoney() {
        println("I gave you $$money")
        money = 0
    }

    private fun printMachineState() {
        println("The coffee machine has:")
        println("$water ml of water")
        println("$milk ml of milk")
        println("$coffeeBeans g of coffee beans")
        println("$disposableCups disposable cups")
        println("$$money of money")
    }
}