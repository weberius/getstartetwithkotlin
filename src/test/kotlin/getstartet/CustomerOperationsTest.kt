package getstartet

import kotlin.test.Test
import kotlin.test.assertEquals

class CustomerOperationsTest {

    @Test
    fun testCustomerOperations() {
        val operations = CustomerOperations()

        operations.setCustomers(10)
        assertEquals(10, operations.getCustomers())

        operations.setCustomers(8)
        assertEquals(8, operations.getCustomers())

        operations.addCustomers(3)
        assertEquals(11, operations.getCustomers())

        operations.addCustomers(7)
        assertEquals(18, operations.getCustomers())

        operations.subtractCustomers(3)
        assertEquals(15, operations.getCustomers())

        operations.multiplyCustomers(2)
        assertEquals(30, operations.getCustomers())

        operations.divideCustomers(3)
        assertEquals(10, operations.getCustomers())
    }
}