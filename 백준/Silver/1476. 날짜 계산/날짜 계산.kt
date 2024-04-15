import java.io.BufferedReader
import kotlin.math.max

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (E, S, M) = readLine().trim().split(" ").map { it.toInt() }
    var e = 1
    var s = 1
    var m = 1
    var answer = 1
    while (true) {
        if (e == E && s == S && m == M) break;
        e++
        s++
        m++
        answer++
        if (e > 15) e = 1
        if (s > 28) s = 1
        if (m > 19) m = 1
    }

    println(answer)
}
