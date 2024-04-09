import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val num1 = nextInt()
    val num2 = nextInt()

    println(num2 % 10 * num1)
    println(((num2 % 100) / 10) * num1)
    println(num2 / 100 * num1)
    println(num1 * num2)
}