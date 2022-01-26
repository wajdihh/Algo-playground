import searching.BinarySearch

fun main(args: Array<String>) {

    testBinarySearch()
}


fun testBinarySearch() {
    val sortedList = MY_ARRAY.sortedArray()

    val hasValue = BinarySearch(sortedList, 11).hasValue()

    println("isFound $hasValue")
}


val MY_ARRAY = arrayOf(1,3,6,11,4,9,0,2)