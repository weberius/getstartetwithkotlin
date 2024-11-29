package getstartet

class CustomerOperations {

    var customers: Int = 0

    fun setCustomers(count: Int) {
        customers = count
    }

    fun addCustomers(count: Int) {
        customers += count
    }

    fun subtractCustomers(count: Int) {
        customers -= count
    }

    fun multiplyCustomers(factor: Int) {
        customers *= factor
    }

    fun divideCustomers(divisor: Int) {
        customers /= divisor
    }

    fun getCustomers(): Int {
        return customers
    }

}