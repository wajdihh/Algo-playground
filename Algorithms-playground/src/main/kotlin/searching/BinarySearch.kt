package searching

class BinarySearch(private val sortedArray: Array<Int>, private val wantedValue: Int) {

    fun hasValue(): Boolean {

        var index = 0
        var end = sortedArray.size - 1

        while (index <= end) {

            val center = (index + end) / 2
            val centerValue = sortedArray[center]

            if (centerValue == wantedValue) {
                return true
            }

            if (centerValue > wantedValue) {
                // Take left
                end = center - 1
            } else {
                // Take right
                index = center + 1
            }
        }

        return false
    }
}