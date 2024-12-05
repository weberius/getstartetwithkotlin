package getstartet

import kotlin.test.Test
import kotlin.test.assertEquals

public class SimpleFunctionsTest {

    /**
     * Test for the function helloWorld returns 'OK'
     */
    @Test
    fun testHelloWorld() {
        val simpleFunctions = SimpleFunctions()
        assertEquals("OK", simpleFunctions.helloWorld())
    }

    /**
     * Make the function joinOptions() return the list in a JSON format (for example, [a, b, c]) by specifying only two arguments.
     */
    @Test
    fun testJoinOptions() {
        val simpleFunctions = SimpleFunctions()
        assertEquals("[a, b, c]", simpleFunctions.joinOptions("a", "b", "c"))
    }

}

