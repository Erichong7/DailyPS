import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var n = nextInt()
    var count = 0

    while(true) {
        if(n % 5 == 0) {
            println("${n / 5 + count}")
            break
        } else if (n <= 0) {
            println(-1)
            break
        }
        n -= 3
        count++
    }
}
