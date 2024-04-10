import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val input = nextLine().trim().split(" ");
    println(
        if(input[0] == "") 0
        else input.size
    )
}
