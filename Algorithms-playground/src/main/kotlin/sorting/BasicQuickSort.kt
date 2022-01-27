package sorting

/** -------- WORST CASE SCENARIO ----------
 *
 * #Time complexity
 * O(Nˆ2)
 *
 * #Space complexity
 * O(N)
 */
class BasicQuickSort {

    fun sorted(array: IntArray, left: Int, right: Int): IntArray {
        val index = partition (array, left, right)

        if(left < index -1) { // 2) Sorting left half
            sorted(array, left, index-1)
        }
        if(index < right) { // 3) Sorting right half
            sorted(array,index , right)
        }

        return array
    }

    private fun partition(array: IntArray, l: Int, r: Int): Int {
        var left = l
        var right = r
        val pivot = array[(left + right)/2]

        while (left <= right) {

            while (array[left] < pivot) left ++

            while (array[right] > pivot) right --

            if (left <= right) {
                swapArray(array, left, right)
                left ++
                right --
            }
        }

        return left
    }

    private fun swapArray(a: IntArray, b: Int, c: Int) {
        val temp = a[b]
        a[b] = a[c]
        a[c] = temp
    }
}