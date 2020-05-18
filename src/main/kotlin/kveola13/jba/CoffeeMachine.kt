package kveola13.jba

import kotlin.math.min

fun printDesiredCoffee(amount: Int): String {
    val ingredients: List<Int> = makeCoffeeFromIngredients(amount)
    return "For $amount cups of coffee you will need:\n" +
            "${ingredients[0]} ml of water\n" +
            "${ingredients[1]} ml of milk\n" +
            "${ingredients[2]} g of coffee beans"
}

fun makeCoffeeFromIngredients(input: Int): List<Int> {
    return listOf(input * 200, input * 50, input * 15)
}

fun maxAmountOfCoffeeFromIngredients(ingredients: List<Int>): Int {
    val maxFromWater = ingredients[0] / 200
    val maxFromMilk = ingredients[1] / 50
    val maxFromBeans = ingredients[2] / 15
    return min(maxFromWater, min(maxFromMilk, maxFromBeans))
}

fun makeCoffeeFromDesiredAmountOfCups(amount: Int, ingredients: List<Int>): String {
    var returnText = ""
    val maximumCups = maxAmountOfCoffeeFromIngredients(ingredients)
    if (maximumCups >= amount) {
        returnText += "Yes. I can make that amount of coffee"
        if (maximumCups - amount > 0) {
            returnText += " (and even ${maximumCups - amount} more than that)"
        }
    } else {
        returnText = "No. I can make only $maximumCups cups of coffee"
    }
    return returnText
}

fun canMakeCoffeeFromIngredients() {
    print("Write how many ml of water the coffee machine has:")
    val waterInput = Integer.valueOf(readLine())
    print("$waterInput \n")
    print("Write how many ml of milk the coffee machine has:")
    val milkInput = Integer.valueOf(readLine())
    print("$milkInput \n")
    print("\"Write how many grams of coffee beans the coffee machine has:")
    val beanInput = Integer.valueOf(readLine())
    print("$beanInput \n")
    print("Write how many cups of coffee you will need:")
    val desiredCups = Integer.valueOf(readLine())
    print("$desiredCups \n")
    val curList = listOf(waterInput, milkInput, beanInput)
    println(makeCoffeeFromDesiredAmountOfCups(desiredCups, curList))
}

fun main() {
    canMakeCoffeeFromIngredients()
}