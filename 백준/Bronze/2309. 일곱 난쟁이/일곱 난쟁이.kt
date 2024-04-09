import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val height = Array(9) { 0 }
    repeat(9) {
        height[it] = br.readLine().toInt()
    }
    height.sort()
    val sum = height.sum()
    var criminal1 = -1
    var criminal2 = -1
    var isFinish = false;

    for (i in 0 until 9) {
        for (j in 0 until 9) {
            if (i == j) {
                continue
            }

            val totalHeight = sum - height[i] - height[j]
            if (totalHeight == 100) {
                criminal1 = i
                criminal2 = j
                isFinish = true
            }
        }
        if (isFinish) {
            break
        }
    }

    repeat(9) {
        if (it != criminal1 && it != criminal2) {
            println(height[it])
        }
    }
}