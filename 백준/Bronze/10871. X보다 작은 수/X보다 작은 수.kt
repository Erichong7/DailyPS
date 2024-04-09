import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val x = nextInt()
    val arr = ArrayList<Int>()

    repeat(n) {
        arr.add(nextInt())
    }

    arr.filter { it < x }
        .forEach { print("$it ") }
}