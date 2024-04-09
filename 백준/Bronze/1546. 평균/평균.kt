import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val arr = ArrayList<Double>()

    repeat(n) {
        arr.add(nextDouble())
    }

    println(cal(arr))
}

fun cal(arr : ArrayList<Double>) : Double {
    val max = arr.max()
    return arr.map { it / max * 100 }.average()
}