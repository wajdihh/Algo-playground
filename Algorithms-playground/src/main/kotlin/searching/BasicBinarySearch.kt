package searching

/** -------- WORST CASE SCENARIO ----------
 *
 * #Time complexity
 * O(LogN)
 * for N = 16
 * log16 = 2ˆ4 -> Worst case 4 step
 *
 * #Space complexity
 * O(1)
 */
class BasicBinarySearch(private val sortedArray: IntArray, private val wantedValue: Int) {

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