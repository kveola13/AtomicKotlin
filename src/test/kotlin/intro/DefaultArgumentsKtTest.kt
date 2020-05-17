package intro

import kveola13.intro.defaultArguments
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DefaultArgumentsKtTest {

    @Test
    fun useArguments() {
        assertEquals("Ola26", defaultArguments("Ola", 26))
    }
}