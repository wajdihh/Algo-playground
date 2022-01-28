package sorting

/** -------- WORST CASE SCENARIO ----------
 *
 * #Time complexity
 * O(Nˆ2)
 *
 * #Space complexity
 * O(LogN)
 */
class BasicQuickSort {

    fun sorted(array: IntArray, left: Int, right: Int): IntArray {

        if (array.size < 2)
            return  array

        // O(n)
        val index = partition (array, left, right)

        // O(LogN) (we divide / 2 the list) BUT IN WORST CASE SCENARIO THE PIVOT CAN BE FIX AND WE HAVE TO ITERATE ALL N VALUES => SO O(n)
        if(left < index -1) { // 2) Sorting left half
            sorted(array, left, index-1)
        }

        // O(LogN) (we divide / 2 the list) BUT IN WORST CASE SCENARIO THE PIVOT CAN BE FIX AND WE HAVE TO ITERATE ALL N VALUES => SO O(n)
        if(index < right) { // 3) Sorting right half
            sorted(array,index , right)
        }

        // O(n) [Of pivot & recursion] X O(n) [Partition function] = O(Nˆ2)
        return array
    }

    /**
     * O(n)
     */
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