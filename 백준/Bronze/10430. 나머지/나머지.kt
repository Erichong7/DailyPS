import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val input = nextLine().trim().split(" ")
    val A = input[0].toInt()
    val B = input[1].toInt()
    val C = input[2].toInt()

    println((A + B) % C)
    println(((A % C) + (B % C)) % C)
    println((A * B) % C)
    print(((A % C) * (B%C)) % C)
}