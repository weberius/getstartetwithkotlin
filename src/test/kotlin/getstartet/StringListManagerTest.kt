package getstartet

import java.util.UUID
import kotlin.test.*

class StringListManagerTest {

    private lateinit var manager: StringListManager
    private lateinit var uuid: String
    private var myNumber: Int = 0

    @BeforeTest
    fun setup() {
        manager = StringListManager()
        uuid = UUID.randomUUID().toString()
        myNumber = 123456
    }

    @Test
    fun testAddString() {
        manager.addString(uuid)
        assertEquals(listOf(uuid), manager.getAllStrings())
    }

    @Test
    fun testSearchSubstring() {
        val manager = StringListManager()
        manager.addString(uuid)
        manager.addString(myNumber.toString())
        assertTrue(manager.searchSubstring(uuid))
        assertTrue(manager.searchSubstring(myNumber.toString()))
        assertTrue(manager.searchSubstring(uuid))
        assertFalse(manager.searchSubstring("test"))
    }

    @Test
    fun testGetFullString() {
        val manager = StringListManager()
        manager.addString(uuid)
        manager.addString(myNumber.toString())
        assertEquals(uuid+myNumber.toString(), manager.getFullString())
    }

    @Test
    fun testGetAllStrings() {
        val manager = StringListManager()
        manager.addString("hello")
        manager.addString("world")
        assertEquals(listOf("hello", "helloworld"), manager.getAllStrings())
    }
}