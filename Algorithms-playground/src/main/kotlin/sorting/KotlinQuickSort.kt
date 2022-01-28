package sorting

/** -------- WORST CASE SCENARIO ----------
 *
 * #Time complexity
 * O(nˆ2)
 *
 * #Space complexity
 * O(logN)
 */
class KotlinQuickSort {

    fun sorted(array: IntArray): IntArray {

        if (array.size < 2)
            return array

        //Time complexity O(1)
        val pivot = array[array.size / 2]

        //Time complexity O(n)
        //Space complexity O(n) (filter returns new list)
        val equalSide = array.filter { it == pivot }.toIntArray()

        //Time complexity O(n)
        //Space complexity O(n) (filter returns new list)
        val leftSide = array.filter { it < pivot }.toIntArray()

        //Time complexity O(n)
        //Space complexity O(n) (filter returns new list)
        val rightSide = array.filter { it > pivot }.toIntArray()

        //Time complexity O(3n + 1)  -> Drop constant => O(3n)  -> simplify linear (O(3n) = O(10n) = O(n) : Same behavior  ) => O(n)
        // BUT it's about recursion, so we have to add O(n)
        // Final result = O(n) X O(n) = O(nˆ2)
        return sorted(leftSide) + equalSide + sorted(rightSide)
    }
}