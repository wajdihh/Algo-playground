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

class KotlinBinarySearch {

    fun hasValue(sortedArray: IntArray, start: Int, end: Int, wantedValue: Int) : Boolean {

        if (start > end) return false

        // O(1)
        val center = (start + end) / 2

        if (sortedArray[center] == wantedValue) return true

        // take left
        if (sortedArray[center] > wantedValue)
            // O(LogN)
            return hasValue(sortedArray, start, center - 1, wantedValue)
        // take right
        else
            // O(LogN)
            return hasValue(sortedArray, center + 1, end, wantedValue)
    }
}