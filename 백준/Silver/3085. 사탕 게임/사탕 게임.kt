import java.io.BufferedReader
import kotlin.math.max

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val matrix = MutableList(n) { readLine().trim().toList().map(Char::toString).toMutableList() }
    var maxCandies = 1

    for (i in 0 until n) {
        for (j in 1 until n) {
            // 인접한 가로 방향의 사탕 교환
            swap(matrix, i, j, i, j - 1)
            maxCandies = max(maxCandies, count(matrix))
            // 다시 복구
            swap(matrix, i, j, i, j - 1)

            // 인접한 세로 방향의 사탕 교환
            swap(matrix, j, i, j - 1, i)
            maxCandies = max(maxCandies, count(matrix))
            // 다시 복구
            swap(matrix, j, i, j - 1, i)
        }
    }
    println(maxCandies)
}

fun swap(matrix: MutableList<MutableList<String>>, x1: Int, y1: Int, x2: Int, y2: Int) {
    val tempValue = matrix[x1][y1]
    matrix[x1][y1] = matrix[x2][y2]
    matrix[x2][y2] = tempValue
}

fun count(matrix: MutableList<MutableList<String>>) : Int {
    val n = matrix.size
    var max = 0

    for (i in 0 until n) {
        var count = 1
        for (j in 1 until n) {
            if (matrix[i][j] == matrix[i][j - 1]) {
                count++
            } else {
                max = maxOf(max, count)
                count = 1
            }
        }
        max = maxOf(max, count)
    }

    for (j in 0 until n) {
        var count = 1
        for (i in 1 until n) {
            if (matrix[i][j] == matrix[i - 1][j]) {
                count++
            } else {
                max = maxOf(max, count)
                count = 1
            }
        }
        max = maxOf(max, count)
    }
    return max
}
