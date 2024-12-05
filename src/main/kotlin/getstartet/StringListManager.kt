package getstartet

class StringListManager {


    private val stringBuilder = StringBuilder()
    private val stringList = mutableListOf<String>()

    fun addString(str: String) {
        stringBuilder.append(str)
        stringList.add(stringBuilder.toString())
    }

    fun getRemainingStringAfter(subStr: String): String? {
        val fullString = searchSubstring(subStr).toString()
        val index = fullString.indexOf(subStr)
        return if (index != -1) {
            fullString.substring(index + subStr.length)
        } else {
            null
        }
    }

    fun searchSubstring(subStr: String): Boolean {
        return stringList.any { it.contains(subStr) }
    }

    fun getFullString(): String {
        return stringBuilder.toString()
    }

    fun getAllStrings(): List<String> {
        return stringList
    }

}