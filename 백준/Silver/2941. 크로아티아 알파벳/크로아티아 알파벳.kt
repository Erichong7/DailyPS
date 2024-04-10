import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var input = nextLine()
    val arr = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    arr.forEach {
        input = input.replace(it, "!")
    }

    println(input.length)
}
