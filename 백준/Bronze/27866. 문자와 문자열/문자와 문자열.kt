import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val input = nextLine().trim().toCharArray()
    val n = nextInt()
    
    println(input[n - 1])
}
