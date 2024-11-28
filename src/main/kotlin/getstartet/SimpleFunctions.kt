package org.example.getstartet

class SimpleFunctions {

    /**
     * the following method returns a simple "OK"
     */
    fun helloWorld(): String {
        return "OK"
    }

    /**
     * method joinOptions
     *
     */
    fun joinOptions(vararg options: String): String {
        return options.joinToString(prefix = "[", postfix = "]")
    }

    fun foo(name: String, number: Int, toUpperCase: Boolean) =
        (if (toUpperCase) name.uppercase() else name) + number


}