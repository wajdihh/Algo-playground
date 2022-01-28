package sorting

/** -------- WORST CASE SCENARIO ----------
 *
 * #Time complexity
 * O(nLogN)
 *
 * #Space complexity
 * O(N)
 */

class BasicMergeSort {

    fun sorted(array: IntArray): IntArray {

        if(array.size < 2)
            return array

        val center = array.size / 2

        // O(n)
        val leftArray = array.copyOfRange(0, center)
        // O(n)
        val rightArray = array.copyOfRange(center, array.size)

        // O(LogN) (we divide / 2 the list)
        val leftRecursionArray = sorted(leftArray)
        // O(LogN)
        val rightRecursionArray = sorted(rightArray)

        // O(n)
        return merge(leftRecursionArray, rightRecursionArray)
        // (O(n) + O(n) + O(n)) x (O(LogN) + O(LogN)) =  O(nLogN)
    }

    /**
     * O(n)
     */
    private fun merge(leftArray: IntArray, rightArray: IntArray): IntArray {

        val temp = IntArray(leftArray.size + rightArray.size)
        var k = 0
        var indexLeft = 0
        var indexRight = 0

        // O(n)
        while (indexLeft < leftArray.size && indexRight < rightArray.size) {
            if (leftArray[indexLeft] <= rightArray[indexRight]) {
                temp[k] = leftArray[indexLeft]
                k ++
                indexLeft ++
            } else {
                temp[k] = rightArray[indexRight]
                k ++
                indexRight ++
            }
        }

        // O(n)
        while (indexLeft < leftArray.size) {
            temp[k] = leftArray[indexLeft]
            k ++
            indexLeft ++
        }

        // O(n)
        while (indexRight < rightArray.size) {
            temp[k] = rightArray[indexRight]
            k ++
            indexRight ++
        }

        return temp
    }
}