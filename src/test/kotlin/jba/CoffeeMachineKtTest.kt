package jba

import kveola13.jba.makeCoffeeFromDesiredAmountOfCups
import kveola13.jba.makeCoffeeFromIngredients
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CoffeeMachineKtTest {

    @Test
    fun makeCoffeeFromIngredientsTest() {
        val done: List<Int> = listOf(5000, 1250, 375)
        assertEquals(done, makeCoffeeFromIngredients(25))
    }

    @Test
    fun makeCoffeeFromIngredientsTest2() {
        val done: List<Int> = listOf(25000, 6250, 1875)
        assertEquals(done, makeCoffeeFromIngredients(125))
    }

    @Test
    fun makeCoffeeFromDesiredAmountOfCupsTest() {
        val done: List<Int> = listOf(300, 65, 100)
        assertEquals("Yes. I can make that amount of coffee", makeCoffeeFromDesiredAmountOfCups(1, done))
    }

    @Test
    fun makeCoffeeFromDesiredAmountOfCupsTest2() {
        val done: List<Int> = listOf(500, 250, 200)
        assertEquals("No. I can make only 2 cups of coffee", makeCoffeeFromDesiredAmountOfCups(10, done))
    }

    @Test
    fun makeCoffeeFromDesiredAmountOfCupsTest3() {
        val done: List<Int> = listOf(1500, 299, 300)
        assertEquals("Yes. I can make that amount of coffee (and even 2 more than that)", makeCoffeeFromDesiredAmountOfCups(3, done))
    }

    @Test
    fun makeCoffeeFromDesiredAmountOfCupsTest4() {
        val done: List<Int> = listOf(0, 0, 0)
        assertEquals("No. I can make only 0 cups of coffee", makeCoffeeFromDesiredAmountOfCups(1, done))
    }

    @Test
    fun makeCoffeeFromDesiredAmountOfCupsTest5() {
        val done: List<Int> = listOf(0, 0, 0)
        assertEquals("Yes. I can make that amount of coffee", makeCoffeeFromDesiredAmountOfCups(0, done))
    }

    @Test
    fun makeCoffeeFromDesiredAmountOfCupsTest6() {
        val done: List<Int> = listOf(200, 50, 15)
        assertEquals("Yes. I can make that amount of coffee (and even 1 more than that)", makeCoffeeFromDesiredAmountOfCups(0, done))
    }
}