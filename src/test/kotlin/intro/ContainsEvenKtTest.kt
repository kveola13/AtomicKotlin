package intro

import kveola13.intro.containsEven
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ContainsEvenKtTest {

    @Test
    fun containsEvenTest() {
        val collection: Collection<Int> = listOf(1, 2, 3)
        assertTrue(containsEven(collection))
    }
    @Test
    fun containsNoEvenTest(){
        val collection: Collection<Int> = listOf(1, 3)
        assertFalse(containsEven(collection))
    }
}