package kveola13.jba

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


internal class CoffeeShopKtTest {
    private val cs = CoffeeStatus()

    @Test
    fun coffeeShopCurrentStatus() {
        assertEquals("The coffee machine has:\n" +
                "400 ml of water\n" +
                "540 ml of milk\n" +
                "120 grams of coffee beans\n" +
                "9 disposable cups\n" +
                "$550 of money", coffeeShopCurrentStatus(cs))
    }

    @Test
    fun takeAction() {
    }

    @Test
    fun purchaseEspresso() {
    }

    @Test
    fun purchaseCappuccino() {
    }
}