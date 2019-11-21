import kotlin.test.assertEquals

/**
 * Created by aspanu on 2019-11-20.
 */
object EqualSidesOfAnArray {

    fun findEvenIndex(arr:IntArray):Int {
        var index = -1
        var left = 0
        var right = 0
        arr.forEach { right += it }
        var prevNum = -1

        for ((idx, num) in arr.withIndex()) {
            if (prevNum != -1) {
                left += prevNum
            }
            right -= num

            prevNum = num

            if (left == right) return idx
        }
        return index
    }
}

fun main(args: Array<String>) {
    assertEquals(3, EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 2, 3, 4, 3, 2, 1)))
    assertEquals(1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 100, 50, -51, 1, 1)))
    assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 2, 3, 4, 5, 6)))
    assertEquals(3, EqualSidesOfAnArray.findEvenIndex(intArrayOf(20, 10, 30, 10, 10, 15, 35)))
    assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(-8505, -5130, 1926, -9026)))
    assertEquals(1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(2824, 1774, -1490, -9084, -9696, 23094)))
    assertEquals(6, EqualSidesOfAnArray.findEvenIndex(intArrayOf(4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4)))
    assertEquals(0, EqualSidesOfAnArray.findEvenIndex(intArrayOf(20,10,-80,10,10,15,35)))
    assertEquals(6, EqualSidesOfAnArray.findEvenIndex(intArrayOf(35,15,10,10,-80,10,20)))
}
