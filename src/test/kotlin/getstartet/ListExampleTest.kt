package getstartet

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ListExampleTest {

    @Test
    fun testListCreation() {
        val list = listOf("a", "b", "c")
        assertEquals(3, list.size)
        assertEquals("a", list[0])
        assertEquals("b", list[1])
        assertEquals("c", list[2])
    }

    @Test
    fun testListContains() {
        val list = listOf("a", "b", "c")
        assertTrue(list.contains("a"))
        assertTrue(list.contains("b"))
        assertTrue(list.contains("c"))
    }

    @Test
    fun testListAdd() {
        val mutableList = mutableListOf("a", "b")
        mutableList.add("c")
        assertEquals(3, mutableList.size)
        assertEquals("c", mutableList[2])
    }

    @Test
    fun testListRemove() {
        val mutableList = mutableListOf("a", "b", "c")
        mutableList.remove("b")
        assertEquals(2, mutableList.size)
        assertEquals("a", mutableList[0])
        assertEquals("c", mutableList[1])
    }
}