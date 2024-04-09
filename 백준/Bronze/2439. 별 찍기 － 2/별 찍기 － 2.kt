import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()

    for (i in 1..n) {
        for (j in n downTo 1) {
            print(
                if(i >= j) "*"
                else " "
            )
        }
        println()
    }
}