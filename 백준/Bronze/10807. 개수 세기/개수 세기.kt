import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val array : Array<Int> = Array(n) { -1 }

    repeat(n) {
        array[it] = nextInt()
    }

    val v = nextInt()
    var count = 0
    array.forEach {
        if(it == v) count++
    }
    println(count)
}