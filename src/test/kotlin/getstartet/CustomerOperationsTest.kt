package getstartet

import kotlin.test.Test
import kotlin.test.assertEquals

class CustomerOperationsTest {

    @Test
    fun testCustomerOperations() {
        val operations = CustomerOperations()

        operations.updateCustomerCount(10)
        assertEquals(10, operations.customers)

        operations.updateCustomerCount(8)
        assertEquals(8, operations.customers)

        operations.addCustomers(3)
        assertEquals(11, operations.customers)

        operations.addCustomers(7)
        assertEquals(18, operations.customers)

        operations.subtractCustomers(3)
        assertEquals(15, operations.customers)

        operations.multiplyCustomers(2)
        assertEquals(30, operations.customers)

        operations.divideCustomers(3)
        assertEquals(10, operations.customers)
    }
}