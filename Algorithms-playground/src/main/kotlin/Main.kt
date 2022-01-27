import helper.showContent
import searching.BasicBinarySearch
import searching.KotlinBinarySearch
import sorting.BasicQuickSort

fun main(args: Array<String>) {

    //testBinarySearch()
    testQuickSort()
}


fun testBinarySearch() {
    val sortedList = MY_ARRAY.sortedArray()

    //Basic Way
    //val hasValue = BasicBinarySearch(sortedList, 11).hasValue()

    //Kotlin Way
    val hasValue = KotlinBinarySearch().hasValue(sortedList, 0, sortedList.size - 1, -7)

    println("isFound $hasValue")
}

fun testQuickSort() {

    //Basic Way
    val orderedList = BasicQuickSort().sorted(MY_ARRAY, 0, MY_ARRAY.size - 1)

    //Kotlin Way
    //val orderedList = KotlinQuickSort().sorted(MY_ARRAY)

    orderedList.showContent()
}

val MY_ARRAY = intArrayOf(1,3,6,11,4,9,0,2,8,1,-7,7)